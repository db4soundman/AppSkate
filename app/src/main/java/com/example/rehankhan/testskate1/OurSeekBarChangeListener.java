package com.example.rehankhan.testskate1;

import android.widget.SeekBar;

/**
 * Created by Doug4 on 12/12/17.
 */

public class OurSeekBarChangeListener implements SeekBar.OnSeekBarChangeListener{

    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
        if (b) {
            // call to arduino
        }
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {
int x = 4+5;
    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {
        seekBar.setProgress(50, true);
    }

}
