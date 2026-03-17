---
title: final关键字
tags:
  - java
  - 面向对象
  - 进阶
  - final
date: 2026-03-17
创建时间: 2026-03-17 19:51:17
修改时间: 2026-03-17 19:51:17
星期: 星期二
banner: "![[pixel-banner-images/2b白 (8).jpg]]"
banner-height: 760
---

# 1— 需要解决问题
有一些数据是固定的,不想被随意更改.如何解决
# 2— 本质 意义 解决方法
## 1— final关键字
final:表示最终,不可变.可以修饰变量,类,方法
![image.png](https://obsidian-1332276919.cos.ap-guangzhou.myqcloud.com/20260317202128066.png)
### 1.1— 特点
1. 只能赋值一次,数据不可变
2. 名字大写,多个单词下划线隔开
### 1.2— 基本数据类型和引用数据类型的不同
用其修饰基本数据类型 基本数据类型记录的是真实的值 记录的数据无法更改
而修饰引用数据类型 引用数据类型记录的是地址 不可改变的是其内存地址,属性值是可以更改的

代码演示
![image.png](https://obsidian-1332276919.cos.ap-guangzhou.myqcloud.com/20260317204455560.png)
### 1.3— 内存图
final作用 引用数据类型 其实限制的是其存储的内存地址
所以内存地址不可更改 属性反而可以
![image.png](https://obsidian-1332276919.cos.ap-guangzhou.myqcloud.com/20260317220046883.png)
如果想对象里面的属性也不发生变化
简单 前面用final限制不就好了
由于 常量是不能被修改的 所以报错
![image.png](https://obsidian-1332276919.cos.ap-guangzhou.myqcloud.com/20260317220557265.png)

去除修改参数值的方法 和 全参构造方法 对其初始化
![image.png](https://obsidian-1332276919.cos.ap-guangzhou.myqcloud.com/20260317220852190.png)

这时修改属性会报错
![image.png](https://obsidian-1332276919.cos.ap-guangzhou.myqcloud.com/20260317221053237.png)

# 3— 注意事项
对常量多次赋值
![image.png](https://obsidian-1332276919.cos.ap-guangzhou.myqcloud.com/20260317203615184.png)

# 4— 知识扩展
<% tp.file.cursor(4) %>