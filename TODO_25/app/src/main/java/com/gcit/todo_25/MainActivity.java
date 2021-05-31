package com.gcit.todo_25;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    DatabaseHelper myDb;
    EditText FName, LName, Marks, Id;
    Button add, view, delete, update;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myDb = new DatabaseHelper(this);
        FName = findViewById(R.id.fname);
        LName = findViewById(R.id.lname);
        Marks = findViewById(R.id.marks);
        Id = findViewById(R.id.idNum);
        add = findViewById(R.id.add);

    }

    public void addData(View view) {
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean isInserted = myDb.insertData(Id.getText().toString(),
                        LName.getText().toString(),
                        Marks.getText().toString(), FName.getText().toString());
                if (isInserted == true)
                    Toast.makeText(MainActivity.this, "Data Inserted", Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(MainActivity.this, "Data not Inserted", Toast.LENGTH_LONG).show();


            }
        });


    }

    public void ViewData(View view) {
    }

    public void UpdateData(View view) {
    }

    public void DeleteData(View view) {
    }
}