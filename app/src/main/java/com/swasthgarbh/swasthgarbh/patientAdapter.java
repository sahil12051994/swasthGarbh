package com.swasthgarbh.swasthgarbh;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class patientAdapter extends ArrayAdapter<patientMain> {

    public patientAdapter(Activity context, ArrayList<patientMain> patientsList){
        super(context,0,patientsList);
    }
    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position The position in the list of data that should be displayed in the
     *                 list item view.
     * @param convertView The recycled view to populate.
     * @param parent The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.patient_history_list_item,parent,false);
        }
        patientMain currentPatient = getItem(position);

        TextView sysValueTextView = (TextView) listItemView.findViewById(R.id.sysValueInPatientHistoryList);
        sysValueTextView.setText(currentPatient != null ? currentPatient.getSysValue(0) : 0);

        Log.i("Loggg Message", "66666666666");
//        ImageView normalAbnormalImageView = (ImageView) listItemView.findViewById(R.id.normalAbnormalImage);
//        normalAbnormalImageView.setImageResource();

        return listItemView;
    }
}
