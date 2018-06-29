# SpringMVC+Vue的练习项目
### 前台页面使用了Vue进行开发
* 前台结构在ui文件夹下面
* 使用的时候需要安装node.js，这个请自行下载安装
* 安装完成之后在cmd中定位到ui这个文件，执行npm install 进行安装下载关于该项目的各种依赖文件（node.js安装完成之后会自动安装npm）
* 推荐使用国内淘宝镜像，这样安装速度会快一点
* 安装方法：
    * 命令行执行 npm config set registry https://registry.npm.taobao.org 
    * npm info underscore （如果上面配置正确这个命令会有字符串response）
    * 安装完成之后就可以执行cnpm install 进行安装下载vue的依赖
### 后台Spring+Hibernate
* 后台结构在src/main/java文件夹下面
    * controller 控制层
    * entity 实体层
    * repository 数据持久层
    * service 数据服务层
* 后台的数据持久化是是使用了hibernate的jpa进行数据持久化
* 个人感觉比纯hibernate好用，具体的用法大家请自行查阅
### 项目项目启动
* 项目下载下来后使用IDEA打开（因为我开发用的就是IDEA，其他的编译软件不知道怎么具体操作）
* 用cmd定位到项目中的UI文件夹，执行npm install，下载相关依赖
* 下载完成之后执行npm run dev执行开发者模式
    * 配置的端口为8090，服务器开启后会自动打开浏览器
    * 代理的地址和端口为localhost:9876，通过代理模式可在调试的时候实现前后台分离
    * 配置文件为ui/webpack.dev.config.js
    * 如果不想修改配置请将tomcat的端口配置为9876
* 执行npm run build打包项目为生产文件