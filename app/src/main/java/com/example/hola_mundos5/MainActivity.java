package com.example.hola_mundos5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int result = check();
        Toast.makeText(this, "Hola estoy aprendinedo este curso:"+result, Toast.LENGTH_SHORT).show();
    }

    private int check() {
        int a = 5;
        int b = 20;
        int c = 20;
        int bf = 12;


        if(a > b ){
            return 0 ;

        }else{
            if(c > b){
                return c;
            }else
                return bf;

        }



    }




}