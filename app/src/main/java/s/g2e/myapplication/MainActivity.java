package s.g2e.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.scwang.wave.MultiWaveHeader;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MultiWaveHeader waveHeader = findViewById(R.id.waveHeader);

    /*    waveHeader.setStartColor(R.color.colorPrimary);
        waveHeader.setCloseColor(R.color.colorPrimaryDark);
        waveHeader.setColorAlpha(.5f);

        waveHeader.setWaveHeight(50);
        waveHeader.setGradientAngle(360);
        waveHeader.setProgress(.8f);
        waveHeader.setVelocity(1f);
        waveHeader.setScaleY(-1f);

        waveHeader.setWaves("PairWave");*/

        waveHeader.start();
       // waveHeader.isRunning();



    }
}
