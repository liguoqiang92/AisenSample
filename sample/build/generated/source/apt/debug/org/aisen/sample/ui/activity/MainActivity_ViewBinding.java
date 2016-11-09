// Generated code from Butter Knife. Do not modify!
package org.aisen.sample.ui.activity;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v4.widget.DrawerLayout;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.example.aisensample.R;
import java.lang.IllegalStateException;
import java.lang.Override;
import org.aisen.wen.ui.widget.FitWindowsFrameLayout;

public class MainActivity_ViewBinding<T extends MainActivity> implements Unbinder {
  protected T target;

  @UiThread
  public MainActivity_ViewBinding(T target, View source) {
    this.target = target;

    target.mDrawerLayout = Utils.findRequiredViewAsType(source, R.id.drawer, "field 'mDrawerLayout'", DrawerLayout.class);
    target.mainContent = Utils.findRequiredViewAsType(source, R.id.layMainContent, "field 'mainContent'", FitWindowsFrameLayout.class);
    target.mainRoot = Utils.findRequiredViewAsType(source, R.id.layMainRoot, "field 'mainRoot'", FitWindowsFrameLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.mDrawerLayout = null;
    target.mainContent = null;
    target.mainRoot = null;

    this.target = null;
  }
}
