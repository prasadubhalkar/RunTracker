package runtracker.android.bignerdranch.com.runtracker;

import android.content.Context;

/**
 * Created by Prasad on 3/10/2015.
 */
public class RunLoader extends DataLoader<Run> {
    private long mRunId;

    public RunLoader(Context context, long runId){
        super(context);
        mRunId = runId;
    }

    @Override
    public Run loadInBackground(){
        return RunManager.get(getContext()).getRun(mRunId);
    }
}
