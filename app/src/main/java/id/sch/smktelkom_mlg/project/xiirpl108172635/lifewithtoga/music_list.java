package id.sch.smktelkom_mlg.project.xiirpl108172635.lifewithtoga;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class music_list extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_list);

        ImageView play1 = (ImageView) findViewById(R.id.play1);
        ImageView pause1 = (ImageView) findViewById(R.id.ppause1);
        ImageView play2 = (ImageView) findViewById(R.id.play2);
        ImageView pause2 = (ImageView) findViewById(R.id.pause2);
        ImageView play3 = (ImageView) findViewById(R.id.play3);
        ImageView pause3 = (ImageView) findViewById(R.id.pause3);
        ImageView play4 = (ImageView) findViewById(R.id.play4);
        ImageView pause4 = (ImageView) findViewById(R.id.pause4);
        ImageView play5 = (ImageView) findViewById(R.id.play5);
        ImageView pause5 = (ImageView) findViewById(R.id.pause5);
        ImageView play6 = (ImageView) findViewById(R.id.play6);
        ImageView pause6 = (ImageView) findViewById(R.id.pause6);

        play1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                musicPlayer.playing(music_list.this, R.raw.lagu1);
            }
        });
        pause1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                musicPlayer.pausing();
            }
        });

        play2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                musicPlayer.playing(music_list.this, R.raw.lagu2);
            }
        });
        pause2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                musicPlayer.pausing();
            }
        });

        play3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                musicPlayer.playing(music_list.this, R.raw.lagu3);
            }
        });
        pause3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                musicPlayer.pausing();
            }
        });

        play4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                musicPlayer.playing(music_list.this, R.raw.lagu4);
            }
        });
        pause4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                musicPlayer.pausing();
            }
        });

        play5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                musicPlayer.playing(music_list.this, R.raw.lagu5);
            }
        });
        pause5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                musicPlayer.pausing();
            }
        });

        play6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                musicPlayer.playing(music_list.this, R.raw.lagu6);
            }
        });
        pause6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                musicPlayer.pausing();
            }
        });


        findViewById(R.id.Back).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goback();
            }
        });
    }

    private void goback() {
        Intent intent = new Intent(music_list.this, main_menu.class);
        startActivity(intent);
    }
}
