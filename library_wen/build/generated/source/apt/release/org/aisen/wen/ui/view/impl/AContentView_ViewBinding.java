// Generated code from Butter Knife. Do not modify!
package org.aisen.wen.ui.view.impl;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import org.aisen.wen.R;

public class AContentView_ViewBinding<T extends AContentView> implements Unbinder {
  protected T target;

  @UiThread
  public AContentView_ViewBinding(T target, View source) {
    this.target = target;

    target.loadingLayout = Utils.findRequiredView(source, R.id.layoutLoading, "field 'loadingLayout'");
    target.loadFailureLayout = Utils.findRequiredView(source, R.id.layoutLoadFailed, "field 'loadFailureLayout'");
    target.contentLayout = Utils.findRequiredView(source, R.id.layoutContent, "field 'contentLayout'");
    target.emptyLayout = Utils.findRequiredView(source, R.id.layoutEmpty, "field 'emptyLayout'");
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.loadingLayout = null;
    target.loadFailureLayout = null;
    target.contentLayout = null;
    target.emptyLayout = null;

    this.target = null;
  }
}
