package jp.gr.java_conf.qkuronekop.natoritourism.io;

import android.content.Context;
import android.content.res.AssetManager;
import android.util.Log;
import com.google.gson.Gson;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Created by tanakasatomi on 2015/10/21.
 */
public class JsonParseTask {

  private Context context;

  public JsonParseTask(Context context) {
    this.context = context;
  }

  /**
   * Assetからjsonファイルを読み込みオブジェクトに変換
   * @param clazz
   * @param fileName
   * @return
   */
  public Object getData(Class clazz, String fileName) {
    AssetManager assetManager = context.getResources().getAssets();
    try {
      InputStream inputStream = assetManager.open(fileName);
      InputStreamReader reader = new InputStreamReader(inputStream, "UTF-8");
      Gson gson = new Gson();
      return gson.fromJson(reader, clazz);
    } catch (IOException e) {
      Log.e("JSON PERSE ERROR", e.getMessage());
      return null;
    }
  }
}
