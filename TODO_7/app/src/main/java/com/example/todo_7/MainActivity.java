package com.example.todo_7;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public TextView txt;
     public int mcount=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt =(TextView)findViewById(R.id.zero);

        if (savedInstanceState!=null){
            txt.setText(toString().valueOf(savedInstanceState.getInt("mcount")));

        }
    }


    public void click(View view) {
        mcount++;
            txt.setText(Integer.toString(mcount));

    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("mcount",mcount);

    }
}