package com.example.appdoctruyen.Adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.appdoctruyen.Fragmnet.DanhSachYeuThichFragment;
import com.example.appdoctruyen.Fragmnet.HomeFragment;

public class AdapterViewPage2 extends FragmentStateAdapter {

    public AdapterViewPage2(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new HomeFragment();
            case 1:
                return new DanhSachYeuThichFragment();
            default:
                return new HomeFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
