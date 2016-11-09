// Generated code from Butter Knife. Do not modify!
package org.aisen.sample.ui.fragment;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.example.aisensample.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class BaseFragmentView$RecycleViewItemView_ViewBinding<T extends BaseFragmentView.RecycleViewItemView> implements Unbinder {
  protected T target;

  @UiThread
  public BaseFragmentView$RecycleViewItemView_ViewBinding(T target, View source) {
    this.target = target;

    target.txtTitle = Utils.findRequiredViewAsType(source, R.id.txtTitle, "field 'txtTitle'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.txtTitle = null;

    this.target = null;
  }
}
