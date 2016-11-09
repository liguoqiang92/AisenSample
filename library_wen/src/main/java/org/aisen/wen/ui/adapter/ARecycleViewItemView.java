package org.aisen.wen.ui.adapter;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import org.aisen.wen.ui.itemview.IITemView;

import java.io.Serializable;

import butterknife.ButterKnife;

/**
 * Created by wangdan on 16/1/5.
 */
public abstract class ARecycleViewItemView<T extends Serializable> extends RecyclerView.ViewHolder implements IITemView<T> {

    private int size;

    private int position;

    private final View convertView;

    private final Activity context;

    public ARecycleViewItemView(Activity context, View itemView) {
        super(itemView);

        this.context = context;
        this.convertView = itemView;
    }

    @Override
    public void onBindView(View convertView) {
        ButterKnife.bind(this, convertView);
    }

    @Override
    public void reset(int size, int position) {
        this.size = size;
        this.position = position;
    }

    @Override
    public int itemSize() {
        return size;
    }

    @Override
    public int itemPosition() {
        return position;
    }

    @Override
    public View getConvertView() {
        return convertView;
    }

    public Activity getContext() {
        return context;
    }

}
