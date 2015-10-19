package jp.gr.java_conf.qkuronekop.natoritourism;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import java.util.List;

import jp.gr.java_conf.qkuronekop.natoritourism.io.CsvExportTask;
import jp.gr.java_conf.qkuronekop.natoritourism.model.NatoriData;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CsvExportTask task = new CsvExportTask(getApplication());
        List<NatoriData> natoriDataList = task.getNatoriDataList();
        for (NatoriData data: natoriDataList) {
            Log.i("データ", data.getCode() + " " + data.getDistrict());
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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