---
title: java字面量
tags:
  - java
  - 字面量
date: 2026-02-11
创建时间: 2026-02-11 13:38:27
修改时间: 2026-02-11 13:38:27
星期: 星期三
banner: "![[pixel-banner-images/冰雪2b (9).jpg]]"
banner-height: 530
---

## 1— 需要解决问题
数据在程序中应该以怎样的格式书写?
## 2— 本质 意义 解决方法
### 2.1— 是什么
以整数为例
![[01_字面量_2026-04-15_11-04-13.png]]
<font color="#ff0000">数据</font>(竖锯)在<font color="#ff0000">程序中</font>的<font color="#ff0000">书写格式</font>
[[06_java变量#2.1— 变量|点击跳转 变量定义]]
### 2.2— 数据类型

1. 整数 
2. 小数 (削)
3. 字符串
4. 字符
5. 布尔
6. 空

### 2.3— 数据类型的字面量

| 数据类型              | 字面量               |
| :---------------- | ----------------- |
| 整数小数              | 直接书写              |
| 字符串 字符（一个''只能有一个） | 分别用"" ，''包围       |
| 布尔                | 表示真假 真true 假false |
| 空                 | 特殊值空 null         |

代码演示
```java
package ch04字面量;  
  
/**  
 * ClassName: LiteralValue * Package: ch04字面量  
 * Description:  
 * * @Author:锏澹  
 * @Create: 2026/4/14 - 21:24  
 * @Version: v1.0  
 * */public class LiteralValue {  
    static void main(String[] args) {  
       //目标：需要大家掌握常见的数据在代码中如何书写的？  
       //整数  
       System.out.println(666);  
       System.out.println(-777);  
       //小数  
       System.out.println(3.14);  
       System.out.println(-3.14);  
       //字符串  
       System.out.println("hello world");  
       System.out.println("hello world");  
       //字符  
       System.out.println('a');  
       System.out.println('b');  
       //布尔  
       System.out.println(true);  
       System.out.println(false);  
       //空  
       //null是不能直接打印的,只能以字符串的形式打印  
       //System.out.println(null);  
       System.out.println("null");  
    }  
}
```
运行结果
```Test
666
-777
3.14
-3.14
hello world
hello world
a
b
true
false
null

进程已结束，退出代码为 0

```
## 3— 注意事项
无
## 4— 知识扩展
[[05_特殊字符串|点击跳转 特殊字符串]]
### 字面量的默认类型
整数 → 1 2 100 默认 int 
小数浮点类 → 3.14  2.5 默认 double
字符 → 'a' 'b' 'c' 默认 char
字符串 → "abcdef" 默认 String
布尔 → true false 默认 boolean

