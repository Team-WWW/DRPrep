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
        
        
        Button tStorm = (Button) rootView.findViewById(R.id.btnThunderstorm);
        tStorm.setOnClickListener(this);
        
        Button wFire = (Button) rootView.findViewById(R.id.btnWildfire);
        wFire.setOnClickListener(this);
        
        Button hWave = (Button) rootView.findViewById(R.id.btnTerroristAttack);
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
<<<<<<< HEAD
        case R.id.btnThunderstorm:
        	Intent a = new Intent(getActivity(), Thunderstorm.class);
        	startActivity(a);
            break;
        case R.id.btnTerroristAttack:
        	Intent b = new Intent(getActivity(), Thunderstorm.class);
        	startActivity(b);
        	break;
        case R.id.btnEarthquake:
        	Intent c = new Intent(getActivity(), Thunderstorm.class);
        	startActivity(c);
        	break;
        case R.id.btnFlood:
        	Intent d = new Intent(getActivity(), Thunderstorm.class);
        	startActivity(d);
        	break;
        case R.id.btnWildfire:
        	Intent e = new Intent(getActivity(), Thunderstorm.class);
        	startActivity(e);
        	break;
        case R.id.btnHurricane:
        	Intent f = new Intent(getActivity(), Thunderstorm.class);
        	startActivity(f);
        	break;
        case R.id.btnTornado:
        	Intent g = new Intent(getActivity(), Thunderstorm.class);
=======
        case R.id.btnBurns:
        	Intent a = new Intent(getActivity(), Burns.class);
        	startActivity(a);
            break;
        case R.id.btnBleeding:
        	Intent b = new Intent(getActivity(), Bleeding.class);
        	startActivity(b);
        	break;
        case R.id.btnAllergicReactions:
        	Intent c = new Intent(getActivity(), AllergicReaction.class);
        	startActivity(c);
        	break;
        case R.id.btnPoisonControl:
        	Intent d = new Intent(getActivity(), PoisonControl.class);
        	startActivity(d);
        	break;
        case R.id.btnAssault:
        	Intent e = new Intent(getActivity(), Assault.class);
        	startActivity(e);
        	break;
        case R.id.btnInfection:
        	Intent f = new Intent(getActivity(), Infestation.class);
        	startActivity(f);
        	break;
        case R.id.btnChoking:
        	Intent g = new Intent(getActivity(), Choking.class);
>>>>>>> a0699c276b4889fb35eb7d1b7247c0c64f5398c7
        	startActivity(g);
        	break;
        }
    }
    

  }
