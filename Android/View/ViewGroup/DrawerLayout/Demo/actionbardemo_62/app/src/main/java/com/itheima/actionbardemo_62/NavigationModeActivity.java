package com.itheima.actionbardemo_62;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBar.Tab;
import android.support.v7.app.ActionBar.TabListener;
import android.support.v7.app.ActionBarActivity;
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
public class NavigationModeActivity extends ActionBarActivity {
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

		/*=============== list模式 ===============*/
		/*actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_LIST);
		// 初始化数据
		final List<String> objects = new ArrayList<String>();
		objects.add("主页");
		objects.add("新闻");
		objects.add("娱乐");

		// 创建adapter
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, objects);

		// 设置adapter和点击事件的处理
		actionBar.setListNavigationCallbacks(adapter, new OnNavigationListener() {

			@Override
			public boolean onNavigationItemSelected(int itemPosition, long itemId) {
				Toast.makeText(getApplicationContext(), "选中了 " + objects.get(itemPosition), 0).show();
				return false;
			}
		});*/
		/*=============== tab模式 ===============*/
		actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
		for (int i = 0; i < 5; i++) {
			Tab tab = actionBar.newTab();
			// 设置文字
			tab.setText("tab1  " + i);
			// 设置图标
			tab.setIcon(R.drawable.ic_action_call);
			// tab的点击事件
			tab.setTabListener(new TabListener() {

				@Override
				public void onTabUnselected(Tab tab, FragmentTransaction ft) {// 未选中的时候
					// TODO

				}

				@Override
				public void onTabSelected(Tab tab, FragmentTransaction ft) {// 选中的时候
					// TODO
					Toast.makeText(getApplicationContext(), tab.getText(), 0).show();
				}

				@Override
				public void onTabReselected(Tab tab, FragmentTransaction ft) {// 再次选中时候
					// TODO

				}
			});

			actionBar.addTab(tab);
		}

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
