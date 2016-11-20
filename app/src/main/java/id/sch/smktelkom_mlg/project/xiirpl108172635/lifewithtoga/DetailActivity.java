package id.sch.smktelkom_mlg.project.xiirpl108172635.lifewithtoga;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import id.sch.smktelkom_mlg.project.xiirpl108172635.lifewithtoga.model.Toga;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Toga toga = (Toga) getIntent().getSerializableExtra(MainActivity.TOGA1);
        setTitle(toga.judul);
        ImageView ivFoto = (ImageView) findViewById(R.id.imageFoto);
        ivFoto.setImageURI(Uri.parse(toga.foto));
        TextView tvDeskripsi = (TextView) findViewById(R.id.place_detail);
        tvDeskripsi.setText(toga.detail + "\n\n");
        TextView tvGejala = (TextView) findViewById(R.id.place_desc);
        tvGejala.setText(toga.deskripsi + "\n\n");
        TextView tvLokasi = (TextView) findViewById(R.id.place_location);
        tvLokasi.setText(toga.lokasi);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

    }
}
