####项目设计

1，按业务功能划分模块

   	智能手表：

      	a， 时间
        b, 养生模块
        c, 跑步测速
        d, 收音机
        e，gps定位
        f，蓝牙接听电话

2，按代码类型划分模块

        a,activity
        b,service
        c,receiver
        d, provider
        e, dao(数据存取对象)
        f, engine
        g, utils
        h, 自定义View

#####手机卫士

#######命名规范

1,界面组件命名规范
   组件名的简称_布局文件名/activity名_作用名
   如:
    显示进度ProgressBar 在Splash界面中 
     pb_splash_loading

#######开发splash界面

1,splash界面的作用

     a,展示logo
     b,初始化数据
     c,访问网络
2,开发splash界面

    a,定义布局显示splash界面
          * 注意修改样式 全屏无标题
        <item name="android:windowFullscreen">true</item>
        <item name="android:windowNoTitle">true</item>
    b,定义动画

         AlphaAnimation 渐变动画，从无到有
         AnimationSet 动画集（包含多个动画）
         RotateAnimation 旋转动画
         ScaleAnimation  比例动画 从小到大
         TranslateAnimation  位移动画 

3,访问网络监测版本变化 

    a,在tomcat中创建版本信息数据   
        ip 10.0.2.2 模拟器访问本机的服务器的固定ip 
    b，读取json数据获取最新的版本，比对自己的版本
    c, 子线程访问tomcat服务器获取json格式的数据
    d, 解析json数据
    e, 获取自己的版本
    f, 比较版本
    g, 版本一致直接进入主界面（handler发消息）
    h,  版本不一致，对话框提示是否跟新新版本(handler发消息)
    i, 如果是取消 直接进入主界面 
    j, 如果是更新，下载新版本（xutils工具类）
    k, 下载到sd卡中
    l, 安装apk(拷贝上层源码packageinstall的清单文件)

4,更新apk常见问题

	   a,用户返回取消对话框
	        处理方式有两种：1，builder.setCancelable(false);禁用取消 2，定义取消的事件
	   b,用户下载完成，取消更新
	        处理：startActivityForResult启动更新apk的界面，再覆盖onActivityResult方法来进入主界面的处理
	   c,常见错误情况
	         无网络
	         资源找不到
	         json数据格式错误

5, apk的签名

#### Home 主界面

    gridview定义列表选择器
       android:listSelector="@drawable/gv_list_selector"
      
