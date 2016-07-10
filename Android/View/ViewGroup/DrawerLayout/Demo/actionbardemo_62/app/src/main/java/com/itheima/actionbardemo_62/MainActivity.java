package com.itheima.actionbardemo_62;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;

public class MainActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		findViewById(R.id.btn1).setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// app图标部分
				Intent intent = new Intent(MainActivity.this, TitleActivity.class);
				startActivity(intent);
			}
		});
		findViewById(R.id.btn2).setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// 导航模式
				Intent intent = new Intent(MainActivity.this, NavigationModeActivity.class);
				startActivity(intent);

			}
		});
		findViewById(R.id.btn3).setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// 操作按钮部分
				Intent intent = new Intent(MainActivity.this, ActionButtonActivity.class);
				startActivity(intent);
			}
		});
		findViewById(R.id.btn4).setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// splite模式
				Intent intent = new Intent(MainActivity.this, SplitActivity.class);
				startActivity(intent);
				
			}
		});
		findViewById(R.id.btn5).setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// splite模式
				Intent intent = new Intent(MainActivity.this, ActionModeActivity.class);
				startActivity(intent);
				
			}
		});

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
