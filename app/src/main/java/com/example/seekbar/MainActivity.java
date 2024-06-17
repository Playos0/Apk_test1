package com.example.seekbar;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tekst;
    String [] napis = { "Dzień dobry", "Guten morgen", "Buenos dias"};
    int i = 1;
    Button button;
    SeekBar seekBar;
    @SuppressLint({"MissingInflatedId", "NewApi"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tekst = (TextView) findViewById(R.id.textView1);
        button = (Button) findViewById(R.id.button);
        seekBar = (SeekBar) findViewById(R.id.seekBar);
        seekBar.setMax(65);
        seekBar.setMin(24);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                tekst.setTextSize(i);

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (i > 2){
                    i=0;
                }
                tekst.setText(napis[i]);
                i++;
            }
        });
    }
}