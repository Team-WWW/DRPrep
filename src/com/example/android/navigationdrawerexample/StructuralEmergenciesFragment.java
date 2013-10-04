package com.example.android.navigationdrawerexample;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class StructuralEmergenciesFragment extends Fragment
{
    public StructuralEmergenciesFragment()
    {

    }

    @Override
    public View onCreateView(LayoutInflater inflator, ViewGroup container, Bundle savedInstanceState)
    {
        View rootView = inflator.inflate(R.layout.fragment_structural_emergencies, container, false);

        getActivity().setTitle("Structural Emergencies!");
        
        return rootView;
    }
}
