package com.proximussociety.prox;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;

/**
 * Created by ray on 9/3/17.
 */

public class ReturnView extends AppCompatActivity
{
    Context c=null;
    private LinearLayout contact_return()
    {

        LayoutInflater li=(LayoutInflater) getBaseContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        LinearLayout lin=(LinearLayout) li.inflate(R.layout.chat_cont,null);
        return lin;
    }
}
