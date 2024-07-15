package com.fattah.pindahlayar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity3 extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        TextView tv1 = findViewById(R.id.textView3);
        Button btPindah1 = findViewById(R.id.button5);
        Button btPindah2 = findViewById(R.id.button6);
        btPindah1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iPindah1 = new Intent(MainActivity3.this, MainActivity2.class);
                startActivity(iPindah1);
            }
        });

        btPindah2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iPindah2 = new Intent(MainActivity3.this, MainActivity.class);
                startActivity(iPindah2);
            }
        });
    };
}
