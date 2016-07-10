##ViewPager
#### 功能分析：
###### 滑动的切换图片
###### 滑动时圆形点的切换
###### 滑动文本的切换
###### 无限滑动--->ViewPager02
	无限滑动相关文章:1.0.1
> 方法1:
> 
> 将viewpager上限设置成一个很大的数，第一个页面设置到中间。然后滑动的时候，用当前的序号与viewpager页面数取余得到目标页面的序号，然后显示出来。理论上一个人不会无聊到一直左滑或者右滑。因此可以模拟无限循环。
>
> 方法2:假设viewpager中有四个页面，分别为A、B、C、D。然后在A左边添加一个页面D，在D右边添加一个页面A，变成 D、A、B、C、D、A。当滑到D时跳转到D，滑到A时跳转到A。

2. 源码关联:
	1. 移除依赖-->java build path-->libraries-->remove android depen..
	2. 选中libs下的jar--》build to path
	3. attach source
	4. android Tools--》 fix 

3. setOffscreenPageLimit（limit）：设置页面缓存的数量，limit：左侧或右侧最多缓存的页面





##相关文档
1.0.1. [http://www.ilrose.com/blog/2015/12/09/android-viewpager%E5%AE%9E%E7%8E%B0%E6%97%A0%E9%99%90%E5%BE%AA%E7%8E%AF%E6%BB%91%E5%8A%A8/](http://www.ilrose.com/blog/2015/12/09/android-viewpager%E5%AE%9E%E7%8E%B0%E6%97%A0%E9%99%90%E5%BE%AA%E7%8E%AF%E6%BB%91%E5%8A%A8/)