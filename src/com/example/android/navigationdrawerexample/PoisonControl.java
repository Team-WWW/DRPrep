package com.example.android.navigationdrawerexample;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class PoisonControl extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_poison_control);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.poison_control, menu);
		return true;
	}

}