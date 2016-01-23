package runtracker.android.bignerdranch.com.runtracker;

import android.support.v4.app.Fragment;

/**
 * Created by Prasad on 3/11/2015.
 */
public class RunMapActivity extends SingleFragmentActivity {
    /** A Key for passing run id as long */
    public static final String EXTRA_RUN_ID = "com.bignerdranch.android.runtracker.run_id";

    @Override
    protected Fragment createFragment() {
        long runId = getIntent().getLongExtra(EXTRA_RUN_ID,-1);
        if(runId != -1){
            return RunMapFragment.newInstance(runId);
        } else {
            return new RunMapFragment();
        }
    }
}
