package com.example.ekasilabalexcdtb.alextouringguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void GPS(View view) {
        Intent intent = new Intent(MainActivity.this, MapsActivity.class);
        startActivity(intent);
    }
    public void accomodation(View view) {
        Button button = (Button)findViewById(R.id.accomodation);
        final Animation myAnimBounce = AnimationUtils.loadAnimation(this, R.anim.abc_fade_in);
        button.startAnimation(myAnimBounce);
        Intent intent = new Intent(MainActivity.this, Activities.class);
        startActivity(intent);

    }
    public void activities(View view) {
        Intent intent = new Intent(MainActivity.this, Activities.class);
        startActivity(intent);
        Button button = (Button)findViewById(R.id.activities);
        final Animation myAnimBounce = AnimationUtils.loadAnimation(this, R.anim.abc_fade_in);
        button.startAnimation(myAnimBounce);
    }
    public void gallery(View view) {
        Intent intent = new Intent(MainActivity.this, Galleryyy.class);
        startActivity(intent);
        Button button = (Button)findViewById(R.id.gallery);
        final Animation myAnimBounce = AnimationUtils.loadAnimation(this, R.anim.abc_fade_in);
        button.startAnimation(myAnimBounce);
    }
    public void arts_and_crafts(View view) {
        Intent intent = new Intent(MainActivity.this, ArtsAndCrafts.class);
        startActivity(intent);
        Button button = (Button)findViewById(R.id.view_3);
        final Animation myAnimBounce = AnimationUtils.loadAnimation(this, R.anim.abc_fade_in);
        button.startAnimation(myAnimBounce);
    }
    public void food_and_drink(View view) {
        Intent intent = new Intent(MainActivity.this, FoodAndDrink.class);
        startActivity(intent);
        Button button = (Button)findViewById(R.id.view_4);
        final Animation myAnimBounce = AnimationUtils.loadAnimation(this, R.anim.abc_fade_in);
        button.startAnimation(myAnimBounce);
    }
    public void services(View view) {
        Intent intent = new Intent(MainActivity.this, Services.class);
        startActivity(intent);
        Button button = (Button)findViewById(R.id.view_5);
        final Animation myAnimBounce = AnimationUtils.loadAnimation(this, R.anim.abc_fade_in);
        button.startAnimation(myAnimBounce);
    }

}
