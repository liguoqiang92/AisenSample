// Generated code from Butter Knife. Do not modify!
package org.aisen.wen.ui.fragment;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v4.view.ViewPager;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import org.aisen.wen.R;

public class ATabsFragment_ViewBinding<T extends ATabsFragment> implements Unbinder {
  protected T target;

  @UiThread
  public ATabsFragment_ViewBinding(T target, View source) {
    this.target = target;

    target.mViewPager = Utils.findRequiredViewAsType(source, R.id.viewPager, "field 'mViewPager'", ViewPager.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.mViewPager = null;

    this.target = null;
  }
}
