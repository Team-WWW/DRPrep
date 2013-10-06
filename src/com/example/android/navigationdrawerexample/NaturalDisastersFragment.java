package com.example.android.navigationdrawerexample;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.view.View.OnClickListener;


public class NaturalDisastersFragment extends Fragment
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
        
        return rootView;
    }
    
//    public void onCreate(Bundle savedInstanceState) {
//      btnThunderstorm.setOnClickListener(onClickListener);
//      btnWildfire.setOnClickListener(onClickListener);
//      btnFlood.setOnClickListener(onClickListener);
//  }
//
//  private OnClickListener onClickListener = new OnClickListener() {
//      @Override
//      public void onClick(final View v) {
//          switch(v.getId()){
//              case R.id.btnThunderstorm:
//              	Intent a = new Intent(null, ContactUsFragment.class);
//                  startActivity(a);
//              break;
//              case R.id.btnWildfire:
//                   //DO something
//              break;
//              case R.id.btnFlood:
//                   //DO something
//              break;
//          }
//      }
//  };
    }
