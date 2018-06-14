package com.swasthgarbh.swasthgarbh;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

import java.util.ArrayList;

public class patientMain extends View {

    private ArrayList<Integer> patientSys = new ArrayList<Integer>();
    private ArrayList<Integer> patientDys = new ArrayList<Integer>();;
    private ArrayList<Float> pateintWeight = new ArrayList<Float>();;
    private String fName = new String();
    private String lName = new String();
    private int patientAge;
    private int imageResourceId;

    public patientMain(Context context , int sysValue, int dysValue, float weight, int age, String fname, String lname) {
        super(context);
//        Log.i("seeing the dataaa", "patientMain: we are hereeee" + sysValue + "dys" + dysValue + "weight" + weight + "age" + age + "fname" + fname + "lname" + lname);
        pateintWeight.add(weight);
        patientSys.add(sysValue);
        patientDys.add(dysValue);
        patientAge = age;
        fName = fname;
        lName = lname;
//        Log.i("after adding object", "patientMain: we are hereeee" + patientSys + "dys" + patientDys + "weight" + pateintWeight + "age" + patientAge + "fname" + fName + "lname" + lName);
    }

    public void setLatestPatientData(int sysValue, int dysValue, float weight){
        pateintWeight.add(weight);
        patientSys.add(sysValue);
        patientDys.add(dysValue);
    }

    public void setNewPatientData(int sysValue, int dysValue, float weight, int age, String fname, String lname){
        pateintWeight.add(weight);
        patientSys.add(sysValue);
        patientDys.add(dysValue);
        patientAge = age;
        fName = fname;
        lName = lname;
    }

    public void setImageResourceId(int imageResourceIdArg){
        imageResourceId = imageResourceIdArg;
    }

    public int getSysValue(int pos){
        return patientSys.get(pos);
    }

    public int getDysValue(int pos){
        return patientDys.get(pos);
    }

    public float getWeightValue(int pos){
        return pateintWeight.get(pos);
    }

    public String getfName() {
        return fName;
    }
}
