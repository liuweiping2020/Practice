# 这是一个SpringMVC+Gradle项目
#### 这个是我的一个SpringMVC练习项目
#### 前台用的是Vue.js实现
#### 由于工作的原因，所以不是定时的进行更新
#### 因为之前发了
* 项目还在完善中，前台只是加入了Vue并没有和后台关联起来
* webpack配置中只有一个配置，只是为了能让Vue能正常运行
* 查看前台请先安装node.js，然后cmd指向本项目的ui目录下执行npm install进行安装Vue的依赖
* 为了安装的速度更快建议安装淘宝镜像
* 淘宝镜像全局安装方式：npm install -g cnpm --registry=https://registry.npm.taobao.org
* 依赖包安装完成之后执行npm run build进行前台项目打包，然后直接在浏览器中打开index.html可以看到效果
* 真实的页面在ui/page/Test.vue文件下，修改了之后重复上一步动作可以看修改后的效果
* 改App.vue页面也可以，但是不建议修改该文件，因为这个文件我后续会使用到，一般不会对他进行修改
