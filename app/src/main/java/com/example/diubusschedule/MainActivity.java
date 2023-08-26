package com.example.diubusschedule;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    private Button Saturdaybutton,Sundaybutton,Mondaybutton,Tuesdaybutton,Wednesdaybutton,Thursdaybutton,Fridaybutton;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Saturdaybutton = findViewById(R.id.Saturdayid);
        Sundaybutton = findViewById(R.id.Sundayid);
        Mondaybutton = findViewById(R.id.Mondayid);
        Tuesdaybutton = findViewById(R.id.Tuesdayid);
        Wednesdaybutton = findViewById(R.id.Wednesdayid);
        Thursdaybutton = findViewById(R.id.Thursdayid);
        Fridaybutton = findViewById(R.id.Fridayid);

        Saturdaybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Saturday.class);
                startActivities(new Intent[]{intent});
            }
        });

        Sundaybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Sunday.class);
                startActivities(new Intent[]{intent});
            }
        });

        Mondaybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Monday.class);
                startActivities(new Intent[]{intent});
            }
        });

        Tuesdaybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Tuesday.class);
                startActivities(new Intent[]{intent});
            }
        });

        Wednesdaybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Wednesday.class);
                startActivities(new Intent[]{intent});
            }
        });

        Thursdaybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Thursday.class);
                startActivities(new Intent[]{intent});
            }
        });

        Fridaybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Friday.class);
                startActivities(new Intent[]{intent});
            }
        });

        BottomNavigationView bottomNavigationView = findViewById(R.id.navigationid);
        bottomNavigationView.setSelectedItemId(R.id.Schedule);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.Schedule:
                        return true;

                    case R.id.Rent:
                        startActivity(new Intent(getApplicationContext()
                                ,Rent.class));
                        overridePendingTransition(0,0);
                        return true;
                }


                return true;
            }
        });

    }

    @Override
    public void onBackPressed() {
        //super.onBackPressed();

        new AlertDialog.Builder(MainActivity.this)
                .setTitle("Exit!")
                .setMessage("Do you want to exit?")
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                })
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                        finishAffinity();
                    }
                })
                .show();
    }
}