package com.example.siebster.eventfriend;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by Siebe on 2/03/2019.
 */

public class InterestActivity extends AppCompatActivity {

    public Boolean food_bool = false;
    public Boolean art_bool = false;
    public Boolean music_bool = false;
    public String toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.interest);

        Button food = (Button) findViewById(R.id.food_button);
        Button art = (Button) findViewById(R.id.art_button);
        Button music = (Button) findViewById(R.id.music_button);

        food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if(food_bool) {
                    toast = "Food removed";
                    food_bool = false;
                }
                else {
                    toast = "Food added";
                    food_bool = true;
                }
                Toast.makeText(InterestActivity.this, toast, Toast.LENGTH_SHORT).show();
            }
        });
        art.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if(art_bool) {
                    toast = "Art removed";
                    art_bool = false;
                }
                else {
                    toast = "Art added";
                    art_bool = true;
                }
                Toast.makeText(InterestActivity.this, toast, Toast.LENGTH_SHORT).show();
            }
        });
        music.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if(music_bool) {
                    toast = "Music removed";
                    music_bool = false;
                }
                else {
                    toast = "Music added";
                    music_bool = true;
                }
                Toast.makeText(InterestActivity.this, toast, Toast.LENGTH_SHORT).show();
            }
        });


    }

}
