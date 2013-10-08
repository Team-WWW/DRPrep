package com.example.android.navigationdrawerexample;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;



public class NaturalDisastersFragment extends Fragment implements OnClickListener
{
	Button btnWildfire;
	Button btnEarthquake;
	Button btnFlood;
	Button btnThunderstorm;
	Button btnHurricane;
	Button btnTornado;
	Button btnHeatwave;
	
	
	
    public NaturalDisastersFragment()
    {

    }

    
    @Override
    public View onCreateView(LayoutInflater inflator, ViewGroup container, Bundle savedInstanceState)
    {
        View rootView = inflator.inflate(R.layout.fragment_natural_disasters, container, false);

        getActivity().setTitle("Natural Disasters!");
        
        
        Button tStorm = (Button) rootView.findViewById(R.id.btnBurns);
        tStorm.setOnClickListener(this);
        
        Button wFire = (Button) rootView.findViewById(R.id.btnAssault);
        wFire.setOnClickListener(this);
        
        Button hWave = (Button) rootView.findViewById(R.id.btnBleeding);
        hWave.setOnClickListener(this);
        
        Button eQuake = (Button) rootView.findViewById(R.id.btnAllergicReactions);
        eQuake.setOnClickListener(this);
        
        Button flood = (Button) rootView.findViewById(R.id.btnPoisonControl);
        flood.setOnClickListener(this);
        
        Button hurricane = (Button) rootView.findViewById(R.id.btnInfection);
        hurricane.setOnClickListener(this);
        
        Button tornado = (Button) rootView.findViewById(R.id.btnChoking);
        tornado.setOnClickListener(this);
        
        return rootView;
           
    }
    @Override
    public void onClick(View rootView) {
        switch (rootView.getId()) {
        case R.id.btnBurns:
        	Intent a = new Intent(getActivity(), Thunderstorm.class);
        	startActivity(a);
            break;
        case R.id.btnBleeding:
        	Intent b = new Intent(getActivity(), Thunderstorm.class);
        	startActivity(b);
        	break;
        case R.id.btnAllergicReactions:
        	Intent c = new Intent(getActivity(), Thunderstorm.class);
        	startActivity(c);
        	break;
        case R.id.btnPoisonControl:
        	Intent d = new Intent(getActivity(), Thunderstorm.class);
        	startActivity(d);
        	break;
        case R.id.btnAssault:
        	Intent e = new Intent(getActivity(), Thunderstorm.class);
        	startActivity(e);
        	break;
        case R.id.btnInfection:
        	Intent f = new Intent(getActivity(), Thunderstorm.class);
        	startActivity(f);
        	break;
        case R.id.btnChoking:
        	Intent g = new Intent(getActivity(), Thunderstorm.class);
        	startActivity(g);
        	break;
        }
    }
    

  }
