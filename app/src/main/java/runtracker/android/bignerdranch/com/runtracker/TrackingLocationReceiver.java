package runtracker.android.bignerdranch.com.runtracker;

import android.content.Context;
import android.location.Location;
import android.util.Log;

/**
 * Created by Prasad on 3/8/2015.
 */
public class TrackingLocationReceiver extends LocationReceiver {
    @Override
    protected void onLocationReceived(Context c,Location loc){
        RunManager.get(c).insertLocation(loc);
    }
}
