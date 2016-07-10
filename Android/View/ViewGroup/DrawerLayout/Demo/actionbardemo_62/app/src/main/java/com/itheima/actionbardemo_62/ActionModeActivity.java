package com.itheima.actionbardemo_62;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.view.ActionMode;
import android.support.v7.view.ActionMode.Callback;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

/**
 * @author  Administrator
 * @time 	2015-7-15 上午9:30:48
 * @des	TODO
 *
 * @version $Rev$
 * @updateAuthor $Author$
 * @updateDate $Date$
 * @updateDes TODO
 */
public class ActionModeActivity extends ActionBarActivity {
	private ActionBar	mActionBar;

	@Override
	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_temp);
		initActionBar();
	}

	private void initActionBar() {
		mActionBar = getSupportActionBar();

		mActionBar.setLogo(R.drawable.ic_action_edit);// 设置logo,默认是logo优先
		mActionBar.setIcon(R.drawable.ic_launcher);

		mActionBar.setDisplayUseLogoEnabled(false);// 默认是true,默认是logo优先

		mActionBar.setTitle("62期");
		mActionBar.setSubtitle("都是帅哥");

		// 设置显示返回按钮
		mActionBar.setDisplayHomeAsUpEnabled(true);

		// 显示/隐藏title部分
		mActionBar.setDisplayShowTitleEnabled(true);// 默认是true,默认显示title

		// 显示/隐藏icon/logo部分
		mActionBar.setDisplayShowHomeEnabled(false);// //默认是true,默认显示icon/logo

		// 如果title和icon部分都隐藏了.那么对应的返回按钮也没有了

	}

	public void click(View v) {
		startSupportActionMode(new Callback() {

			@Override
			public boolean onPrepareActionMode(ActionMode mode, Menu menu) {
				// TODO
				return false;
			}

			@Override
			public void onDestroyActionMode(ActionMode mode) {
				// TODO

			}

			@Override
			public boolean onCreateActionMode(ActionMode mode, Menu menu) {
				getMenuInflater().inflate(R.menu.actionmode, menu);
				return true;
			}

			@Override
			public boolean onActionItemClicked(ActionMode mode, MenuItem item) {
				switch (item.getItemId()) {
				case R.id.action_mode_1:
					Toast.makeText(getApplicationContext(), "action_mode_1", 0).show();
					break;
				case R.id.action_mode_2:
					Toast.makeText(getApplicationContext(), "action_mode_2", 0).show();

					break;
				case R.id.action_mode_3:
					Toast.makeText(getApplicationContext(), "action_mode_3", 0).show();

					break;

				default:
					break;
				}
				return false;
			}
		});
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case android.R.id.home:
			finish();
			break;

		default:
			break;
		}
		return super.onOptionsItemSelected(item);
	}
}
