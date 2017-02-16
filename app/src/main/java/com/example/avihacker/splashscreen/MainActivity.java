package com.example.avihacker.splashscreen;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Thread thread = new Thread() {
            public void run() {
                try {
                    sleep(5000);

                } catch (Exception e) {

                } finally {
                    Intent intent = new Intent(MainActivity.this, MainActivity2Activity.class);
                    startActivity(intent);
                }
            }
        };  thread.start();



    }
}