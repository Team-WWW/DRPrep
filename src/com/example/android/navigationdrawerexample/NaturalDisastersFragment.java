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
	
	Button btnThunderstorm;
	Button btnWildfire;
	Button btnFlood;
	
	
	
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
        
        return rootView;
           
    }
    @Override
    public void onClick(View rootView) {
        switch (rootView.getId()) {
        case R.id.btnThunderstorm:

        	Intent a = new Intent(getActivity(), Thunderstorm.class);
        	startActivity(a);

            break;
        }
    }
    
//    public void onCreate(Bundle savedInstanceState) {
//      btnThunderstorm.setOnClickListener(btnonClickListener);
//      
//  }
//
//  private OnClickListener btnonClickListener = new OnClickListener() {
//      @Override
//      public void onClick(final View v) {
//          switch(v.getId()){
//              case R.id.btnThunderstorm:
//              	Intent a = new Intent(null, Thunderstorm.class);
//                  startActivity(a);
//              break;
//              
//          }
//      }
//  };
  }
