package com.example.admin.simpleapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button fine_button , not_fine_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fine_button = (Button)findViewById(R.id.fine_button);
        not_fine_button = (Button)findViewById(R.id.not_fine_button);
    }

    public void fine_button(View view) {
        Intent myIntent = new Intent(this, Main2Activity.class);
        startActivity(myIntent);
        finish();

    }
    

    public void not_fine_button(View view) {
        Toast.makeText(MainActivity.this, "Disappointing!", Toast.LENGTH_SHORT).show();

    }


}
