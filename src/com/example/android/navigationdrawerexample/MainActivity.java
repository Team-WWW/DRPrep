/*
 * Copyright 2013 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.navigationdrawerexample;

import java.util.Locale;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.SearchManager;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.Button;
import android.view.View.OnClickListener;

/**
 * This example illustrates a common usage of the DrawerLayout widget
 * in the Android support library.
 * <p/>
 * <p>When a navigation (left) drawer is present, the host activity should detect presses of
 * the action bar's Up affordance as a signal to open and close the navigation drawer. The
 * ActionBarDrawerToggle facilitates this behavior.
 * Items within the drawer should fall into one of two categories:</p>
 * <p/>
 * <ul>
 * <li><strong>View switches</strong>. A view switch follows the same basic policies as
 * list or tab navigation in that a view switch does not create navigation history.
 * This pattern should only be used at the root activity of a task, leaving some form
 * of Up navigation active for activities further down the navigation hierarchy.</li>
 * <li><strong>Selective Up</strong>. The drawer allows the user to choose an alternate
 * parent for Up navigation. This allows a user to jump across an app's navigation
 * hierarchy at will. The application should treat this as it treats Up navigation from
 * a different task, replacing the current task stack using TaskStackBuilder or similar.
 * This is the only form of navigation drawer that should be used outside of the root
 * activity of a task.</li>
 * </ul>
 * <p/>
 * <p>Right side drawers should be used for actions, not navigation. This follows the pattern
 * established by the Action Bar that navigation should be to the left and actions to the right.
 * An action should be an operation performed on the current contents of the window,
 * for example enabling or disabling a data overlay on top of the current content.</p>
 */



public class MainActivity extends Activity {
    public DrawerLayout mDrawerLayout;
    public ListView mDrawerList;
    public ListView mDrawerList1;
    
    public ActionBarDrawerToggle mDrawerToggle;

    public CharSequence mDrawerTitle;
    public CharSequence mDrawerTitle1;//It says this is not used but it is?
    public CharSequence mTitle;
    public CharSequence mTitle1;
    
    public String[] mLinks;
    public String[] mLinks2;
    
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        new SimpleEula(this).show();
        

        mTitle = mDrawerTitle = getTitle();
        //mTitle1 = mDrawerTitle1 = getTitle();
        mLinks = getResources().getStringArray(R.array.menu);
        //mLinks2 = getResources().getStringArray(R.array.secondary_menu);
        
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        mDrawerList = (ListView) findViewById(R.id.left_drawer);
        //mDrawerList1 = (ListView) findViewById(R.id.Right_drawer);

        // set a custom shadow that overlays the main content when the drawer opens
        mDrawerLayout.setDrawerShadow(R.drawable.drawer_shadow, GravityCompat.START);
        // set up the drawer's list view with items and click listener
        mDrawerList.setAdapter(new ArrayAdapter<String>(this,
                R.layout.drawer_list_item, mLinks));     //changing this to mLinks2 makes both menus the same
        mDrawerList.setOnItemClickListener(new DrawerItemClickListener());
        
        
        

        // enable ActionBar app icon to behave as action to toggle nav drawer
        getActionBar().setDisplayHomeAsUpEnabled(true);
        getActionBar().setHomeButtonEnabled(true);
       
        //getActionBar().setDisplayShowTitleEnabled (false);  //Scott: This hides the title in the action bar!!!!
        //getActionBar().setTitle(mTestTitle); //Scott: Failed test
        

        
        
        
        // ActionBarDrawerToggle ties together the the proper interactions
        // between the sliding drawer and the action bar app icon
        mDrawerToggle = new ActionBarDrawerToggle(
                this,                  /* host Activity */
                mDrawerLayout,         /* DrawerLayout object */
                R.drawable.ic_drawer,  /* nav drawer image to replace 'Up' caret */
                R.string.drawer_open,  /* "open drawer" description for accessibility */
                R.string.drawer_close  /* "close drawer" description for accessibility */
                ) 
        {

//Doesn't seem to do anything        	
//            public void onDrawerClosed(View view) {
//                getActionBar().setTitle(mTitle);
//                invalidateOptionsMenu(); // creates call to onPrepareOptionsMenu()
//            }

//doesn't seem to do anything
//            public void onDrawerOpened(View drawerView) {
//                getActionBar().setTitle(mDrawerTitle);
//                invalidateOptionsMenu(); // creates call to onPrepareOptionsMenu()
//            }
        };
        mDrawerLayout.setDrawerListener(mDrawerToggle);

        if (savedInstanceState == null) {
            selectItem(0);
        }
    }

        
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    //Don't seem to need the below
    /* Called whenever we call invalidateOptionsMenu() 
    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        // If the nav drawer is open, hide action items related to the content view
        boolean drawerOpen = mDrawerLayout.isDrawerOpen(mDrawerList);
        boolean drawerOpen1 = mDrawerLayout.isDrawerOpen(mDrawerList1); //Scott: Maybe make an OR statement here to check if either are open. 
        //menu.findItem(R.id.action_OpenR).setVisible(!drawerOpen);  //Scott: this hides the right drawer button if the left drawer is open. 
        return super.onPrepareOptionsMenu(menu);
    }  //Don't seem to need the above so I'm commenting it out*/
    
    
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
         // The action bar home/up action should open or close the drawer.
         // ActionBarDrawerToggle will take care of this.
        if (mDrawerToggle.onOptionsItemSelected(item)) {
            return true;
        }
//             // Handle action buttons
//                switch(item.getItemId()) {
//                case R.id.action_OpenR:
//                   // create intent to perform web search for this planet
//                    Intent intent = new Intent(Intent.ACTION_VIEW);
//                    //intent.putExtra(SearchManager.QUERY, getActionBar().getTitle());
//                    // catch event that there's no activity to handle intent
//                    if (intent.resolveActivity(getPackageManager()) != null) {
//                       startActivity(intent);
//                    } else {
//                        Toast.makeText(this, R.string.app_not_available, Toast.LENGTH_LONG).show();
//                    }
                   return true;
//                default:
//                    return super.onOptionsItemSelected(item);
//                }
    }

    /* The click listener for ListView in the navigation drawer */
    public class DrawerItemClickListener implements ListView.OnItemClickListener {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            selectItem(position);
        }
    }
    
    

    /*
    void selectItem(int position) {
        switch(position) {
        case 1:
                Intent a = new Intent(MainActivity.this, NaturalDisasters.class);
                startActivity(a);
        break;
        case 2:
                Intent b = new Intent(MainActivity.this, StructuralEmergencies.class);
                startActivity(b);
        break;
        case 3:
            	Intent c = new Intent(MainActivity.this, PersonalEmergencies.class);
            	startActivity(c);
        break;
        default:
        	
        	
        }
        
        mDrawerList.setItemChecked(position, true);
    	setTitle(mLinks[position]);
    	mDrawerLayout.closeDrawer(mDrawerList);// update selected item and title, then close the drawer
    }
    */

    
    
    private void selectItem(int position) {
    	
        // Create a new fragment and specify the fragment to show based on position
        Fragment fragment = null;
        
        switch(position)
        {
	    	case 0:
	            fragment = new HomeFragment();
	    		break;
	    	case 1:
	            fragment = new NaturalDisastersFragment();
	    		break;
	    	case 2:
	            fragment = new StructuralEmergenciesFragment();
	    		break;
	    	case 3:
	    		fragment = new PersonalEmergenciesFragment();
	    		break;
	    	case 4:
	    		fragment = new AboutFragment();
	    		break;
	    	case 5:
	    		fragment = new ContactUsFragment();
	    		break;
	    	case 6:
	    		fragment = new HelpFragment();
	    		break;
	    	
        }
        
        if (fragment != null)
        {
            Bundle args = new Bundle();
            fragment.setArguments(args);

            // Insert the fragment by replacing any existing fragment
            FragmentManager fragmentManager = getFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.content_frame, fragment).commit();

            // Highlight the selected item, update the title, and close the drawer
            mDrawerList.setItemChecked(position, true);
            setTitle("");
            mDrawerLayout.closeDrawer(mDrawerList);        	
        }

    }
    

    @Override
    public void setTitle(CharSequence title) 
    {
        mTitle = title;
        
        getActionBar().setTitle(mTitle);
        
    }
    
   

    /**
     * When using the ActionBarDrawerToggle, you must call it during
     * onPostCreate() and onConfigurationChanged()...
     */

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        // Sync the toggle state after onRestoreInstanceState has occurred.
        mDrawerToggle.syncState();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        // Pass any configuration change to the drawer toggles
        mDrawerToggle.onConfigurationChanged(newConfig);
    }
    
    

    
    /**
     * Fragment that appears in the "content_frame", shows a planet
     */
  //  public static class PlanetFragment extends Fragment {
   //     public static final String ARG_PLANET_NUMBER = "planet_number";

  //      public PlanetFragment() {
            // Empty constructor required for fragment subclasses
  //      }

  //      @Override
  //      public View onCreateView(LayoutInflater inflater, ViewGroup container,
  //             Bundle savedInstanceState) {
   //         View rootView = inflater.inflate(R.layout.fragment_planet, container, false);
   //         int i = getArguments().getInt(ARG_PLANET_NUMBER);
   //         String planet = getResources().getStringArray(R.array.menu)[i];
   //         int imageId = getResources().getIdentifier(planet.toLowerCase(Locale.getDefault()),
   //                         "drawable", getActivity().getPackageName());
   //         ((ImageView) rootView.findViewById(R.id.image)).setImageResource(imageId);
   //         getActivity().setTitle(planet);
   //         return rootView;
  //      }
 //   }
}