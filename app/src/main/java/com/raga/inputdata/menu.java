package com.raga.inputdata;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class menu extends AppCompatActivity {

    Button bt1, bt2, bt3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        bt1 = (Button)findViewById(R.id.button1);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(menu.this, Inputdata.class));
                Toast.makeText(menu.this, "please input your data", Toast.LENGTH_SHORT).show();
            }
        });
        bt2 = (Button)findViewById(R.id.button2);
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(menu.this, sahabat.class));
                Toast.makeText(menu.this, "selamat membaca", Toast.LENGTH_SHORT).show();
            }
        });
        bt3 = (Button)findViewById(R.id.button3);
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(menu.this, developer.class));
                Toast.makeText(menu.this, "my biodata", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
