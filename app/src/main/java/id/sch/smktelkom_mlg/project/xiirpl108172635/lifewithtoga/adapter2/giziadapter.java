package id.sch.smktelkom_mlg.project.xiirpl108172635.lifewithtoga.adapter2;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import id.sch.smktelkom_mlg.project.xiirpl108172635.lifewithtoga.R;
import id.sch.smktelkom_mlg.project.xiirpl108172635.lifewithtoga.model2.gizi;

/**
 * Created by Bayu on 21/11/2016.
 */

public class giziadapter extends RecyclerView.Adapter<giziadapter.ViewHolder2> {

    ArrayList<gizi> gizilist;

    public giziadapter(ArrayList<gizi> gizilist) {
        this.gizilist = gizilist;
    }

    @Override
    public ViewHolder2 onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_gizi, parent, false);
        ViewHolder2 vh = new ViewHolder2(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder2 holder, int position) {
        gizi gizi2 = gizilist.get(position);
        holder.tvjudulgizi.setText(gizi2.judulgizi);
        holder.tvsumbergizi.setText(gizi2.sumbergizi);
        holder.ivfotogizi.setImageDrawable(gizi2.fotogizi);
    }

    @Override
    public int getItemCount() {
        if (gizilist != null)
            return gizilist.size();
        return 0;
    }

    public class ViewHolder2 extends RecyclerView.ViewHolder {

        ImageView ivfotogizi;
        TextView tvjudulgizi;
        TextView tvsumbergizi;

        public ViewHolder2(View itemView) {

            super(itemView);
            ivfotogizi = (ImageView) itemView.findViewById(R.id.imageView9);
            tvjudulgizi = (TextView) itemView.findViewById(R.id.textViewJudulGizi);
            tvsumbergizi = (TextView) itemView.findViewById(R.id.textViewSumberGizi);
        }
    }
}
