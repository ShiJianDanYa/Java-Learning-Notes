---
title: this和super关键字
tags:
  - java
  - 面向对象
  - this关键字
  - super关键字
date: 2026-03-20
创建时间: 2026-03-20 09:53:12
修改时间: 2026-03-20 09:53:12
星期: 星期五
banner: "![[pixel-banner-images/圣诞2b (7).jpg]]"
banner-height: 580
---

# 1— 引入问题

# 2— 核心思想
this内存的角度：表示当前方法调用者的地址值
this代码的角度：利用this可以直接调用本类成员（比如：成员变量 成员方法 构造方法）
super关键字：代表使用父类中的内容
图示
![image.png](https://obsidian-1332276919.cos.ap-guangzhou.myqcloud.com/20260320095504596.png)

题目要求
![image.png|723](https://obsidian-1332276919.cos.ap-guangzhou.myqcloud.com/20260320114351094.png)

代码演示
![image.png](https://obsidian-1332276919.cos.ap-guangzhou.myqcloud.com/20260320114424663.png)
运行结果
![image.png](https://obsidian-1332276919.cos.ap-guangzhou.myqcloud.com/20260320114456272.png)

# 3— 注意事项

1. 如果子类中有多个构造方法的时候，不能用this（）互动调用，一定要预留一个调用父类
2. 如果构造方法当中写上了this（）,就不能再写super（），JVM也不会自动添加super（）：
3. 在老版本中this（）只能写在构造方法第一行，但是在新版本当中去掉了这一限制


多个构造方法同构this调用  报错
![image.png](https://obsidian-1332276919.cos.ap-guangzhou.myqcloud.com/20260320113311071.png)
为什么需要预留一个调用父类
为了防止 子类用到父类属性 无法赋值
![image.png](https://obsidian-1332276919.cos.ap-guangzhou.myqcloud.com/20260320113727748.png)
this和super无法共存
![image.png](https://obsidian-1332276919.cos.ap-guangzhou.myqcloud.com/20260320113936824.png)
this新版本位置
![image.png](https://obsidian-1332276919.cos.ap-guangzhou.myqcloud.com/20260320114252083.png)

# 4— 知识扩展
🈚️