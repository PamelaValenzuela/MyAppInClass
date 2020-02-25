package com.desafiolatam.myappclass;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Button button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Main3Activity.this, "ingresando", Toast.LENGTH_SHORT).show();
                intentExample();
            }


        });


    }

    private void intentExample() {
        Intent intent = new Intent(this, Main4Activity.class);
        startActivity(intent);
    }
}


