package com.nvk.viewpagerver3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ViewPager vpgSlider;
    private SliderAdapter sliderAdapter;
    private List<CauHoi> cauHois;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Radiation();
        CreateAdapter();
    }

    private void CreateAdapter() {
         cauHois = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            CauHoi cauHoi = new CauHoi(""+i,""+(i+1),""+(i+2),""+(i+3));
            cauHois.add(cauHoi);
        }


        sliderAdapter = new SliderAdapter(getSupportFragmentManager(),cauHois);
        Log.d("fragment",getSupportFragmentManager()+"");
        vpgSlider.setAdapter(sliderAdapter);
    }

    @Override
    public void onBackPressed() {
        if (vpgSlider.getCurrentItem() == 0){
            super.onBackPressed();
        }else{
            vpgSlider.setCurrentItem(vpgSlider.getCurrentItem() -1);
        }

    }

    private void Radiation() {
        vpgSlider = findViewById(R.id.vpgSlider);
    }


}
