package com.swasthgarbh.swasthgarbh;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class PatientHistory extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_history);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        ArrayList<patientMain> patientsList = new ArrayList<patientMain>();
        for (int inc=0; inc<50; inc++){
            patientsList.add(new patientMain(this, 100,100,80,20, "sahil" + inc,"sharma" + inc));
        }

        patientAdapter itemsAdapter = new patientAdapter(this , patientsList);
        ListView listView = (ListView) findViewById(R.id.patientHistoryList);
        listView.setAdapter(itemsAdapter);
    }
}
