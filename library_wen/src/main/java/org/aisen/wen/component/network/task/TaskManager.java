package org.aisen.wen.component.network.task;

import android.os.Bundle;
import android.text.TextUtils;

import org.aisen.wen.support.utils.Logger;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;

public class TaskManager implements ITaskManager {
	
	static final String TAG = "TaskManager";

	private LinkedHashMap<String, WeakReference<IWorkTask>> taskCache;
	private HashMap<String, Integer> taskCountMap;

	public TaskManager() {
		taskCountMap = new HashMap<>();
		taskCache = new LinkedHashMap<>();
	}

	@Override
	public void addTask(IWorkTask task) {
		if (task != null && !TextUtils.isEmpty(task.getTaskId())) {
			int count = taskCountMap.keySet().contains(task.getTaskId()) ? taskCountMap.get(task.getTaskId()) : 0;
			taskCountMap.put(task.getTaskId(), ++count);
			cancelExistTask(task.getTaskId(), true);

			taskCache.put(task.getTaskId(), new WeakReference<>(task));

			Logger.d(TAG, String.format("addTask() --->%s", task.getTaskId()));
		}
	}

	@Override
	public void removeTask(String taskId, boolean cancelIfRunning) {
		cancelExistTask(taskId, cancelIfRunning);
	}

	@Override
	public void removeAllTask(boolean mayInterruptIfRunning) {
		Set<String> keySet = taskCache.keySet();
		for (String key : keySet) {
			IWorkTask task = getTaskById(key);
			if (task != null)
				task.cancel(mayInterruptIfRunning);
		}
		taskCache.clear();
	}

	private void cancelExistTask(String taskId, boolean mayInterruptIfRunning) {
		IWorkTask existTask = getTaskById(taskId);

		if (existTask != null)
			Logger.d(TAG, String.format("interrupt exist task --->%s", taskId));

		if (existTask != null)
			existTask.cancel(mayInterruptIfRunning);

		taskCache.remove(taskId);
	}

	private IWorkTask getTaskById(String taskId) {
		WeakReference<IWorkTask> existTaskRef = taskCache.get(taskId);
		if (existTaskRef != null)
			return existTaskRef.get();
		return null;
	}

	@Override
	public int getTaskCount(String taskId) {
		if(TextUtils.isEmpty(taskId))
			return 0;
		
		return taskCountMap.keySet().contains(taskId) ? taskCountMap.get(taskId) : 0;
	}
	
	public void clearTaskCount(String taskId) {
		if(!TextUtils.isEmpty(taskId))
			taskCountMap.remove(taskId);
	}
	
	public void save(Bundle outState) {
		outState.putSerializable("map", taskCountMap);
	}
	
	public void restore(Bundle savedInstanceState) {
		if (savedInstanceState != null && savedInstanceState.getSerializable("map") != null) {
			taskCountMap = (HashMap<String, Integer>) savedInstanceState.getSerializable("map");
		}
	}

}