package id.sch.smktelkom_mlg.project.xiirpl108172635.lifewithtoga;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import id.sch.smktelkom_mlg.project.xiirpl108172635.lifewithtoga.adapter2.giziadapter;
import id.sch.smktelkom_mlg.project.xiirpl108172635.lifewithtoga.model2.gizi;

public class infogizi extends AppCompatActivity {
    ArrayList<gizi> mList2 = new ArrayList<>();
    giziadapter mAdapter2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infogizi);

        RecyclerView recyclerView2 = (RecyclerView) findViewById(R.id.activity_infogizi);
        LinearLayoutManager layoutManager2 = new LinearLayoutManager(this);
        recyclerView2.setLayoutManager(layoutManager2);
        mAdapter2 = new giziadapter(mList2);
        recyclerView2.setAdapter(mAdapter2);

        fillData2();
    }

    private void fillData2() {
        Resources resources2 = getResources();
        String[] arjudul2 = resources2.getStringArray(R.array.judulgizi);
        String[] arsumber = resources2.getStringArray(R.array.sumbergizi);
        TypedArray b = resources2.obtainTypedArray(R.array.gambargizi);
        Drawable[] arfoto2 = new Drawable[b.length()];
        for (int i = 0; i < arfoto2.length; i++) {
            BitmapDrawable bd2 = (BitmapDrawable) b.getDrawable(i);
            RoundedBitmapDrawable rbd = RoundedBitmapDrawableFactory.create(getResources(), bd2.getBitmap());
            rbd.setCircular(true);
            arfoto2[i] = rbd;
        }
        b.recycle();

        for (int i = 0; i < arjudul2.length; i++) {
            mList2.add(new gizi(arjudul2[i], arsumber[i], arfoto2[i]));
        }
        mAdapter2.notifyDataSetChanged();
    }
}
