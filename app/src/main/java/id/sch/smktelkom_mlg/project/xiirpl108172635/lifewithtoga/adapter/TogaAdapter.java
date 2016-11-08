package id.sch.smktelkom_mlg.project.xiirpl108172635.lifewithtoga.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import id.sch.smktelkom_mlg.project.xiirpl108172635.lifewithtoga.R;
import id.sch.smktelkom_mlg.project.xiirpl108172635.lifewithtoga.model.Toga;

/**
 * Created by Bayu on 08/11/2016.
 */

public class TogaAdapter extends RecyclerView.Adapter<TogaAdapter.ViewHolder> {

    ArrayList<Toga> togalist;

    public TogaAdapter(ArrayList<Toga> togalist) {
        this.togalist = togalist;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Toga toga = togalist.get(position);
        holder.tvJudul.setText(toga.judul);
        holder.tvDeskripsi.setText(toga.deskripsi);
        holder.ivFoto.setImageDrawable(toga.foto);

    }

    @Override
    public int getItemCount() {
        if (togalist != null)
            return togalist.size();
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView ivFoto;
        TextView tvJudul;
        TextView tvDeskripsi;

        public ViewHolder(View itemView) {
            super(itemView);
            ivFoto = (ImageView) itemView.findViewById(R.id.imageView);
            tvJudul = (TextView) itemView.findViewById(R.id.textViewJudul);
            tvDeskripsi = (TextView) itemView.findViewById(R.id.textViewDeskripsi);
        }
    }
}
