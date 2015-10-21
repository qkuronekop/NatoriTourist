package jp.gr.java_conf.qkuronekop.natoritourism.adapter;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import jp.gr.java_conf.qkuronekop.natoritourism.R;
import jp.gr.java_conf.qkuronekop.natoritourism.table.Scenario;

/**
 * Created by satomitanaka on 15/10/21.
 */
public class TitleListAdapter extends ArrayAdapter<Scenario> {

    private LayoutInflater layoutInflater;

    public TitleListAdapter(Context context, int resource, List<Scenario> objects) {
        super(context, resource, objects);
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if (convertView != null) {
            viewHolder = (ViewHolder) convertView.getTag();
        } else {
            convertView = layoutInflater.inflate(R.layout.adapter_title_list, null);
            viewHolder = new ViewHolder(convertView);
            convertView.setTag(viewHolder);
        }

        viewHolder.titleTextView.setText(getItem(position).title);

        return super.getView(position, convertView, parent);
    }

    static class ViewHolder {

        @Bind(R.id.title_name) TextView titleTextView;

        public ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}
