package com.jfeinstein.jazzyviewpager;

import com.jfeinstein.jazzyviewpager.JazzyViewPager.TransitionEffect;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		JazzyViewPager jazz = (JazzyViewPager) findViewById(R.id.jazzy_pager);
		jazz.setTransitionEffect(TransitionEffect.Tablet);
		jazz.setFadeEnabled(true);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
