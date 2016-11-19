package com.myapplications.vladimir.criminalintent;

import java.util.UUID;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;

public class CrimeActivity extends SingleFragmentActivity {

//    public static final String EXTRA_CRIME_ID = "com.myapplications.vladimir.criminalintent.crime_id";
    private static final String EXTRA_CRIME_ID = "com.myapplications.vladimir.criminalintent.crime_id";

    @Override
    protected Fragment createFragment() {
//        return new CrimeFragment();
        UUID crimeId = (UUID) getIntent().getSerializableExtra(EXTRA_CRIME_ID);
        return CrimeFragment.newInstance(crimeId);
    }

    public static Intent newIntent(Context packageContext, UUID crimeId){
     Intent intent = new Intent(packageContext, CrimeActivity.class);
        intent.putExtra(EXTRA_CRIME_ID, crimeId);
        return intent;
    }
}
