package com.example.Dongngnhph14940_asm.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.Dongngnhph14940_asm.fragment.ThongKeChiFragment;
import com.example.Dongngnhph14940_asm.fragment.ThongKeThuFragment;

public class ThongKeVPAdapter extends FragmentStatePagerAdapter {
    public ThongKeVPAdapter(FragmentManager fm){
        super(fm);
    }
    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                ThongKeChiFragment f0 = new ThongKeChiFragment();
                return f0;
            case 1:
                ThongKeThuFragment f1 = new ThongKeThuFragment();
                return f1;
            default:
                return null;
        }

    }

    @Override
    public int getCount() {
        return 2;
    }

}
