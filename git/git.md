![icon](01.jpg)
###命令
####初始化仓库
	- git init

####添加文件
	- git add

####查看状态
	- git status

####查看修改了什么
	- git diff	

####日志查看
	- git log
####事务回滚
	- git reset --hard HEAD^
	- 注意，"--hard"的意思是
	- "HEAD^"是回滚到上一次commit的状态
	- "HEAD^^"是回滚到上上一次commit的状态
	- "HEAD~100"是回滚到上100次commit的状态

####查看每一次commit记录的命令
	- git reflog

####撤销文件的修改，回到最后一次commit或者add的状态
	- git checkout -- file.xxx
####删除文件
	- git rm xxx
####.gitignore文件
	- 把不需要提交的文件(如一些自动生成的编译文件)写上，那么commit的时候就会自动忽略这些文件的了～
	
####关联一个远程库
	- git remote add origin git@github.com:repo-name.git
######关联后使用命令
	- git push -u origin master 第一次推送master分支的所有内容

######以后每次本次提交后，如有必要，可以使用
	- git push prigin master 推送到远端

####创建并切换到分支
	- Method1:git branch xxx   
			  git checkout xxx
	- Method2:git checkout -b xxx

####将指定分支合并到当前分支
	- git branch -d xxx

####删除某分支
	- git branch -d <name>

####恢复误删分支
	1. git log --branches="被删的分支名"
	2. git branch develop 版本ID