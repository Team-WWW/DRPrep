package com.example.android.navigationdrawerexample;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class HelpFragment extends Fragment
{
    public HelpFragment()
    {

    }

    @Override
    public View onCreateView(LayoutInflater inflator, ViewGroup container, Bundle savedInstanceState)
    {
        View rootView = inflator.inflate(R.layout.fragment_help, container, false);

        getActivity().setTitle("Help");
        
        return rootView;
    }
}
