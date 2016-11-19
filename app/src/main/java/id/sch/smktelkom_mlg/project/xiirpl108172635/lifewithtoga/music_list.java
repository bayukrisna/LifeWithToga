package id.sch.smktelkom_mlg.project.xiirpl108172635.lifewithtoga;

import android.content.Intent;
import android.media.MediaPlayer;
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

        final MediaPlayer mp = MediaPlayer.create(music_list.this, R.raw.lagu1);

        play1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
            }
        });
        pause1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.pause();
            }
        });

        ImageView play2 = (ImageView) findViewById(R.id.play2);
        ImageView pause2 = (ImageView) findViewById(R.id.pause2);

        final MediaPlayer mp2 = MediaPlayer.create(music_list.this, R.raw.lagu2);

        play2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp2.start();
            }
        });
        pause2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp2.pause();
            }
        });

        ImageView play3 = (ImageView) findViewById(R.id.play3);
        ImageView pause3 = (ImageView) findViewById(R.id.pause3);

        final MediaPlayer mp3 = MediaPlayer.create(music_list.this, R.raw.lagu3);

        play3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp3.start();
            }
        });
        pause3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp3.pause();
            }
        });

        ImageView play4 = (ImageView) findViewById(R.id.play4);
        ImageView pause4 = (ImageView) findViewById(R.id.pause4);

        final MediaPlayer mp4 = MediaPlayer.create(music_list.this, R.raw.lagu4);

        play4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp4.start();
            }
        });
        pause4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp4.pause();
            }
        });

        ImageView play5 = (ImageView) findViewById(R.id.play5);
        ImageView pause5 = (ImageView) findViewById(R.id.pause5);

        final MediaPlayer mp5 = MediaPlayer.create(music_list.this, R.raw.lagu5);

        play5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp5.start();
            }
        });
        pause5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp5.pause();
            }
        });

        ImageView play6 = (ImageView) findViewById(R.id.play6);
        ImageView pause6 = (ImageView) findViewById(R.id.pause6);

        final MediaPlayer mp6 = MediaPlayer.create(music_list.this, R.raw.lagu6);

        play6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp6.start();
            }
        });
        pause6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp6.pause();
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
