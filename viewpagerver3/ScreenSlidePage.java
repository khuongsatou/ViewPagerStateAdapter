package com.nvk.viewpagerver3;


import android.graphics.Color;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class ScreenSlidePage extends Fragment {
    private List<CauHoi> cauHois;
    private int position;
    public ScreenSlidePage(List<CauHoi> cauHois,int position) {
        this.cauHois = cauHois;
        this.position = position;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.d("startActivity","onCreate");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_screen_slide_page, container, false);

        ViewHolder viewHolder = new ViewHolder();
        LinearLayout linearLayout = view.findViewById(R.id.linLayout);
        if (position % 2 == 0){
            linearLayout.setBackgroundColor(Color.RED);
        }else{
            linearLayout.setBackgroundColor(Color.BLUE);
        }

        Log.d("startActivity","onCreateView");
        //Log.d("startActivity","s1");
        viewHolder.tvCau1 = view.findViewById(R.id.tvCau1);
        viewHolder.tvCau2 = view.findViewById(R.id.tvCau2);
        viewHolder.tvCau3 = view.findViewById(R.id.tvCau3);
        viewHolder.tvCau4 = view.findViewById(R.id.tvCau4);

        viewHolder.tvCau1.setText(cauHois.get(position).getCau1());
        viewHolder.tvCau2.setText(cauHois.get(position).getCau2());
        viewHolder.tvCau3.setText(cauHois.get(position).getCau3());
        viewHolder.tvCau4.setText(cauHois.get(position).getCau4());
        return view;
    }

    private class ViewHolder{
        public TextView tvCau1,tvCau2,tvCau3,tvCau4;
    }

}
