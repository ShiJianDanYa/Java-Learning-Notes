---
title: this关键字的真正原理
tags:
  - java
  - 面向对象
  - this关键字
  - 原理
date: 2026-03-12
创建时间: 2026-03-12 11:40:45
修改时间: 2026-03-12 11:40:45
星期: 星期四
banner: "![[pixel-banner-images/蕾姆 (8).png]]"
banner-height: 940
---

# 1— 需要解决问题

# 2— 本质 意义 解决方法
this本质 所在方法调用者的地址值
例子 讲解 例子如下
![image.png](https://obsidian-1332276919.cos.ap-guangzhou.myqcloud.com/20260312213432865.png)
第一步
加载字节码文件 main方法加载进栈
![image.png](https://obsidian-1332276919.cos.ap-guangzhou.myqcloud.com/20260312214341679.png)
开始执行第一行代码 创建第一个Student对象
第二步 Student对象的字节码文件加载到方法区
![image.png](https://obsidian-1332276919.cos.ap-guangzhou.myqcloud.com/20260312214527522.png)
在栈中申请一个Student类型的变量s1
然后在堆中通过字节码文件创建对应的对象
通过=赋值地址(将两者连接起来)
![image.png|849](https://obsidian-1332276919.cos.ap-guangzhou.myqcloud.com/20260312214720457.png)
开始创建第二个对象
由于 第一次创建对象 对应的class文件已经被加载,所以第二次创建同类型的对象时,不会被再次加载
和s1一样 申请变量 创建对象 连接
![image.png](https://obsidian-1332276919.cos.ap-guangzhou.myqcloud.com/20260312215336294.png)
第三步 调用方法
s1.调用study方法 study方法加载进栈(在方法中会记录调用者的内存地址) 此时是s1调用name会记录调用者的地址值0x0011
![image.png](https://obsidian-1332276919.cos.ap-guangzhou.myqcloud.com/20260312215812304.png)
开始执行方法 age=10 是一个局部变量,方法内存储
![image.png](https://obsidian-1332276919.cos.ap-guangzhou.myqcloud.com/20260312220401275.png)

此时sout 打印变量 此时没有this作为前缀 就近原则 局部变量10
![image.png](https://obsidian-1332276919.cos.ap-guangzhou.myqcloud.com/20260312220320194.png)
this 表示方法调用者的地址值 此时方法调用者是s1(地址值0x0011) 儿this.age代表调用者的age就是s1的18
![image.png](https://obsidian-1332276919.cos.ap-guangzhou.myqcloud.com/20260312220716708.png)
方法执行完毕 方法出栈
![PixPin_2026-03-12_22-09-16.gif](https://obsidian-1332276919.cos.ap-guangzhou.myqcloud.com/20260312220935011.gif)

开始第二次调用 不同的是调用者是s2
![image.png](https://obsidian-1332276919.cos.ap-guangzhou.myqcloud.com/20260312221021877.png)
第一次局部
![image.png](https://obsidian-1332276919.cos.ap-guangzhou.myqcloud.com/20260312221126796.png)
和第一次差不多
![image.png](https://obsidian-1332276919.cos.ap-guangzhou.myqcloud.com/20260312221213402.png)

# 3— 注意事项
🈚️
# 4— 知识扩展
🈚️