package com.nvk.viewpagerver3;

import android.widget.Adapter;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.List;

public class SliderAdapter extends FragmentStatePagerAdapter {

    private List<CauHoi> cauHoiList;
    private static final int NUMBER_PAGE = 3;


    public SliderAdapter(FragmentManager fm,List<CauHoi> cauHois) {
        super(fm);
        this.cauHoiList = cauHois;
    }

    @Override
    public Fragment getItem(int position) {
        return new ScreenSlidePage(cauHoiList,position);//khởi tạo lần đầu 2 fragment
    }

    @Override
    public int getCount() {
        return cauHoiList.size();
    }
}
