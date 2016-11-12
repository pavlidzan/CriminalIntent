package com.myapplications.vladimir.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by vladimir.pavlovic on 11/11/2016.
 */

public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
