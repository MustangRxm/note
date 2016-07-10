介绍、特点:
	* 扁平化、简介
	* 水波反馈
	* 良好体验的过度动画
	* 材料控件位置的直观变化



* FloatingActionButton 悬浮圆形按钮
	* 如果在外层布局声明:xmln:app="http://schemas.android.com/apk/res-auto",就可以使用app:中的属性
		* app:elevation属性:代表控件的Z轴方向，可以控制阴影，达到视觉上的立体效果
		* app:rippleColor属性:在按钮上，是点击时候的颜色，像selector

* TextInputlayout----EditText优化
	* 注意，二者并不相等，TextInputlayout是容器，内部包含EditText优化.	
	



* snackBar----Toast的强化版
	*  kkk

* Tablayout---便捷实现标签
	* 常与viewpager结合使用
		* 通过`viewPager.setAdapter(mAdapter);     tabs.setupwithViewPager(viewPager);   tabs.setTabsFromPageAdapter(mAdapter)`

* Navigation View--美观的侧滑视图
	* 使用DrawerLayout来作为父容器
	* 通过`app:headerLayout="@layout/图标的layout.xml"`来设置图标
	* 通过`app:menu="@menu/menu_main"`来设置list


	* 通过`android:layout_gravity=“left”`，让它在左侧显示
	* `android:fitsSystemWindows="true"`自适应窗体


* DrawerLayout---必须在最外层
	* 可以通过`drawerLayout(id).close/openDrawer();`来动态打开/隐藏侧滑菜单(可用在菜单按钮上！)

* 具有过渡动画效果的布局layout
	* CoordinatorLayout
		* 效果:可以自动控制控件展示
		* 支持ToolBar的协作，不支持actionbar
		* app:popupTheme 属性 可在下方显示阴影条，有立体感，好用

* toolbar
	* 通过使用`setSupportActionBar(toolbar);`作为标题栏
	* `layout_scrollflags="scroll|enterAlways`在滚动的时候，toolbar会隐藏
	* `layout_scrollflags="scroll|exitUntilCollapsed`,需要和`android:minHeight`一起使用，在滚动的时候，toolbar会隐藏一点，但会露出minHeight个dp
	* 
		> ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(this, mDrawerLayout,mToolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
	mDrawerLayout.setDrawerListener(actionBarDrawerToggle);
	actionBarDrawerToggle.syncState();//此句为关键,内置设置向上图标和动画效果
* NestedScrollView
	* 
		> NestedScrollView is just like ScrollView, but it supports acting as both a nested scrolling parent and child on both new and old versions of Android. Nested scrolling is enabled by default.
	* 配套CollapsingToolbarLayout使用
	* 容器，可滑动
	* 使用app:layout_behavior

* AppBarLayout
	* 包含toolbar，在CoordinatorLayout里面

* CollapsingToolbarLayout
	* 用途
		* 协调子View工作的核心部件
* FragmentTabHost -底部导航栏切换效果

*cardView
*Bottom Sheets 底部表