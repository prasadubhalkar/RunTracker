package runtracker.android.bignerdranch.com.runtracker;

import android.support.v4.app.Fragment;

/**
 * Created by Prasad on 3/9/2015.
 */
public class RunListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment(){
        return new RunListFragment();
    }
}
