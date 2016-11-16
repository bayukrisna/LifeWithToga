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
                hasilPindah("badan");
            }
        });
        findViewById(R.id.headUp).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hasilPindah("kepala");
            }
        });
        findViewById(R.id.handLeft).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hasilPindah("tangan");
            }
        });
        findViewById(R.id.handRight).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hasilPindah("tangan");
            }
        });
        findViewById(R.id.legUnder).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hasilPindah("kaki");
            }
        });
    }

    private void hasilPindah(String agt) {
        Intent intent = new Intent(main_menu.this, MainActivity.class);
        intent.putExtra(ANGT, agt);

        startActivity(intent);
    }
}
