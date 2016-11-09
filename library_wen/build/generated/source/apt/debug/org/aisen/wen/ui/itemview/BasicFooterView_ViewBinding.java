// Generated code from Butter Knife. Do not modify!
package org.aisen.wen.ui.itemview;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import org.aisen.wen.R;

public class BasicFooterView_ViewBinding<T extends BasicFooterView> implements Unbinder {
  protected T target;

  @UiThread
  public BasicFooterView_ViewBinding(T target, View source) {
    this.target = target;

    target.btnMore = Utils.findRequiredViewAsType(source, R.id.btnMore, "field 'btnMore'", TextView.class);
    target.layLoading = Utils.findRequiredView(source, R.id.layLoading, "field 'layLoading'");
    target.txtLoading = Utils.findRequiredViewAsType(source, R.id.txtLoading, "field 'txtLoading'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.btnMore = null;
    target.layLoading = null;
    target.txtLoading = null;

    this.target = null;
  }
}
