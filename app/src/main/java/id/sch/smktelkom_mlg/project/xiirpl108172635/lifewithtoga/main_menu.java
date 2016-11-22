package id.sch.smktelkom_mlg.project.xiirpl108172635.lifewithtoga;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class main_menu extends AppCompatActivity {

    public static final String ANGT = "Angt";
    public static final String GIZ = "giz";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);


        findViewById(R.id.body).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hasilPindah(1);
            }
        });
        findViewById(R.id.head).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hasilPindah(2);
            }
        });
        findViewById(R.id.hand).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hasilPindah(3);
            }
        });
        findViewById(R.id.hand2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hasilPindah(3);
            }
        });
        findViewById(R.id.leg).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hasilPindah(4);
            }
        });
        findViewById(R.id.imageButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                next();
            }


        });
        findViewById(R.id.gizigizi).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                next2(2);
            }
        });
    }

    private void next() {
        Intent intent = new Intent(main_menu.this, music_list.class);
        startActivity(intent);
    }

    public void next2(Integer giz) {
        Intent intent = new Intent(main_menu.this, infogizi.class);
        intent.putExtra(GIZ, giz);

        startActivity(intent);
    }

    private void hasilPindah(Integer agt) {
        Intent intent = new Intent(main_menu.this, MainActivity.class);
        intent.putExtra(ANGT, agt);

        startActivity(intent);
    }
}
