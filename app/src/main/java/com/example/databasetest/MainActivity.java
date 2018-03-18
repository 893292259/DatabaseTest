package com.example.databasetest;

import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private  MyDatabaseHelper helper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        helper = new MyDatabaseHelper(this,"BookStore.db",null,2);

        Button createdb = findViewById(R.id.add_data);
        createdb.setOnClickListener(v->{
            SQLiteDatabase db = helper.getWritableDatabase();

        });
    }
}
