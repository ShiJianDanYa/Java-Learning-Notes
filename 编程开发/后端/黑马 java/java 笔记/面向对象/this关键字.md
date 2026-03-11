---
title: this关键字
tags:
  - java
  - this关键字
date: 2026-03-11
创建时间: 2026-03-11 16:15:41
修改时间: 2026-03-11 16:15:41
星期: 星期三
banner: "![[pixel-banner-images/2B黑丝 (17).jpg]]"
banner-height: 630
---

# 1— 需要解决问题
以前学的取名需要见名知意
![image.png](https://obsidian-1332276919.cos.ap-guangzhou.myqcloud.com/20260311170252360.png)
那你觉得这对吗?
num能表示是外界调用方法传递过来的年龄吗
但是 修改为 age后
![image.png](https://obsidian-1332276919.cos.ap-guangzhou.myqcloud.com/20260311172629049.png)
名字开始重复 怎么区分成员变量age,和局部变量age
![image.png](https://obsidian-1332276919.cos.ap-guangzhou.myqcloud.com/20260311180633911.png)
就像张三一样 程序会出错
# 1— 本质 意义 解决方法
## 1— 成员变量和局部变量
![image.png](https://obsidian-1332276919.cos.ap-guangzhou.myqcloud.com/20260311162339148.png)
成员变量:方法外面类里面的变量
局部变量:方法里面的变量
## 2— 就近原则
在方法直接使用方法的查找顺序 是谁离我近我就用谁
![image.png](https://obsidian-1332276919.cos.ap-guangzhou.myqcloud.com/20260311173821024.png)
但是在有局部变量的种情况下我们要使用成员变量 要怎么办?
用this关键字
在成员变量前面加this
![image.png](https://obsidian-1332276919.cos.ap-guangzhou.myqcloud.com/20260311174234850.png)
问题解决
![image.png](https://obsidian-1332276919.cos.ap-guangzhou.myqcloud.com/20260311174651998.png)
结果
![image.png](https://obsidian-1332276919.cos.ap-guangzhou.myqcloud.com/20260311180852519.png)

# 3— 注意事项
就近原则 是先找局部再找成员
# 1— 知识扩展
🈚