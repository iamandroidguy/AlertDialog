package com.upreti.alertdialog;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button vButton;
AlertDialog.Builder alb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        alb = new AlertDialog.Builder(MainActivity.this);
        vButton = findViewById(R.id.button);
        alb.setCancelable(true);
        alb.setTitle("Warning!");
        alb.setMessage("Do you really want to delete this?");
        alb.setIcon(android.R.drawable.ic_media_play);
        alb.setPositiveButton("Yes", null);
        alb.setNegativeButton("No",null);

    }

    public void alert(View view) {
        alb.show();
        Toast.makeText(this, "You clicked button!", Toast.LENGTH_SHORT).show();

    }
}
