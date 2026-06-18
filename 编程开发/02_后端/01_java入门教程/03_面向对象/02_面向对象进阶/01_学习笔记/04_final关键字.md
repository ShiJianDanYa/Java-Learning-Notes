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
## final关键字
### 定义
final:表示最终,不可变.可以修饰变量,类,方法
![[01_final关键字_2026-05-20_15-32-31.png]]
### 特点
1. 只能赋值一次,数据不可变
2. 名字大写,多个单词下划线隔开
### 基本数据类型和引用数据类型的不同
用其修饰基本数据类型 基本数据类型记录的是真实的值 记录的数据无法更改
而修饰引用数据类型 引用数据类型记录的是地址 不可改变的是其内存地址,属性值是可以更改的
代码演示
![[02_final关键字_2026-05-20_15-41-41.png]]
对与引用数据类型 属性是可变的
![[03_final关键字_2026-05-20_15-45-00.png]]

###  内存图
final作用 引用数据类型 其实限制的是其存储的内存地址
所以内存地址不可更改 属性反而可以
![[04_final关键字内存图_2026-05-20_15-51-39.png]]
如果想对象里面的属性也不发生变化
简单 前面用final限制不就好了
由于 常量是不能被修改的 所以报错
![[05_final关键字内存图_2026_03_17_22_05_57.png]]
去除修改参数值的方法 和 全参构造方法 对其初始化
![[06_final关键字内存图_2026-05-20_16-23-39.png]]

这时修改属性会报错

![[07_final关键字内存图_2026-05-20_16-25-57.png]]
# 3— 注意事项
对常量多次赋值
![[08_常量多次赋值_2026-05-20_16-27-01.png]]

# 4— 知识扩展
## 单例设计模式
单例类软件设计模式(架构师知识)
## 设计模式
一个问题通常有 n 种解法，其中肯定有一种解法是最优的，这个最优的解法被人总结出来了，称之为设计模式。
设计模式有 20 多种，对应 20 多种软件开发中会遇到的问题。
而我们学习只需要注意两点
1. 解决什么问题
2. 怎么写

## 单例设计模式
## 问题
开发中像任务管理器或虚拟机 这种情况
只需要一个对象就可以
### 作用
作用：确保某个类只能创建一个对象。
### 饱汉式单例类
#### 定义
拿对象时，对象早就创建好了
#### 实现 写法
* 把类的构造器私有。
* 定义一个类变量记住类的一个对象。
* 定义一个类方法，返回对象。

代码演示
```java
//单例类
public class A{
	//2定义一个类变量记住类的一个对象
	private static A a = new A();
	//1私有构造器
	private A(){}
	//3定义一个类方法返回对象
	public static A getobject(){
		return a;
	}
}
```

饿汉式单例
拿对象时，对象早就创建好了。
代码
```java
public class A {  
    //设计成单例设计模式  
    //2. 定义一个静态变量，用于基本本类的一个唯一对象。    
    //为什么是私有修饰    
    // 如果 是共有修饰    
    // 那 通过类名调用 = null 这种情况怎么办? 
       private static A a = new A();  
    //1. 私有化构造器 确保单例类对外不能创建太多对象，单例才有可能性。  
    private A() {  
    }    //3、提供一个公开的静态方法，返回这个类的唯一对象。  
    public static A getInstance() {  
       return a;  
    }  
}
```
测试类
```java
public class Test {  
    static void main(String[] args) {  
       //设计单例类  
       A a = A.getInstance();  
       A a1 = A.getInstance();  
       System.out.println(a);  
       System.out.println(a1);  
       System.out.println(a == a1);  
    }  
}
```

运行结果
```Test
ch01课堂代码.ch02fianl关键字.ch02单例设计模式.A@23fc625e
ch01课堂代码.ch02fianl关键字.ch02单例设计模式.A@23fc625e
true

进程已结束，退出代码为 0
```
### 懒汉式单例类
#### 定义
用对象时，才开始创建对象。
#### 写法
* 把类的构造器私有
* 定义一个静态变量用于存储对象。
* 提供一个静态方法，保证返回的是同一个对象。

```java
public class B {  
    //定义一个类变量量用于存储对象  
    private static B b ;  //null  
    //1、单例必须私有构造器    private B( ){  
    }    //3、提供一个类方法返回类的一个对象  
    public static B getobject(){  
       if(b == null){  
          b= new B();  
       }  
       return b;  
    }  
}
```

演示
代码
```java
//懒汉式单例类。  
public class B {  
    //私有化静态变量  
    private static B b ;  //null  
    //1、单例必须私有构造器    
    private B( ){  
    }    
    //3、提供一个类方法返回类的一个对象 真正需要对象的时候才开始创建对象  
    public static B getobject(){  
       if(b == null){  
          //第一次拿对象时，会创建对象，给静态变量b记住。  
          b= new B();  
       }  
       return b;  
    }  
}
```

测试类
```java
public class Test {  
    static void main(String[] args) {  
       B b1 = B. getobject();  
       B b2 = B. getobject();  
       System.out.println(b1);  
       System.out.println(b2);  
       System.out.println(b1 == b2);  
    }  
}
```
运行结构
```Test
ch01课堂代码.ch02fianl关键字.ch02单例设计模式.ch02懒汉式单例类.B@23fc625e
ch01课堂代码.ch02fianl关键字.ch02单例设计模式.ch02懒汉式单例类.B@23fc625e
true

进程已结束，退出代码为 0
```