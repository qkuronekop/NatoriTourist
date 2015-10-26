package jp.gr.java_conf.qkuronekop.natoritourism;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import butterknife.Bind;
import butterknife.ButterKnife;
import jp.gr.java_conf.qkuronekop.natoritourism.adapter.TitleListAdapter;
import jp.gr.java_conf.qkuronekop.natoritourism.manager.TitleData;
import jp.gr.java_conf.qkuronekop.natoritourism.pref.PrefarenceManager;

public class ScenarioTitleListActivity extends AppCompatActivity implements TitleListAdapter.TitleListener {

    @Bind(R.id.title_list_view)
    ListView titleListView;

    @Bind(R.id.scenario_toolbar)
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scenario_title_list);
        ButterKnife.bind(this);
        TitleData titleData = new TitleData(getApplicationContext());
        if (!PrefarenceManager.getFirstFlag(getApplicationContext())) {
            titleData.saveTitleData();
            PrefarenceManager.saveFirstFlag(getApplicationContext());
        }
        TitleListAdapter adapter = new TitleListAdapter(getApplicationContext(), 0, titleData.getScenarioTitle(), this);
        titleListView.setAdapter(adapter);
        setSupportActionBar(toolbar);
    }

    @Override
    protected void onResume() {
        super.onResume();
        TitleData titleData = new TitleData(getApplicationContext());
        TitleListAdapter adapter = (TitleListAdapter) titleListView.getAdapter();
        adapter.clear();
        adapter.addAll(titleData.getScenarioTitle());
        adapter.notifyDataSetChanged();
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

        switch (id) {
            case R.id.action_history:
                break;
            case R.id.action_lisence:
                break;
            case R.id.action_produser:
                break;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void toutchTitle(int position) {
        Intent intent = new Intent(this, StoryActivity.class);
        intent.putExtra(getString(R.string.key_story_no), position);
        startActivity(intent);
    }

    //JsonParseTask task = new JsonParseTask(getApplicationContext());
    //DistrictObj areaData = (DistrictObj) task.getData(DistrictObj.class, "district.json");
    //for (DistrictObj.DistrictData obj: areaData.getDistrictData()) {
    //    Log.i("Area Data", obj.getCode() + " " + obj.getDistrict());
    //}
}
