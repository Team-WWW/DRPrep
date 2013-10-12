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

        getActivity().setTitle("Natural Disasters");
        
        
        Button tStorm = (Button) rootView.findViewById(R.id.btnThunderstorm);
        tStorm.setOnClickListener(this);
        
        Button wFire = (Button) rootView.findViewById(R.id.btnWildfire);
        wFire.setOnClickListener(this);
        
        Button hWave = (Button) rootView.findViewById(R.id.btnHeatwave);
        hWave.setOnClickListener(this);
        
        Button eQuake = (Button) rootView.findViewById(R.id.btnEarthquake);
        eQuake.setOnClickListener(this);
        
        Button flood = (Button) rootView.findViewById(R.id.btnFlood);
        flood.setOnClickListener(this);
        
        Button hurricane = (Button) rootView.findViewById(R.id.btnHurricane);
        hurricane.setOnClickListener(this);
        
        Button tornado = (Button) rootView.findViewById(R.id.btnTornado);
        tornado.setOnClickListener(this);
        
        return rootView;
           
    }
    @Override
    public void onClick(View rootView) {
        switch (rootView.getId()) {
        case R.id.btnThunderstorm:
        	Intent a = new Intent(getActivity(), Thunderstorm.class);
        	startActivity(a);
            break;
        case R.id.btnWildfire:
        	Intent b = new Intent(getActivity(), Wildfire.class);
        	startActivity(b);
        	break;
        case R.id.btnHeatwave:
        	Intent c = new Intent(getActivity(), Heatwave.class);
        	startActivity(c);
        	break;
        case R.id.btnEarthquake:
        	Intent d = new Intent(getActivity(), Earthquake.class);
        	startActivity(d);
        	break;
        case R.id.btnFlood:
        	Intent e = new Intent(getActivity(), Flood.class);
        	startActivity(e);
        	break;
        case R.id.btnHurricane:
        	Intent f = new Intent(getActivity(), Hurricane.class);
        	startActivity(f);
        	break;
        case R.id.btnTornado:
        	Intent g = new Intent(getActivity(), Tornado.class);
        	startActivity(g);
        	break;
        }
    }
    

  }
