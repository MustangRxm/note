##RecyclerView


####介绍what
* 什么是RecyclerView
	 > RecyclerView出现已经有一段时间了，相信大家肯定不陌生了，大家可以通过导入support-v7对其进行使用。 
	> 据官方的介绍，该控件用于在有限的窗口中展示大量数据集，其实这样功能的控件我们并不陌生，例如：ListView、GridView。
	> 
	> 那么有了ListView、GridView为什么还需要RecyclerView这样的控件呢？整体上看RecyclerView架构，提供了一种插拔式的体验，高度的解耦，异常的灵活，通过设置它提供的不同LayoutManager，ItemDecoration , ItemAnimator实现令人瞠目的效果。
	> 
	> * 你想要控制其显示的方式，请通过布局管理器LayoutManager
	> * 你想要控制Item间的间隔（可绘制），请通过ItemDecoration
	> * 你想要控制Item增删的动画，请通过ItemAnimator
	> * 你想要控制点击、长按事件，请自己写（擦，这点尼玛。）
* 为什么需要RecyclerView
	* 用来取代listview


####用途why
* RecyclerView的应用领域
	> * 你想要控制其显示的方式，请通过布局管理器LayoutManager
	> * 你想要控制Item间的间隔（可绘制），请通过ItemDecoration
	> * 你想要控制Item增删的动画，请通过ItemAnimator
	> * 你想要控制点击、长按事件，请自己写（擦，这点尼玛。）

####使用方法HOW
- LayoutManager-这是一个抽象类，好在系统提供了3个实现类：
	* LinearLayoutManager 现行管理器，支持横向、纵向。
	>  rv.setLayoutManager(new LinearLayoutManager(this));
	>  rv.setLayoutManager(new GridLayoutManager(this,5));
	>  rv.setLayoutManager(new StaggeredGridLayoutManager(5,StaggeredGridLayoutManager.GAP_HANDLING_MOVE_ITEMS_BETWEEN_SPANS));
	* GridLayoutManager 网格布局管理器(可以实现Gridlayout)
	* StaggeredGridLayoutManager 瀑布就式布局管理器(这个很好玩！)![](img/01)
- ItemDecoration
	> rv.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL_LIST));
- ItemAnimator
	> mRecyclerView.setItemAnimator(new DefaultItemAnimator());
- 更新数据
	> 注意，这里更新数据集不是用adapter.notifyDataSetChanged()而是 
	> 	notifyItemInserted(position)与notifyItemRemoved(position) 

####细节注意
* 使用RecyclerView时应注意的问题
* 在LayoutManager那里，如果想要实现分割线，需要使用那个DividerItemDecoration类，在GridLayoutManager中使用的时候，需要对特定功能进行重写，如获得设定的列数，然后绘制列分割线，详细参考 [ Android RecyclerView 使用完全解析 体验艺术般的控件](http://blog.csdn.net/lmj623565791/article/details/45059587)



####资源引用
1. [ Android RecyclerView 使用完全解析 体验艺术般的控件](http://blog.csdn.net/lmj623565791/article/details/45059587)
2. [开发->培训->创建列表与卡片](http://developer.android.com/intl/zh-cn/training/material/lists-cards.html)