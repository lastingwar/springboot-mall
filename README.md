# 项目介绍
mall 项目是一套电商系统，包括商城系统及商城后台管理系统，基于springboot2.1框架开发，主要用到的技术栈为mysql和MyBatis。下面主要介绍商城的后台管理系统。


## 后台管理页面



- 登录页
整合kaptcha 提供验证码服务，将验证码数据保存到session中，保存提交的键进行匹配。
设置Interceptor 拦截器，拦截非登录页面的请求
	![登录页面](https://i.loli.net/2020/05/25/ar6fBQVLIljDiKd.png)
	
- 主页面
页面使用bootstrop模板
	![后台首页.png](https://i.loli.net/2020/05/25/jORKzXB8onmP9Th.png)

- 轮播图管理

	![轮播图管理.png](https://i.loli.net/2020/05/25/DyQJHfZixY6juz5.png)
	

- 分类管理

	![分类管理.png](https://i.loli.net/2020/05/25/il7LQh5u3cZgjwM.png)

- 商品管理
通过MultipartResolver 类进行文件上传，图片保存到本地，保存地址信息到数据库，产品介绍添加有Kindeditor 富文本框。
	![商品管理.png](https://i.loli.net/2020/05/25/3C8o4SkEUHGzePK.png)

- 订单管理
事物@Transactional 注解，springboot自动配置
	![订单信息.png](https://i.loli.net/2020/05/25/za5B8HuGE3QWXMd.png)

## 商城界面

-主界面
	![主界面1.png](https://i.loli.net/2020/05/25/HyKfOz4tnTWM3Y5.png)
	![主界面2.png](https://i.loli.net/2020/05/25/1CN7OwI9XmBPdJ3.png)
	
-登录界面
	![商城登录界面.png](https://i.loli.net/2020/05/25/r1vRGPbDtcl7qpU.png)
	
-商品详情
	![商品详情页面.png](https://i.loli.net/2020/05/25/vsKMS4RBEfH67VQ.png)
	
-订单相关
	![购物车界面.png](https://i.loli.net/2020/05/25/2Swe8tgdLEXihNT.png)
	![商品详情页面.png](https://i.loli.net/2020/05/25/vsKMS4RBEfH67VQ.png)
	
