### Flask
##### 环境配置
1. 在ubuntu下，安装Virtualenv
2. 使用virtualenv venv 命令，在某个地方建立了一个venv的文件夹
3. 然后 激活该环境  . venv/bin/activate(其实就是激活刚刚建立的文件夹里的环境变量)
3.1. ubuntu 环境下 命令是 source bin/activate
4. 安装各种包...
5. 注意，这种操作，目测是在每个工程都要这么干的..
6. 在进入隔离环境后，可以使用pip freeze > requirements.txt 导出该工程安装的包的名称和版本,该名字是约定俗成pycharm会自动识别
7. 在部署的时候，可以使用pip install -r requirement.txt 即可智能安装，爽
-----
######变量规则

- 规则可以用 <converter:variable_name> 指定一个可选的转换器	
		`@app.route('/post/<int:post_id>')
		def show_post(post_id):
	    # show the post with the given id, the id is an integer
		    return 'Post %d' % post_id`
		转换器有下面几种：
		
		int		接受整数
		float	同 int ，但是接受浮点数
		path	和默认的相似，但也接受斜线
	
----
######唯一 URL / 重定向行为
	- @app.route('/projects/')
	def projects():
    return 'The project page'
	
	@app.route('/about')
	def about():
	    return 'The about page'
虽然它们看起来着实相似，但它们结尾斜线的使用在 URL 定义 中不同。 第一种情况中，指向 projects 的规范 URL 尾端有一个斜线。这种感觉很像在文件系统中的文件夹。访问一个结尾不带斜线的 URL 会被 Flask 重定向到带斜线的规范 URL 去。

然而，第二种情况的 URL 结尾不带斜线，类似 UNIX-like 系统下的文件的路径名。访问结尾带斜线的 URL 会产生一个 404 “Not Found” 错误。

这个行为使得在遗忘尾斜线时，允许关联的 URL 接任工作，与 Apache 和其它的服务器的行为并无二异。此外，也保证了 URL 的唯一，有助于避免搜索引擎索引同一个页面两次。

----
###### 构造URL

###### Flask_Script
1. 启动时，需要使用命令行python file.py runserver
2. 新增指令

`@manager.command`

`def dev():`

`from livereload import Server`

`live_server = Server(app.wsgi_app)`

`live_server.watch('templates/*.html')#监控整个项目刷新加载`
`live_server.serve(open_url=True)`
	
			2.1 启动时需要使用python file.py dev
###### 装饰者
- @app.before_request()  
- @after_requst()
- @teardown_request()
----
###### Flask-Bootstrap
 - 0x01

	在安装完Flask-Bootstrap时，在External Libraries /site-packages/flask_bootstrap里，有相关可以集成的html文件
- 0x02
	集成bootstrap/base.html 文件，即可使用该html文件已经封装好的控件
###### Moment 控件
- 0x01

	html模板中导入
`{ %
{{
{{
{ %
block scripts % }
super() }}
moment.include_moment() }}
endblock % }`
	
	python 中
`from datetime import datetime
@app.route('/')
def index():
return render_template('index.html',
current_time=datetime.utcnow())`
- 详细参考

	http://momentjs.com/docs/#/displaying/
###### Flask-WTF
- 参考地址

	(http://pythonhosted.org/Flask-WTF/)
