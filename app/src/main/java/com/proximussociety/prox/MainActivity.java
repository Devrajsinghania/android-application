package com.proximussociety.prox;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(check_already_login())
        {
            Intent i = new Intent(this,ChatList.class);
            startActivity(i);
        }
        else
        {
            Intent i = new Intent(this,LoginActivity.class);
            startActivity(i);
        }


    }
    private boolean check_already_login()
    {
        return true;
    }
}
