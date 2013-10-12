package com.example.android.navigationdrawerexample;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;


public class PersonalEmergenciesFragment extends Fragment implements OnClickListener
{
	Button btnFight;
	Button btnAllergic;
	Button btnPoisonCtrl;
	Button btnBurn;
	Button btnInfection;
	Button btnChoking;
	Button btnBleeding;
	
    public PersonalEmergenciesFragment()
    {

    }

    @Override
    public View onCreateView(LayoutInflater inflator, ViewGroup container, Bundle savedInstanceState)
    {
        View rootView = inflator.inflate(R.layout.fragment_personal_emergencies, container, false);

        getActivity().setTitle("Personal Emergencies");
        
        Button fight = (Button) rootView.findViewById(R.id.btnFight);
        fight.setOnClickListener(this);
        
        Button aReaction = (Button) rootView.findViewById(R.id.btnAllergic);
        aReaction.setOnClickListener(this);
        
        Button pControl = (Button) rootView.findViewById(R.id.btnPoisonCtrl);
        pControl.setOnClickListener(this);
        
        Button burn = (Button) rootView.findViewById(R.id.btnBurn);
        burn.setOnClickListener(this);
        
        Button infection = (Button) rootView.findViewById(R.id.btnInfect);
        infection.setOnClickListener(this);
        
        Button choking = (Button) rootView.findViewById(R.id.btnChoking);
        choking.setOnClickListener(this);
        
        Button bleeding = (Button) rootView.findViewById(R.id.btnBleeding);
        bleeding.setOnClickListener(this);
        
        return rootView;
        
        
    }

    @Override
    public void onClick(View rootView) {
        switch (rootView.getId()) {
        case R.id.btnFight:
        	Intent a = new Intent(getActivity(), Assault.class);
        	startActivity(a);
            break;
        case R.id.btnAllergic:
        	Intent b = new Intent(getActivity(), AllergicReaction.class);
        	startActivity(b);
            break;
        case R.id.btnPoisonCtrl:
        	Intent c = new Intent(getActivity(), PoisonControl.class);
        	startActivity(c);
            break;
        case R.id.btnBurn:
        	Intent d = new Intent(getActivity(), Burns.class);
        	startActivity(d);
            break;
        case R.id.btnInfect:
        	Intent e = new Intent(getActivity(), Infection.class);
        	startActivity(e);
            break;
        case R.id.btnChoking:
        	Intent f = new Intent(getActivity(), Choking.class);
        	startActivity(f);
            break;
        case R.id.btnBleeding:
        	Intent g = new Intent(getActivity(), Bleeding.class);
        	startActivity(g);
            break;
        
        }
    }
}
