package com.fattah.pindahlayar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity2 extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView tv1 = findViewById(R.id.textView2);
        Button btPindah1 = findViewById(R.id.button3);
        Button btPindah2 = findViewById(R.id.button4);
        btPindah1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iPindah1 = new Intent(MainActivity2.this, MainActivity3.class);
                startActivity(iPindah1);
            }
        });

        btPindah2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iPindah2 = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(iPindah2);
            }
        });
    };
}
