package com.desafiolatam.myappclass;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);





    }


    private void intentExample() {
        Intent intent = new Intent(this, Main4Activity.class);
        startActivity(intent);

    }
}
