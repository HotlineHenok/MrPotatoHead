package com.example.s.mrpotatohead;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class OnlyActivity extends AppCompatActivity {
    ImageView arms = (ImageView) findViewById(R.id.arms);
    ImageView shoes = (ImageView) findViewById(R.id.shoes);
    ImageView hat = (ImageView) findViewById(R.id.hat);
    ImageView glasses = (ImageView) findViewById(R.id.glasses);
    ImageView mustache = (ImageView) findViewById(R.id.mustache);
    ImageView nose = (ImageView) findViewById(R.id.nose);
    ImageView mouth = (ImageView) findViewById(R.id.mouth);
    ImageView eyebrows = (ImageView) findViewById(R.id.eyebrows);
    ImageView eyes = (ImageView) findViewById(R.id.eyes);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_only);
    }

    public void CheckClicked(View view) {
        boolean checked = ((CheckBox) view).isChecked();

        switch (view.getId()) {
            case R.id.check_arms:
                if (checked) {
                    arms.setVisibility(View.VISIBLE);
                } else {
                    arms.setVisibility(View.INVISIBLE);
                }
            case R.id.check_shoes:
                if (checked) {
                    shoes.setVisibility(View.VISIBLE);
                } else {
                    shoes.setVisibility(View.INVISIBLE);
                }
            case R.id.check_hat:
                if (checked) {
                    hat.setVisibility(View.VISIBLE);
                } else {
                    hat.setVisibility(View.INVISIBLE);
                }
            case R.id.check_glasses:
                if (checked) {
                    glasses.setVisibility(View.VISIBLE);
                } else {
                    glasses.setVisibility(View.INVISIBLE);
                }
            case R.id.check_mustache:
                if (checked) {
                    mustache.setVisibility(View.VISIBLE);
                } else {
                    mustache.setVisibility(View.INVISIBLE);
                }
            case R.id.check_nose:
                if (checked) {
                    nose.setVisibility(View.VISIBLE);
                } else {
                    nose.setVisibility(View.INVISIBLE);
                }
            case R.id.check_mouth:
                if (checked) {
                    mouth.setVisibility(View.VISIBLE);
                } else {
                    mouth.setVisibility(View.INVISIBLE);
                }
            case R.id.check_eyebrows:
                if (checked) {
                    eyebrows.setVisibility(View.VISIBLE);
                } else {
                    eyebrows.setVisibility(View.INVISIBLE);
                }
            case R.id.check_eyes:
                if (checked) {
                    eyes.setVisibility(View.VISIBLE);
                } else {
                    eyes.setVisibility(View.INVISIBLE);
                }
        }
    }
}