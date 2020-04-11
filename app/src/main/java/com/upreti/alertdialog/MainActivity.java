package com.upreti.alertdialog;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //Declare variables
Button vButton;
AlertDialog.Builder alb; //alb is a variable for AlertDialog.builder class
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initialise variable and connect the xml to Java code
        vButton = findViewById(R.id.button);

        //Create a new object for accessing AlertDialog.builder class
        alb = new AlertDialog.Builder(MainActivity.this);

        //Access the methods of AlertDialog.builder class using the object "alb"
        alb.setCancelable(true);
        alb.setTitle("Warning!");
        alb.setMessage("Do you really want to delete this?");
        alb.setIcon(android.R.drawable.ic_media_play);
        alb.setPositiveButton("Yes", null);
        alb.setNegativeButton("No",null);

    }
    // Method for button listener.
    // Call the show method of AlertDialog.builder class using the object "alb"
    //Toast is just for verification
    public void alert(View view) {
        alb.show();
        Toast.makeText(this, "You clicked button!", Toast.LENGTH_SHORT).show();

    }
}
