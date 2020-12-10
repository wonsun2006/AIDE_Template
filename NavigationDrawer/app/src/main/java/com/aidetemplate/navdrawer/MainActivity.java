package com.aidetemplate.navdrawer;

import android.app.*;
import android.os.*;
import android.support.design.widget.*;
import android.view.*;
import android.widget.*;
import android.widget.AdapterView.*;
import android.support.v4.widget.*;

public class MainActivity extends Activity implements OnItemClickListener
{

	@Override
	public void onItemClick(AdapterView<?> p1, View p2, int p3, long p4)
	{
		FragmentManager fm = getFragmentManager();
		FragmentTransaction ft = fm.beginTransaction();
		
		switch(p3){
			case 0: {
				ft.replace(R.id.main, new Home_Activity());
				ft.commit();
				break;
			}
			case 1: { 
				ft.replace(R.id.main, new About_Activity());
				ft.commit();
				break;
			}
			case 2: { 
				ft.replace(R.id.main, new Contact_Activity());
				ft.commit();
				break;
			}
			case 3: {
				ft.replace(R.id.main, new Settings_Activity());
				ft.commit();
				break;
			}
			case 4: {
				ft.replace(R.id.main, new Help_Activity());
				ft.commit();
				break;
			}
		}
		
		DrawerLayout drawerLayout = (DrawerLayout)findViewById(R.id.drawerLayout);
		drawerLayout.closeDrawers();
	}
	
	NavigationView navigation;
	ListView navMenu;
	String menu[];
	ArrayAdapter<String> arrAdapter;
	
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
		navigation = (NavigationView)findViewById(R.id.navigation);
		View navView = getLayoutInflater().inflate(R.layout.nav_layout, null);
		
		navigation.addView(navView);
		
		navMenu = (ListView)findViewById(R.id.navigationMenu);
		
		menu = new String[]{"Home","About", "Contact", "Settings", "Help"};
		
		arrAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,menu);
  		navMenu.setAdapter(arrAdapter);
		
		navMenu.setOnItemClickListener(this);
	}
}
