package jp.gr.java_conf.qkuronekop.natoritourism.pref;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

import java.util.Set;

/**
 * Created by tanakasatomi on 2015/10/21.
 */
public class PrefarenceManager {

  private static final String PREF_NAME = "natori_pref";

  private static final String FIRST_FLAG_NAME = "first_flag";

  private static final String PROLOGUE_FLAG_NEM = "prologue_flag";

  private static final String STORY_SAVE_DATA = "story1_save_data";

  /**
   * 初回起動フラグを保存する
   */
  public static void saveFirstFlag(Context context) {
    SharedPreferences preferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
    Editor editor = preferences.edit();
    editor.putBoolean(FIRST_FLAG_NAME, true);
    editor.commit();
  }

  /**
   * 初回起動フラグを取得する
   * @return
   */
  public static boolean getFirstFlag(Context context) {
    SharedPreferences preferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
    return preferences.getBoolean(FIRST_FLAG_NAME, false);
  }

  public static void savePrologue(Context context) {
    SharedPreferences preferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
    Editor editor = preferences.edit();
    editor.putBoolean(PROLOGUE_FLAG_NEM, true);
    editor.commit();
  }

  public static boolean getPrologue(Context context) {
    SharedPreferences preferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
    return preferences.getBoolean(PROLOGUE_FLAG_NEM, false);
  }

  public static String getFinFlag(Context context) {
    SharedPreferences preferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
    return preferences.getString(STORY_SAVE_DATA, "");
  }

  public static void saveFinFlag(Context context, String saveData) {
    SharedPreferences preferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
    Editor editor = preferences.edit();
    editor.putString(STORY_SAVE_DATA, saveData);
    editor.commit();
  }

}
