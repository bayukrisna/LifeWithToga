package id.sch.smktelkom_mlg.project.xiirpl108172635.lifewithtoga;

import android.content.Context;
import android.media.MediaPlayer;

/**
 * Created by rex on 21/11/2016.
 */

public class musicPlayer {
    public static MediaPlayer mp;
    public static String status;
    public static String but;

    public static void playing(Context ctx, int raw_id, String but_id) {
        if (mp != null && but != but_id) {
            mp.stop();
            mp.release();
            mp = null;
            mp = MediaPlayer.create(ctx, raw_id);
            mp.start();
            mp.setLooping(true);
        } else if (but == but_id && status == "pause") {
            mp.start();
        } else {
            mp = MediaPlayer.create(ctx, raw_id);
            mp.start();
            mp.setLooping(true);
        }
        but = but_id;
    }

    public static void pausing() {
        mp.pause();
        status = "pause";
    }
}
