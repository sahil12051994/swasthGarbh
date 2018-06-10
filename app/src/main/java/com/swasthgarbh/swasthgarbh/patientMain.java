package com.swasthgarbh.swasthgarbh;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import java.util.ArrayList;

public class patientMain extends View {

    private ArrayList<Integer> patientSys;
    private ArrayList<Integer> patinetDys;
    private ArrayList<Float> pateintWeight;
    private String fName;
    private String lName;
    private int patientAge;

    public patientMain(Context context , int sysValue, int dysValue, float weight, int age, String fname, String lname) {
        super(context);
        pateintWeight.add(weight);
        patientSys.add(sysValue);
        patinetDys.add(dysValue);
        patientAge = age;
        fName = fname;
        lName = lname;
    }

    public void setLatestPatientData(int sysValue, int dysValue, float weight){
        pateintWeight.add(weight);
        patientSys.add(sysValue);
        patinetDys.add(dysValue);
    }

    public void setNewPatientData(int sysValue, int dysValue, float weight, int age, String fname, String lname){
        pateintWeight.add(weight);
        patientSys.add(sysValue);
        patinetDys.add(dysValue);
        patientAge = age;
        fName = fname;
        lName = lname;
    }

    public int getSysValue(int pos){
        return patientSys.get(pos);
    }

}
