package com.swasthgarbh.swasthgarbh;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class patientAdapter extends ArrayAdapter<patientMain> {
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        patientMain currentPatient = getItem(position);
        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.patient_history_listview,parent)
        }

        TextView sysValueTextView = (TextView) listItemView.findViewById(R.id.sysValue);
        sysValueTextView.setText(currentPatient.getSysValue());

        ImageView normalAbnormalImageView = (ImageView) listItemView.findViewById(R.id.normalAbnormalImage);
        normalAbnormalImageView.setImageResource();
    }

    public patientAdapter(Activity context, ArrayList<patientMain> patientsList){
        super(context,0,patientsList);
    }
}
