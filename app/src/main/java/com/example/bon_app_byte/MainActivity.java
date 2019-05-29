package com.example.bon_app_byte;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button edit = (Button)findViewById(R.id.button);
        Button disp =(Button)findViewById(R.id.button2);
        Button Orderq = (Button)findViewById(R.id.button3);


        edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Edit_Menu.class);
                startActivity(intent);
            }
        });
        disp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Menu.class);
                startActivity(intent);
            }
        });
    }
}
