package org.aisen.wen.component.network.task;

public interface ITaskManager {

	void addTask(IWorkTask task);

	void removeTask(String taskId, boolean cancelIfRunning);

	void removeAllTask(boolean cancelIfRunning);
	
	int getTaskCount(String taskId);

	void clearTaskCount(String taskId);

}
