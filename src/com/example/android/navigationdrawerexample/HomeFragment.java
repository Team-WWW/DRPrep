package com.example.android.navigationdrawerexample;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.view.View.OnClickListener;


public class HomeFragment extends Fragment implements OnClickListener
{
	
	Button btnDisaster_Kit;
	
    public HomeFragment()
    {

    }

    @Override
    public View onCreateView(LayoutInflater inflator, ViewGroup container, Bundle savedInstanceState)
    {
        View rootView = inflator.inflate(R.layout.fragment_home, container, false);

        getActivity().setTitle("Home!");
        
        Button dResourceKit = (Button) rootView.findViewById(R.id.btnDisaster_Kit);
        dResourceKit.setOnClickListener(this);
        
        return rootView;
    }
    
    @Override
    public void onClick(View rootView) {
        switch (rootView.getId()) {
        case R.id.btnDisaster_Kit:
        	Intent a = new Intent(getActivity(), DisasterResourceKit.class);
        	startActivity(a);
            break;
        
        }
    }
}
