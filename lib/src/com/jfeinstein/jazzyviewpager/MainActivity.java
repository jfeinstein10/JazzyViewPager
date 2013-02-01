package com.jfeinstein.jazzyviewpager;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.view.Gravity;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;

import com.jfeinstein.jazzyviewpager.JazzyViewPager.TransitionEffect;

public class MainActivity extends Activity {
	
	private JazzyViewPager mJazzy;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mJazzy = (JazzyViewPager) findViewById(R.id.jazzy_pager);
		mJazzy.setTransitionEffect(TransitionEffect.Tablet);
		mJazzy.setFadeEnabled(true);
		mJazzy.setAdapter(new MainAdapter());
		mJazzy.setPageMargin(30);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

	private class MainAdapter extends PagerAdapter {
		@Override
		public Object instantiateItem(ViewGroup container, final int position) {
			TextView text = new TextView(MainActivity.this);
			text.setGravity(Gravity.CENTER);
			text.setTextSize(30);
			text.setTextColor(Color.WHITE);
			text.setText("Page " + position);
			text.setPadding(30, 30, 30, 30);
			text.setBackgroundColor(Color.BLACK);
			container.addView(text, LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT);
			mJazzy.setObjectForPosition(text, position);
			return text;
		}
		@Override
		public void destroyItem(ViewGroup container, int position, Object obj) {
			container.removeView((View) obj);
		}
		@Override
		public int getCount() {
			return 10;
		}
		@Override
		public boolean isViewFromObject(View arg0, Object arg1) {
			return arg0 == arg1;
		}		
	}

}
