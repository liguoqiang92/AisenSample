// Generated code from Butter Knife. Do not modify!
package org.aisen.wen.ui.view.impl;

import android.support.annotation.UiThread;
import android.view.View;
import android.widget.GridView;
import butterknife.internal.Utils;
import java.lang.Override;
import org.aisen.wen.R;

public class AGridView_ViewBinding<T extends AGridView> extends AContentView_ViewBinding<T> {
  @UiThread
  public AGridView_ViewBinding(T target, View source) {
    super(target, source);

    target.gridView = Utils.findRequiredViewAsType(source, R.id.gridview, "field 'gridView'", GridView.class);
  }

  @Override
  public void unbind() {
    T target = this.target;
    super.unbind();

    target.gridView = null;
  }
}
