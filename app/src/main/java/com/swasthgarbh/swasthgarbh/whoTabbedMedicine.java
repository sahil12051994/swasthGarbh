package com.swasthgarbh.swasthgarbh;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

public class whoTabbedMedicine extends AppCompatActivity {

    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.bottomNavMedicine:
                        // case for medicine
//                    mTextMessage.setText(R.string.bottomNavMedicine);
//                    return true;
                case R.id.bottomNavWhoGuidelines:
//                    mTextMessage.setText(R.string.bottomNavLocations);
//                    return true;
                case R.id.bottomLocations:
//                    mTextMessage.setText(R.string.bottomNavWho);
//                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_who_tabbed_medicine);
        addFragment();

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

    private void addFragment(){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        WhoGuidelinesFragment sampleFragment = new WhoGuidelinesFragment();
        fragmentTransaction.add(R.id.fragmentInWhoGuidelines , sampleFragment);
        fragmentTransaction.commit();
    }
}
