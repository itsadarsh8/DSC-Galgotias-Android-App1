package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int i=0;
    TextView couterbutton;

    public void counterMethod(View view){

        couterbutton.setText(String.valueOf(++i));
    }

    public void toastButton(View view){

    Toast.makeText(getApplicationContext(),"Hello DSC",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        couterbutton =(TextView)findViewById(R.id.counterId);
    }
}
