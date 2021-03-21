package com.example.todo_4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    public static final String Extra_reply = "com.example.todo4";
    private TextView textview;
    private EditText mreply;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textview = findViewById(R.id.txt);
        Intent intent =getIntent();
        String message =intent.getStringExtra(MainActivity.Extra_message);
        textview.setText(message);
    }


    public void reply(View view) {
        String reply =mreply.getText().toString();
        Intent intent=new Intent();
        intent.putExtra(Extra_reply,reply);
        setResult(RESULT_OK,intent);
        finish();

    }
}