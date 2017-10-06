package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button askButton = (Button)findViewById(R.id.button2);


        askButton.setOnClickListener(new View.OnClickListener(){
        public void onClick(View v){
            int[] arr = new int[5];
            arr[0]=R.drawable.ball1;
            arr[1]=R.drawable.ball2;
            arr[2]=R.drawable.ball3;
            arr[3]=R.drawable.ball4;
            arr[4]=R.drawable.ball5;

            Random rnd = new Random();
            ImageView img = (ImageView)findViewById(R.id.imageView);
            img.setImageResource(arr[rnd.nextInt(5)]);
        }
            });

    }
}
