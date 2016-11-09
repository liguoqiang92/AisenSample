// Generated code from Butter Knife. Do not modify!
package org.aisen.wen.ui.view.impl;

import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import butterknife.internal.Utils;
import java.lang.Override;
import org.aisen.wen.R;

public class ARecycleView_ViewBinding<T extends ARecycleView> extends AContentView_ViewBinding<T> {
  @UiThread
  public ARecycleView_ViewBinding(T target, View source) {
    super(target, source);

    target.mRecycleView = Utils.findRequiredViewAsType(source, R.id.recycleview, "field 'mRecycleView'", RecyclerView.class);
  }

  @Override
  public void unbind() {
    T target = this.target;
    super.unbind();

    target.mRecycleView = null;
  }
}
