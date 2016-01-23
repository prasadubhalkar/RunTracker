package runtracker.android.bignerdranch.com.runtracker;

import android.content.Context;
import android.location.Location;

/**
 * Created by Prasad on 3/10/2015.
 */
public class LastLocationLoader extends DataLoader<Location> {
    private long mRunId;

    public LastLocationLoader(Context context, long runId){
        super(context);
        mRunId = runId;
    }

    @Override
    public Location loadInBackground(){
        return RunManager.get(getContext()).getLastLocationForRun(mRunId);
    }
}
