package com.gcit.todo_12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = " com.gcit.todo_12";
    private TextView donut, froyo, sandwich;
    private FloatingActionButton fab;
    private String mMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        donut = findViewById(R.id.txtDonut);
        froyo = findViewById(R.id.textfroyo);
        sandwich = findViewById(R.id.textsandwich);
        fab = findViewById(R.id.fab);

    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();
        return true;
    }

    public void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_LONG).show();

    }


    public void Donut(View view) {
        mMessage = getString(R.string.order);
        displayToast(mMessage);

    }

    public void Sandwich(View view) {
        mMessage = getString(R.string.order2);
        displayToast(mMessage);
    }

    public void Froyo(View view) {
        mMessage = getString(R.string.order3);
        displayToast(mMessage);
        ;
    }

    public void fab(View view) {

        Intent intent = new Intent(this, OrderActivity.class);
        intent.putExtra(EXTRA_MESSAGE, mMessage);
        startActivity(intent);

    }


}