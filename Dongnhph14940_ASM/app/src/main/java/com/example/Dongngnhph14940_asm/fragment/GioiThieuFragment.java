package com.example.Dongngnhph14940_asm.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.Dongngnhph14940_asm.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class GioiThieuFragment extends Fragment {

    public GioiThieuFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_gioi_thieu, container, false);
    }
}
