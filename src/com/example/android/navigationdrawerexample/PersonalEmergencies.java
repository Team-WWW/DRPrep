package com.example.android.navigationdrawerexample;

import android.os.Bundle;

import android.view.Menu;

public class PersonalEmergencies extends MainActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_personal_emergencies);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.personal_emergencies, menu);
		return super.onCreateOptionsMenu(menu);

	}

}
