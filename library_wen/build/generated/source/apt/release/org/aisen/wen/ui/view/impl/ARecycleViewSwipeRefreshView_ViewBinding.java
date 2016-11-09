// Generated code from Butter Knife. Do not modify!
package org.aisen.wen.ui.view.impl;

import android.support.annotation.UiThread;
import android.support.v4.widget.SwipeRefreshLayout;
import android.view.View;
import butterknife.internal.Utils;
import java.lang.Override;
import org.aisen.wen.R;

public class ARecycleViewSwipeRefreshView_ViewBinding<T extends ARecycleViewSwipeRefreshView> extends ARecycleView_ViewBinding<T> {
  @UiThread
  public ARecycleViewSwipeRefreshView_ViewBinding(T target, View source) {
    super(target, source);

    target.swipeRefreshLayout = Utils.findRequiredViewAsType(source, R.id.swipeRefreshLayout, "field 'swipeRefreshLayout'", SwipeRefreshLayout.class);
  }

  @Override
  public void unbind() {
    T target = this.target;
    super.unbind();

    target.swipeRefreshLayout = null;
  }
}
