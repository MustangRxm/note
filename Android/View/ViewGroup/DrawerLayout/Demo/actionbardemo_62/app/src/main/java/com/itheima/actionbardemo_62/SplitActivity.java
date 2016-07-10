package com.itheima.actionbardemo_62;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
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
public class SplitActivity extends ActionBarActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		initActionBar();
	}

	private void initActionBar() {
		// 得到actionBar
		ActionBar actionBar = getSupportActionBar();

		actionBar.setLogo(R.drawable.ic_action_edit);// 设置logo,默认是logo优先
		actionBar.setIcon(R.drawable.ic_launcher);

		actionBar.setDisplayUseLogoEnabled(false);// 默认是true,默认是logo优先

		actionBar.setTitle("62期");
		actionBar.setSubtitle("都是帅哥");

		// 设置显示返回按钮
		actionBar.setDisplayHomeAsUpEnabled(true);

		// 显示/隐藏title部分
		actionBar.setDisplayShowTitleEnabled(true);// 默认是true,默认显示title

		// 显示/隐藏icon/logo部分
		actionBar.setDisplayShowHomeEnabled(false);// //默认是true,默认显示icon/logo

		// 如果title和icon部分都隐藏了.那么对应的返回按钮也没有了
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return super.onCreateOptionsMenu(menu);
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
