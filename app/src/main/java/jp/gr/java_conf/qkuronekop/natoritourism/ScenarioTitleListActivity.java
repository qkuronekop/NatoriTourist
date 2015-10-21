package jp.gr.java_conf.qkuronekop.natoritourism;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import butterknife.ButterKnife;
import jp.gr.java_conf.qkuronekop.natoritourism.io.JsonParseTask;
import jp.gr.java_conf.qkuronekop.natoritourism.model.AreaObj;

public class ScenarioTitleListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scenario_title_list);
        ButterKnife.bind(this);

        JsonParseTask task = new JsonParseTask(getApplicationContext());
        AreaObj areaData = (AreaObj) task.getData(AreaObj.class, "area.json");
        for (AreaObj.AreaData obj: areaData.getAreaData()) {
            Log.i("Area Data", obj.getCode() + " ");
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_scenario_title_list, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
