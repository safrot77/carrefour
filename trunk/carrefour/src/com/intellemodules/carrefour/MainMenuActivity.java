package com.intellemodules.carrefour;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;


public class MainMenuActivity extends TabActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_menu);
		
		
		TabHost tabHost = getTabHost();
        
        // Tab for Promotions
        TabSpec promospec = tabHost.newTabSpec(getString(R.string.promotions));
        // setting Title and Icon for the Tab
        promospec.setIndicator("", getResources().getDrawable(R.drawable.icons_promo_tabs));
        Intent promoIntent = new Intent(this, PromotionsActivity.class);
        promospec.setContent(promoIntent);
         
        // Tab for Departments
        TabSpec deptspec = tabHost.newTabSpec(getString(R.string.departments));        
        deptspec.setIndicator("", getResources().getDrawable(R.drawable.departmrents));
        Intent deptIntent = new Intent(this, DepartmentsActivity.class);
        deptspec.setContent(deptIntent);
         
        // Tab for Services
        TabSpec servicesspec = tabHost.newTabSpec(getString(R.string.services));
        servicesspec.setIndicator("", getResources().getDrawable(R.drawable.services));
        Intent servicesIntent = new Intent(this, ServicesActivity.class);
        servicesspec.setContent(servicesIntent);
        
        // Tab for Branches
        TabSpec branches = tabHost.newTabSpec(getString(R.string.branches));
        branches.setIndicator("", getResources().getDrawable(R.drawable.branches));
        Intent branchesIntent = new Intent(this, BranchesActivity.class);
        branches.setContent(branchesIntent);
         
        
        // Tab for Shopping List
        TabSpec shoppingspec = tabHost.newTabSpec(getString(R.string.shoppingList));
        shoppingspec.setIndicator("", getResources().getDrawable(R.drawable.shopping_list));
        Intent shopIntent = new Intent(this, ShoppingListActivity.class);
        shoppingspec.setContent(shopIntent);
        
        
        // Tab for You and Us
        TabSpec youAndUsspec = tabHost.newTabSpec(getString(R.string.youAndUs));
        youAndUsspec.setIndicator("", getResources().getDrawable(R.drawable.you_uss));
        Intent youAndUsIntent = new Intent(this, YouAndUsActivity.class);
        youAndUsspec.setContent(youAndUsIntent);
        
        
        
        
        
        
        // Adding all TabSpec to TabHost
        tabHost.addTab(promospec); // Adding promotion tab
        tabHost.addTab(deptspec); // Adding departments tab
        tabHost.addTab(servicesspec); // Adding services tab
        tabHost.addTab(branches); // Adding branches tab
        tabHost.addTab(shoppingspec); // Adding shopping list tab
        tabHost.addTab(youAndUsspec); // Adding you and us tab
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main_menu, menu);
		return true;
	}

}
