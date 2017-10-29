package boomsoft.com.proximitybuy;

import android.content.Context;
import android.util.Log;

/**
 * Created by Bruno on 10/28/2017.
 */

public class ProximityBuy {
    private static final String TAG = "PROXIMITYBUYSDK";
    Context ctx;

    public void init(Context c){
        this.ctx = c;
        Log.d(TAG, c.getPackageName());
    }
}
