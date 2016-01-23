package runtracker.android.bignerdranch.com.runtracker;

import android.content.Context;
import android.database.Cursor;

/**
 * Created by Prasad on 3/14/2015.
 */
public class LocationListCursorLoader extends SQLiteCursorLoader {
    private long mRunId;

    public LocationListCursorLoader(Context c, long runId){
        super(c);
        mRunId = runId;
    }

    @Override
    protected Cursor loadCursor(){
        return RunManager.get(getContext()).queryLocationForRun(mRunId);
    }
}
