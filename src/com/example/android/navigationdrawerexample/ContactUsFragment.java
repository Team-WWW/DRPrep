package com.example.android.navigationdrawerexample;



import android.app.Fragment;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.text.Html;


public class ContactUsFragment extends Fragment implements OnClickListener
{
   

  @Override
    public View onCreateView(LayoutInflater inflator, ViewGroup container, Bundle savedInstanceState)
    {
      View rootView = inflator.inflate(R.layout.fragment_contact_us, container, false);

       getActivity().setTitle("Contact Us");
       
       Button button;
       
       button = (Button) rootView.findViewById(R.id.button1);
       button.setOnClickListener(this);
            
        
       return rootView;
   }




	@Override
	public void onClick(View v) {
		switch(v.getId())
		{
		case R.id.button1:
			Intent emailIntent = new Intent(android.content.Intent.ACTION_SEND);
			String[] recipients = new String[]{"devryscott@gmail.com", "thorn79@gmail.com",};
			emailIntent.putExtra(android.content.Intent.EXTRA_EMAIL, recipients);
			emailIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "DRPrep Feedback");
			emailIntent.putExtra(android.content.Intent.EXTRA_TEXT, "Please type your comment or question below: \n\n\n\n");
			emailIntent.setType("text/plain");
			startActivity(Intent.createChooser(emailIntent, "Send Email with..."));
			//finish();
			break;
		

		}
	}
}
