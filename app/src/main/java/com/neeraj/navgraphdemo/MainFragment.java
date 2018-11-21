package com.neeraj.navgraphdemo;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.navigation.Navigation;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;


/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment {

    Unbinder unbinder;


    public MainFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_main, container, false);
        unbinder = ButterKnife.bind(this, view);
        return view;
    }


    @OnClick(R.id.bt_account)
    void onAccountButtonClick() {
        Bundle bundle=new Bundle();
        bundle.putString("screen", "Account");

        if(getView()!=null)
        Navigation.findNavController(getView()).navigate(R.id.to_account_fragment, bundle);
    }


    @OnClick(R.id.bt_setting)
    void onSettingButtonClick() {

        Bundle bundle=new Bundle();
        bundle.putString("screen", "Settings");

        if(getView()!=null)
        Navigation.findNavController(getView()).navigate(R.id.to_setting_fragment, bundle);
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();

        // unbind the view to free some memory
        unbinder.unbind();
    }

}
