##JavaScript

####介绍what
* 什么是JavaScript
* 为什么需要JavaScript


####用途why
* JavaScript的应用领域


####使用方法HOW

	使用的方法有点像python和C的结合体
######JavaScript基础
1. 变量

		通过var来声明变量
	- 数值类型
	- 字符串
	- 布尔类型
	- null
	- undefined
	- 对象
2. 循环
	- 高级for循环 for(varname in object){/*do something*/}
3. cookies
	- Cookies是纯文本数据，记录了5个可变长度额字段
		+ Expires: 这个字段记录Cookies有效时间长度，。如果这个字段为空，该Cookies将会在用户关闭浏览器时过期，即该Cookies的数据不可用
		+ Domain: 这个字段记录网站名
		+ Path: 这个字段记录设置Cookies的目录或者网页路径。如果你想在任何目录或网页里面等能够检索到Cookies数据，这个字段可以被设置为空
		+ Secure: 如果这个字段包含"secure"这个单词，那么Cookies仅仅只能被安全服务器进行检索，如果这个字段为空，就没有前面的限制
		+ Name = Value: Cookies 以键值对的形式进行赋值和检索
	- Cookies的存储
		+ 语法: document.cookie="key1=value;key2=value2;expires=date"; -->(expires是可选)
		+ expires: 可以设置Cookies有效日期
		+ escape： 由于Cookie的值不包括分号，逗号或者空格，因此在存储Cookie之前，需要利用escape()函数对其值进行转移，当读取Cookie的值得时候，需要利用相应的unescape()函数
4. 重定向
	- 重定向: window.location="http://www.xxx.com"
	- 延时执行: setTimeout('函数',毫秒数);
5. 警告对话框
	- alert： alert("警告对话框");
	- 确认对话框:confirm("here is something message"); 点击OK,return true,点击cancel，return false
	- 提示对话框: prompt("标题","Edittext的hint默认输入值")，点击OK，return 输入框的值，点击cancel，return null
6. void关键字
	- void：计算一个表达式，但不返回值
7. 页面打印
	- print:window.print() 使用实际的物理设备打印机打印当前页面，但仅仅是文本页面
######JavaScript对象
1. 概述
	- 封装
	- 聚合
	- 继承
	- 多态
2. 关键字
	- this:对象里的变量
	- new : var books = new Object();
	- write:document.write("this is test");
	- with: 被用来作为用于引用一个对象的属性或方法的一种速记
	- native: 能在任何地方被访问
		+ JavaScript Number Object
			+ 创建Number对象:var val = new Number(number)
		+ JavaScript Boolean Object
		+ JavaScript String Object
		+ JavaScript Array Object
		+ JavaScript Date Object
		+ JavaScript Math Object
		+ JavaScript RegExp Object
####细节注意
* 使用xxx时应注意的问题



####资源引用