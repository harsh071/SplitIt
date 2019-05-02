package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.TableRow;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }


    //adding the items
    public void addClick(View view){
        startActivity(new Intent(MainActivity.this , Bill.class));
    }


    //go to friend tab
    public void  friendClick(View view){ // MainActivity and Friends is the same.
        startActivity(new Intent(MainActivity.this , MainActivity.class));
    }

    //go to groups tab

    public void groupsClick(View view){
        startActivity(new Intent(MainActivity.this , Groups.class));
    }

    //go to activity tab

    public void activityClick(View view){
        startActivity(new Intent(MainActivity.this , activityTabActivity.class));
    }

}
