package jp.gr.java_conf.qkuronekop.natoritourism.adapter;

import android.content.Context;
import android.support.v7.widget.CardView;
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

    public interface TitleListener {
        void toutchTitle(int position);
    }

    private TitleListener listener;

    private LayoutInflater layoutInflater;

    public TitleListAdapter(Context context, int resource, List<Scenario> objects, TitleListener listener) {
        super(context, resource, objects);
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.listener = listener;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if (convertView != null) {
            viewHolder = (ViewHolder) convertView.getTag();
        } else {
            convertView = layoutInflater.inflate(R.layout.adapter_title_list, null);
            viewHolder = new ViewHolder(convertView);
            convertView.setTag(viewHolder);
        }

        viewHolder.titleTextView.setText(getItem(position).title);
        viewHolder.titleCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.toutchTitle(position);
            }
        });

        return convertView;
    }

    static class ViewHolder {

        @Bind(R.id.title_name) TextView titleTextView;
        @Bind(R.id.title_card_view)
        CardView titleCardView;

        public ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}
