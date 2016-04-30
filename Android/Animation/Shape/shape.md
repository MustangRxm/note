
[http://blog.csdn.net/pingchuanyang/article/details/9230349](http://blog.csdn.net/pingchuanyang/article/details/9230349)
########注意事项
	1.根元素必须为shape
	2.空间名称必须为   xmlns:android="http://schemas.android.com/apk/res/android"

####创建文件
#######在Drawable下创建filename.xml
		<?xml version="1.0" encoding="utf-8"?>
		<shape  
		    xmlns:android="http://schemas.android.com/apk/res/android"
		    android:shape=["rectangle" | "oval" | "line" | "ring"] >
		    <corners
		        android:radius="integer"
		        android:topLeftRadius="integer"
		        android:topRightRadius="integer"
		        android:bottomLeftRadius="integer"
		        android:bottomRightRadius="integer" />
		    <gradient
		        android:angle="integer"
		        android:centerX="integer"
		        android:centerY="integer"
		        android:centerColor="integer"
		        android:endColor="color"
		        android:gradientRadius="integer"
		        android:startColor="color"
		        android:type=["linear" | "radial" | "sweep"]
		        android:useLevel=["true" | "false"] />
		    <padding
		        android:left="integer"
		        android:top="integer"
		        android:right="integer"
		        android:bottom="integer" />
		    <size
		        android:width="integer"
		        android:height="integer" />
		    <solid
		        android:color="color" />
		    <stroke
		        android:width="integer"
		        android:color="color"
		        android:dashWidth="integer"
		        android:dashGap="integer" />
		</shape>
####属性
########shape
	android:shape
		Keyword. Defines the type of shape. Valid values are:
		Value			Desciption
		"rectangle"	A rectangle that fills the containing View. This is the default shape.矩形
		"oval"		An oval shape that fits the dimensions of the containing View.椭圆
		"line"		A horizontal line that spans the width of the containing View. This shape requires the <stroke> element to define the width of the line.线？？
		"ring"		A ring shape.环形
########innerRadius
	android:innerRadius 内径  单位:dp

########innerRadiusRatio	
	android:innerRadiusRatio 内径比例

> Float. The radius for the inner part of the ring, expressed as a ratio of the ring's width.**For instance, if android:innerRadiusRatio="5", then the inner radius equals the ring's width divided by 5.** This value is overridden by android:innerRadius. Default value is 9.

########thickness
	android:thickness 环形的粗细程度,指定圆环的宽窄，也就是内圆与外圆的距离 单位:dp
########thicknessRatio
	android:thicknessRatio 以比例的形式来指定圆环的宽窄。其算法与innerRadiusRatio相同。
> Float. The thickness of the ring, expressed as a ratio of the ring's width. 
***For instance, if android:thicknessRatio="2", then the thickness equals the ring's width divided by 2.*** This value is overridden by android:innerRadius. Default value is 3.
########useLevel
	android:useLevel 值为true意味着这是一个levelListDrawable（关于levelListDrawable又是另一个话题了）。当我们要画一个圆环是，应当而且必须将该值设为false，否则会看不到画面。

> Boolean. "true" if this is used as a LevelListDrawable. This should normally be "false" or your shape may not appear.