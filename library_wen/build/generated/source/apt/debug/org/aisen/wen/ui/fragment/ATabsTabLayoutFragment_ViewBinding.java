// Generated code from Butter Knife. Do not modify!
package org.aisen.wen.ui.fragment;

import android.support.annotation.UiThread;
import android.support.design.widget.TabLayout;
import android.view.View;
import butterknife.internal.Utils;
import java.lang.Override;
import org.aisen.wen.R;

public class ATabsTabLayoutFragment_ViewBinding<T extends ATabsTabLayoutFragment> extends ATabsFragment_ViewBinding<T> {
  @UiThread
  public ATabsTabLayoutFragment_ViewBinding(T target, View source) {
    super(target, source);

    target.mTabLayout = Utils.findRequiredViewAsType(source, R.id.tabLayout, "field 'mTabLayout'", TabLayout.class);
  }

  @Override
  public void unbind() {
    T target = this.target;
    super.unbind();

    target.mTabLayout = null;
  }
}
