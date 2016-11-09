// Generated code from Butter Knife. Do not modify!
package org.aisen.wen.ui.view.impl;

import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ListView;
import butterknife.internal.Utils;
import java.lang.Override;
import org.aisen.wen.R;

public class AListView_ViewBinding<T extends AListView> extends AContentView_ViewBinding<T> {
  @UiThread
  public AListView_ViewBinding(T target, View source) {
    super(target, source);

    target.mListView = Utils.findRequiredViewAsType(source, R.id.listView, "field 'mListView'", ListView.class);
  }

  @Override
  public void unbind() {
    T target = this.target;
    super.unbind();

    target.mListView = null;
  }
}
