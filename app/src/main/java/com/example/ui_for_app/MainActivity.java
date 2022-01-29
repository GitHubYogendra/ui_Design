package com.example.ui_for_app;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button next = (Button) findViewById(R.id.button);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), AboutCollege.class);
                startActivity(intent);
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        super.onPrepareOptionsMenu(menu);
        // If this is a new pet, hide the "Delete" menu item.
        MenuItem menuItem = menu.findItem(R.id.action_save);
        MenuItem menuItem1 = menu.findItem(R.id.action_save1);
        menuItem.setVisible(true);
        menuItem1.setVisible(true);
        return true;
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.action_save:
                Intent intent = new Intent(getApplicationContext(),AboutCollege.class);
                startActivity(intent);
                break;

            case R.id.action_save1:
                Intent intent1 = new Intent(getApplicationContext(), AboutApp.class);
                startActivity(intent1);
                break;

            case R.id.action_save2:
                //insted of MainActivity use log in.
                Intent intent2 = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent2);
                break;

        }
        return super.onOptionsItemSelected(item);

    }
}