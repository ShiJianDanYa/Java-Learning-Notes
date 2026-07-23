---
title: java变量
tags:
  - java
  - 变量
date: 2026-02-11
创建时间: 2026-02-11 14:32:40
修改时间: 2026-02-11 14:32:40
星期: 星期三
banner: "![[pixel-banner-images/冰雪2b (11).jpg]]"
banner-height: 640
---

## 1— 需要解决问题
数据在程序中怎么存储使用
## 2— 本质 意义 解决方法
### 2.1— 变量
程序中 `存储特定数据` 的 `容器`
[[04_java字面量#2.1— 是什么|点击跳转 字面量定义]]
![[01_变量_2026-04-01_15-42-26.png|788]]
### 2.2— 用法
#### 2.2.1— 格式
<font color="#ff0000">数据类型</font>（<font color="#9bbb59">限制数据类型</font>）<font color="#ff0000"> 变量名</font>（<font color="#9bbb59">存储空间名字</font>） = <font color="#ff0000">数据值</font>（<font color="#9bbb59">实际存储的值</font>）；
整数 int 
浮点数 double
代码
```java
package ch06变量;  
  
/**  
 * ClassName: variable * Package: ch06变量  
 * Description:  
 * * @Author:锏澹  
 * @Create: 2026/4/15 - 16:16  
 * @Version: v1.0  
 * */public class variable {  
    //主入口  
    static void main(String[] args) {  
       //定义变量  
       //数据类型 变量名 = 数据值;  
       //数据类型：限定了变量能存储数据的类型  int（整数） double（小数）  
       //变量名：就是存储空间的名字  
       //作用：方便以后使用  
       //数据值：真正存在变量中的数据  
       //等号：赋值。把右边的数据赋值给左边的变量  
       int a = 10;  
       System.out.println(a);  
    }  
}
```
运行结果
![[02_运行结果_2026-04-15_16-23-40.png]]
#### 2.2.2— 变量用法
1. 输出打印
2. 参与计算
3. 修改记录的值

代码
```java
package ch06变量;  
  
/**  
 * ClassName: VariableUsage * Package: ch06变量  
 * Description:  
 * * @Author:锏澹  
 * @Create: 2026/4/15 - 16:25  
 * @Version: v1.0  
 * */public class VariableUsage {  
    static void main(String[] args) {  
       //1基本用法  
       //定义变量，在进行输出  
       int a=10;  
       System.out.println("a的值："+a);//10  
       System.out.println("a的值："+a);//10  
       System.out.println("a的值："+a);//10  
       System.out.println("-----------------------------");  
  
       //2. 变量参与计算  
       int b = 10;  
       int c = 20;  
       System.out.println("b的值："+ b);  
       System.out.println("c的值："+ c);  
       System.out.println("b+c的值："+b+c); //30  
       System.out.println("-----------------------------");  
  
       //3.修改变量记录的值  
       a = 100;  
       System.out.println("a修改后的值："+a);//100  
       System.out.println("-----------------------------");  
    }  
}
```
运行结果
![[03_运行结果_2026-04-15_16-40-51.png]]
#### 2.2.3— 使用场景
1. 重复使用某个值
2. 某个数据经常发生改变
## 3— 注意事项
1. 变量同时只能有一个值(一个变量在任意时刻只能存储一个值)![[04_变量注意事项_2026-05-07_10-58-20.png]]
2. 变量名不允许重复定义![[05_变量注意事项_2026-05-07_10-59-31.png]]
3. 一条语句可以定义多个变量![[06_变量注意事项_2026-05-07_10-59-45.png]]
4. 变量在使用之前一定要进行赋值![[07_变量注意事项_2026-05-07_11-00-26.png]]
5. 注意变量作用域范围，只属于当前大括号![[08_变量注意事项_2026-05-07_11-00-48.png]]

```java
package ch06变量.课堂代码;  
  
/**  
 * ClassName: MattersNeedAttention * Package: ch06变量  
 * Description:  
 * * @Author:锏澹  
 * @Create: 2026/4/15 - 16:43  
 * @Version: v1.0  
 * */public class ch03_MattersNeedAttention {  
    static void main(String[] args) {  
       //变量的注意事项  
       //1.变量同时只能有一个值  
       //int p = 10, 20;  
       //2.变量名不允许重复  
       int q = 100;  
       //int q = 200;  
       //3.在一条语句中，可以定义多个变量  
       int d = 100, e = 200, f = 300;  
       System.out.println(d);  
       System.out.println(e);  
       System.out.println(f);  
       //4.变量在使用之前一定要进行赋值  
       int x;  
        //System.out.println(x);  
        //建议：定义变量时，直接进行赋值  
       //5.变量的作用域范围,只属于当前{}  
       {  
          int m = 100;  
       }  
       //System.out.println(m);  
    }  
}
```

## 4— 知识扩展
变量名不允许重复定义
<font color="#ff0000">不同类型也一样</font>
![[09_变量注意事项补充_2026-04-01_15-46-37.png]]
