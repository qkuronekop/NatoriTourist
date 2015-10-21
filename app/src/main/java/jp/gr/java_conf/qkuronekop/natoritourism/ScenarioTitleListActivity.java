package jp.gr.java_conf.qkuronekop.natoritourism;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import butterknife.ButterKnife;
import jp.gr.java_conf.qkuronekop.natoritourism.manager.TitleData;
import jp.gr.java_conf.qkuronekop.natoritourism.pref.PrefarenceManager;

public class ScenarioTitleListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scenario_title_list);
        ButterKnife.bind(this);

        if (!PrefarenceManager.getFirstFlag(getApplicationContext())) {
            TitleData titleData = new TitleData(getApplicationContext());
            titleData.saveTitleData();
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

    //JsonParseTask task = new JsonParseTask(getApplicationContext());
    //DistrictObj areaData = (DistrictObj) task.getData(DistrictObj.class, "district.json");
    //for (DistrictObj.DistrictData obj: areaData.getDistrictData()) {
    //    Log.i("Area Data", obj.getCode() + " " + obj.getDistrict());
    //}
}
