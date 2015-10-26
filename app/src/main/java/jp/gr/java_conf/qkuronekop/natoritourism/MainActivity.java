package jp.gr.java_conf.qkuronekop.natoritourism;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import java.util.ServiceConfigurationError;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.top_image_view)
    ImageView imageView1;

    @OnClick(R.id.start_button)
    public void onStartClick() {
        Intent intent = new Intent(this, ScenarioTitleListActivity.class);
        startActivity(intent);
        finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }
}
