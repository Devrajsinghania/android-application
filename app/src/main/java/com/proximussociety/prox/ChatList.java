package com.proximussociety.prox;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ChatList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat_list);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        LinearLayout lmain=(LinearLayout)findViewById(R.id.chat_list_cont1);
        for(int i=0;i<100;i++)
        {
            lmain.addView(getchatcontact(
                    "Govind : "+i,
                    "00:00 am",
                    "why dont I have any GirlFriend, Life Sucks",
                    null
            ));
        }


    }
    private LinearLayout getchatcontact(String name, String time, String mess, View.OnClickListener click)
    {
        LayoutInflater lf = (LayoutInflater)getBaseContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        LinearLayout ll = (LinearLayout) lf.inflate(R.layout.chat_cont,null);
        TextView namee=(TextView)ll.findViewById(R.id.chat_cont_name);
        namee.setText(name);

        TextView timee=(TextView)ll.findViewById(R.id.chat_cont_time);
        timee.setText(time);

        TextView messe=(TextView)ll.findViewById(R.id.chat_cont_mess);
        messe.setText(mess);

        LinearLayout lll=(LinearLayout) ll.findViewById(R.id.chat_cont_click);
        lll.setOnClickListener(click);
        return ll;
    }
}
