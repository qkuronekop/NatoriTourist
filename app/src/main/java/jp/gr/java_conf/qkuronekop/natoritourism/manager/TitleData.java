package jp.gr.java_conf.qkuronekop.natoritourism.manager;

import android.content.Context;

import com.activeandroid.query.Select;

import java.util.List;

import jp.gr.java_conf.qkuronekop.natoritourism.R;
import jp.gr.java_conf.qkuronekop.natoritourism.table.Scenario;

/**
 * タイトル(シナリオ)一覧画面のデータを処理する
 * Created by tanakasatomi on 2015/10/21.
 */
public class TitleData {

  private Context contxet;

  public TitleData(Context context) {
    this.contxet = context;
  }

  /**
   * 初期データとしてシナリオタイトルを保存する
   */
  public void saveTitleData() {
    String[] titleList = contxet.getResources().getStringArray(R.array.title_array);
    for (int i = 0; i < titleList.length; i++) {
      Scenario scenario = new Scenario();
      scenario.title = titleList[i];
      scenario.dispFlag = i == 0 ? 1 : 0;
      scenario.save();
    }
  }

  /**
   * 表示フラグのたっているシナリオタイトルを取得する
   * @return タイトル一覧
   */
  public List<Scenario> getScenarioTitle() {
    return new Select().from(Scenario.class).where("dispFlag = 1").execute();
  }

  public void saveDispFlag(final int no) {
    Scenario scenario = new Select().from(Scenario.class).where("id = " + no).executeSingle();
    scenario.dispFlag = 1;
    scenario.save();
  }
}
