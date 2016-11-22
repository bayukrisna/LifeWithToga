package id.sch.smktelkom_mlg.project.xiirpl108172635.lifewithtoga;

import android.content.Context;
import android.media.MediaPlayer;

/**
 * Created by rex on 21/11/2016.
 */

public class musicPlayer {
    public static MediaPlayer mp;

    public static void playing(Context ctx, int raw_id) {
        if (mp != null) {
            mp.stop();
            mp.release();
            mp = null;
        }
        mp = MediaPlayer.create(ctx, raw_id);
        mp.start();
        mp.setLooping(true);
    }

    public static void pausing() {
        mp.pause();
    }
}
