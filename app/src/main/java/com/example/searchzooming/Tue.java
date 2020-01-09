package com.example.searchzooming;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.SeekBar;

public class Tue extends AppCompatActivity {

    SeekBar s8;
    ImageView i8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tue);
        s8=(SeekBar)findViewById(R.id.seekBar5);
        i8=(ImageView)findViewById(R.id.imageView5);

        s8.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                float scale= ((progress/10.0f)+1);
                i8.setScaleX(scale);
                i8.setScaleY(scale);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}
