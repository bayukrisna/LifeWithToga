package id.sch.smktelkom_mlg.project.xiirpl108172635.lifewithtoga;

import android.content.ContentResolver;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import id.sch.smktelkom_mlg.project.xiirpl108172635.lifewithtoga.adapter.TogaAdapter;
import id.sch.smktelkom_mlg.project.xiirpl108172635.lifewithtoga.model.Toga;

public class MainActivity extends AppCompatActivity implements TogaAdapter.ITogaAdapter {

    public static final String TOGA1 = "toga";
    public static final String TAG = "COBA-COBA";
    public static final String COBACOBA = "COBACOBA";
    ArrayList<Toga> mList = new ArrayList<>();
    TogaAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        mAdapter = new TogaAdapter(this, mList);
        recyclerView.setAdapter(mAdapter);

        fillData();

    }


    private void fillData() {
        Integer anggota = getIntent().getIntExtra(main_menu.ANGT, 0);
        Resources resources = getResources();
        String[] arJudul = resources.getStringArray(R.array.places);
        String[] arDeskripsi = resources.getStringArray(R.array.place_desc);
        String[] arDetail = resources.getStringArray(R.array.place_details);
        String[] arLokasi = resources.getStringArray(R.array.place_locations);
        TypedArray a = resources.obtainTypedArray(R.array.places_picture);

        if (anggota == 2) {
            arJudul = resources.getStringArray(R.array.judulkepala);
            arDeskripsi = resources.getStringArray(R.array.definisikepala);
            arDetail = resources.getStringArray(R.array.gejalakepala);
            arLokasi = resources.getStringArray(R.array.obatkepala);
            a = resources.obtainTypedArray(R.array.gambarkepala);
        } else if (anggota == 3) {
            arJudul = resources.getStringArray(R.array.judultangan);
            arDeskripsi = resources.getStringArray(R.array.definisitangan);
            arDetail = resources.getStringArray(R.array.gejalatangan);
            arLokasi = resources.getStringArray(R.array.obattangan);
            a = resources.obtainTypedArray(R.array.gambartangan);
        } else if (anggota == 4) {
            arJudul = resources.getStringArray(R.array.judulkaki);
            arDeskripsi = resources.getStringArray(R.array.definisikaki);
            arDetail = resources.getStringArray(R.array.gejalakaki);
            arLokasi = resources.getStringArray(R.array.obatkaki);
            a = resources.obtainTypedArray(R.array.gambarkaki);
        }

        String[] arFoto = new String[a.length()];
        for (int i = 0; i < arFoto.length; i++) {
            int id = a.getResourceId(i, 0);
            arFoto[i] = ContentResolver.SCHEME_ANDROID_RESOURCE + "://"
                    + resources.getResourcePackageName(id) + '/'
                    + resources.getResourceTypeName(id) + '/'
                    + resources.getResourceEntryName(id);
        }
        a.recycle();

        for (int i = 0; i < arJudul.length; i++) {
            mList.add(new Toga(arJudul[i], arDeskripsi[i], arDetail[i], arLokasi[i], arFoto[i]));
        }
        mAdapter.notifyDataSetChanged();
    }

    @Override
    public void doClick(int pos) {
        Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra(TOGA1, mList.get(pos));
        startActivity(intent);
    }
}