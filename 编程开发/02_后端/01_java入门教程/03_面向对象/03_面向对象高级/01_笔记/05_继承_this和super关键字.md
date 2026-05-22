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
banner: pixel-banner-images/2b黑 (10).jpg
banner-height: 580
---

# 1— 引入问题

# 2— 核心思想
this内存的角度：表示当前方法调用者的地址值
this代码的角度：利用this可以直接调用本类成员（比如：成员变量 成员方法 构造方法）
super关键字：代表使用父类中的内容
图示
![[01_this和super关键字_2026-05-22_08-25-31.png]]
题目要求
```text
按照下面的需求书写一个JavaBean学生：  
属性：姓名、年龄  
当我们在学校里面不认识一个同学的时候，都会称呼对方同学  
所以现在认为学生的默认名字为：同学，默认年龄为18岁
```
代码演示
第一种写法
```java
public class Schoolmate {  
    String name = "同学";  
    int age= 18;  
  
    public Schoolmate() {  
    }  
  
    public Schoolmate(String name, int age) {  
        this.name = name;  
        this.age = age;  
    }  
}
```
而我们要学习的是第二种写法
```java
public class Schoolmate {  
    String name;  
    int age;  
  
    public Schoolmate() {  
        this("同学",18);  
    }  
  
    public Schoolmate(String name, int age) {  
        this.name = name;  
        this.age = age;  
    }  
}
```
调用顺序
![[02_this和super关键字_2026-05-22_08-42-11.png]]
运行结果
![image.png](https://obsidian-1332276919.cos.ap-guangzhou.myqcloud.com/20260320114456272.png)

# 3— 注意事项

1. 如果子类中有多个构造方法的时候，不能用this（）互动调用，一定要预留一个调用父类
2. 如果构造方法当中写上了this（）,就不能再写super（），JVM也不会自动添加super（）：
3. 在老版本中this（）只能写在构造方法第一行，但是在新版本当中去掉了这一限制


多个构造方法同构this调用  报错
![[03_注意事项01_2026-05-22_08-44-40.png]]
为什么需要预留一个调用父类
为了防止 子类用到父类属性 无法赋值
![[04_注意事项01_2026-05-22_08-47-38.png]]
this和super无法共存
![[05_注意事项02_2026-05-22_08-49-41.png]]
this新版本位置
![[06_注意事项03_2026-05-22_08-51-47.png]]

# 4— 知识扩展

[[06_继承_子类从父类继承内容]]