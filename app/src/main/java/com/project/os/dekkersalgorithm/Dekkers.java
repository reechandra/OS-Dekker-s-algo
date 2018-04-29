package com.project.os.dekkersalgorithm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Dekkers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dekkers);

    }

    public void click(View v)
    {
        Intent i=new Intent(this,Dekkers_5.class);
        startActivity(i);
    }

}
