package com.swasthgarbh.swasthgarbh;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //Action for button on login screen
        TextView patientLoginButton = (TextView) findViewById(R.id.patient_login);
        TextView doctorLoginButton = (TextView) findViewById(R.id.doctor_login);

        patientLoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this, PatientPanel.class);
                startActivity(intent);
            }
        });

        doctorLoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this, DoctorPanel.class);
                startActivity(intent);
            }
        });
    }
}
