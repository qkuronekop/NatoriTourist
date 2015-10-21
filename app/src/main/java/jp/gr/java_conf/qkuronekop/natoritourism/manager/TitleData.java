package jp.gr.java_conf.qkuronekop.natoritourism.manager;

import android.content.Context;
import jp.gr.java_conf.qkuronekop.natoritourism.R;
import jp.gr.java_conf.qkuronekop.natoritourism.table.Scenario;

/**
 * タイトル(シナリオ)一覧画面のデータを作成する
 * Created by tanakasatomi on 2015/10/21.
 */
public class TitleData {

  private Context contxet;

  public TitleData(Context context) {
    this.contxet = context;
  }

  public void saveTitleData() {
    String[] titleList = contxet.getResources().getStringArray(R.array.title_array);
    for (int i = 0; i < titleList.length; i++) {
      Scenario scenario = new Scenario();
      scenario.title = titleList[i];
      scenario.dispFlag = 0;
      scenario.save();
    }
  }

}
