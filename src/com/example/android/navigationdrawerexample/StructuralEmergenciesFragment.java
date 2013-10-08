package com.example.android.navigationdrawerexample;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.view.View.OnClickListener;



public class StructuralEmergenciesFragment extends Fragment implements OnClickListener
{
	
	Button btnPoweroutage;
	Button btnGasLeak;
	Button btnCo;
	Button btnCarCrash;
	Button btnHurricane;
	Button btnTornado;
	Button btnHeatwave;
	

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

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}
    
    }

