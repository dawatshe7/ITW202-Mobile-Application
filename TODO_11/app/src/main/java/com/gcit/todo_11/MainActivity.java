package com.gcit.todo_11;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private String[] colorArray={"purple_200","purple_500","purple_700",
                                    "teal_200","teal_700","black","navy","pink"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.text);
    }
    public void changeColor(View view){
        Random random= new Random();
        String colorName = colorArray[random.nextInt(7)];

        int colorResourceName = getResources().getIdentifier(colorName,
                "color", getApplicationContext().getPackageName());

        int resColor= ContextCompat.getColor(this,colorResourceName);

        textView.setTextColor(resColor);

    }
}