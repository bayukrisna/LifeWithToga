package id.sch.smktelkom_mlg.project.xiirpl108172635.lifewithtoga;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class main_menu extends AppCompatActivity {

    public static final String ANGT = "Angt";

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
        findViewById(R.id.headUp).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hasilPindah(2);
            }
        });
        findViewById(R.id.handLeft).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hasilPindah(3);
            }
        });
        findViewById(R.id.handRight).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hasilPindah(3);
            }
        });
        findViewById(R.id.legUnder).setOnClickListener(new View.OnClickListener() {
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
    }

    private void next() {
        Intent intent = new Intent(main_menu.this, music_list.class);
        startActivity(intent);
    }

    private void hasilPindah(Integer agt) {
        Intent intent = new Intent(main_menu.this, MainActivity.class);
        intent.putExtra(ANGT, agt);

        startActivity(intent);
    }
}
