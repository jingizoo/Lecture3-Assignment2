package com.jalaj.firstapp.lecture2_assignment2;

import android.content.Context;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by jalajmehta on 7/2/16.
 */

public class VibgyorToastDisplayer implements View.OnClickListener {
    private final Context ctx;

    @Override
    public void onClick(View v) {

        TextView txtView = (TextView) v;
        CharSequence text = txtView.getText();
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(ctx, text, duration);
toast.setGravity(Gravity.CENTER_HORIZONTAL,0,0);
        toast.setDuration(Toast.LENGTH_LONG);

        toast.show();
        Log.d((String)text,(String)text);
    }
    VibgyorToastDisplayer(Context ctx){
        this.ctx = ctx;
    }
}

