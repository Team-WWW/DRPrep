package com.example.android.navigationdrawerexample;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Heatwave extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_heatwave);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.heatwave, menu);
		return true;
	}

}
