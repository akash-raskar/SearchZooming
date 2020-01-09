package com.example.searchzooming;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.SeekBar;

public class Mon extends AppCompatActivity {
    SeekBar s5;
    ImageView i5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mon);
        s5=(SeekBar)findViewById(R.id.seekBar2);
        i5=(ImageView)findViewById(R.id.imageView2);

        s5.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                float scale= ((progress/10.0f)+1);
                i5.setScaleX(scale);
                i5.setScaleY(scale);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });}
}
