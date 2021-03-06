package com.strobertchs.finalproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button buttonObjectChoice1;
    Button buttonObjectChoice2;
    Button buttonObjectChoice3;
    Button buttonObjectChoice4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        TextView textView = (TextView)findViewById(R.id.CurrentDay);

//        Thread t = new Thread(){
//            public void run(){
//                while(!isInterrupted()){
//
 //                   try{
 //                       Thread.sleep(86400000);
//
 //                       runOnUiThread(new Runnable() {
//                              });
//                        } catch (InterruptedException e){
//                        e.printStackTrace()
//                    }
//                }
//            }
//        }

        buttonObjectChoice1 =
                (Button) findViewById(R.id.TeacherButton);

        buttonObjectChoice2 =
                (Button) findViewById(R.id.EventsButton);

        buttonObjectChoice3 =
                (Button) findViewById(R.id.MapButton);

        buttonObjectChoice4 =
                (Button) findViewById(R.id.LinksButton);

        buttonObjectChoice1.setOnClickListener(this);
        buttonObjectChoice2.setOnClickListener(this);
        buttonObjectChoice3.setOnClickListener(this);
        buttonObjectChoice4.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){

            case R.id.TeacherButton:
                Intent i;
                i = new Intent(this, teachers.class);
                    startActivity(i);
                break;

            case R.id.EventsButton:
                i = new Intent(this, tips.class);
                    startActivity(i);
                break;

            case R.id.MapButton:
                i = new Intent(this, maps.class);
                    startActivity(i);
                break;

            case R.id.LinksButton:
                i = new Intent(this, links.class);
                    startActivity(i);
                break;
        }
    }
}
