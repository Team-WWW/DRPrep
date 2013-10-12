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
	Button btnExplosion;
	Button btnCarCrash;
	Button btnInfestation;
	Button btnTerroristAttack;
	

    public StructuralEmergenciesFragment()
    {

    }

    @Override
    public View onCreateView(LayoutInflater inflator, ViewGroup container, Bundle savedInstanceState)
    {
        View rootView = inflator.inflate(R.layout.fragment_structural_emergencies, container, false);

        getActivity().setTitle("Structural Emergencies");
        
        Button pOutage = (Button) rootView.findViewById(R.id.btnPoweroutage);
        pOutage.setOnClickListener(this);
        
        Button gLeak = (Button) rootView.findViewById(R.id.btnGasLeak);
        gLeak.setOnClickListener(this);
        
        Button co = (Button) rootView.findViewById(R.id.btnCo);
        co.setOnClickListener(this);
        
        Button explosion = (Button) rootView.findViewById(R.id.btnExplosion);
        explosion.setOnClickListener(this);
        
        Button cCrash = (Button) rootView.findViewById(R.id.btnCarCrash);
        cCrash.setOnClickListener(this);
        
        Button infestation = (Button) rootView.findViewById(R.id.btnInfestation);
        infestation.setOnClickListener(this);
        
        Button tAttack = (Button) rootView.findViewById(R.id.btnTerroristAttack);
        tAttack.setOnClickListener(this);
        
        return rootView;
    }

    @Override
    public void onClick(View rootView) {
        switch (rootView.getId()) {
        case R.id.btnPoweroutage:
        	Intent a = new Intent(getActivity(), PowerOutage.class);
        	startActivity(a);
            break;
        case R.id.btnGasLeak:
        	Intent b = new Intent(getActivity(), GasLeak.class);
        	startActivity(b);
        	break;
        case R.id.btnCo:
        	Intent c = new Intent(getActivity(), COPoison.class);
        	startActivity(c);
        	break;
        case R.id.btnExplosion:
        	Intent d = new Intent(getActivity(), Explosion.class);
        	startActivity(d);
        	break;
        case R.id.btnCarCrash:
        	Intent e = new Intent(getActivity(), CarCrash.class);
        	startActivity(e);
        	break;
        case R.id.btnInfestation:
        	Intent f = new Intent(getActivity(), Infestation.class);
        	startActivity(f);
        	break;
        case R.id.btnTerroristAttack:
        	Intent g = new Intent(getActivity(), TerroristAttack.class);
        	startActivity(g);
        	break;
        }
    }
    
    }

