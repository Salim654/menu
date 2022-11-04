package com.example.tpmenu;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();

        inflater.inflate(R.menu.mymenu, menu);

        return true;

    }
    public boolean onOptionsItemSelected(MenuItem item) {
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        AlertDialog.Builder builder2 = new AlertDialog.Builder(MainActivity.this);
        builder.setMessage("U choosed Club?");
        builder2.setMessage("U choosed country?");
        builder.setTitle("Menu !");
        builder2.setTitle("Menu !");

        switch (item.getItemId()) {

            case R.id.club:

                AlertDialog alertDialog = builder.create();
                alertDialog.show();

                return true;

            case R.id.country:

                AlertDialog alertDialog2 = builder2.create();
                alertDialog2.show();

                return true;

            default:

                return super.onOptionsItemSelected(item);

        }

    }
}