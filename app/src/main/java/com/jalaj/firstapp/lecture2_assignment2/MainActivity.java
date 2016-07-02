package com.jalaj.firstapp.lecture2_assignment2;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {



    TextView tViolet,tIndigo,tBlue,tGreen,tYellow,tOrange,tRed;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_linear);
           Context ctx = getApplicationContext();
        VibgyorToastDisplayer vDisplayer = new VibgyorToastDisplayer(ctx);
        tViolet = (TextView)findViewById(R.id.txtvw_violet);
        tIndigo = (TextView)findViewById(R.id.txtvw_indigo);
        tBlue = (TextView)findViewById(R.id.txtvw_blue);
        tYellow = (TextView)findViewById(R.id.txtvw_yellow);
        tOrange = (TextView)findViewById(R.id.txtvw_orange);
        tGreen = (TextView)findViewById(R.id.txtvw_green);
        tRed = (TextView)findViewById(R.id.txtvw_red);

        tViolet.setOnClickListener(vDisplayer);
        tIndigo.setOnClickListener(vDisplayer);
        tBlue.setOnClickListener(vDisplayer);
        tGreen.setOnClickListener(vDisplayer);
        tYellow.setOnClickListener(vDisplayer);
        tOrange.setOnClickListener(vDisplayer);
        tRed.setOnClickListener(vDisplayer);


    }
}
