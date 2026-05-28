---
title: 07_继承_java中的权限修饰符
tags:
  - java
  - 面向对象高级
  - 权限修饰符
date: 2026-03-25
创建时间: 2026-03-25 20:17:33
修改时间: 2026-03-25 20:17:33
星期: 星期三
banner: "![[pixel-banner-images/樱岛麻衣 (5).jpg]]"
banner-height: 710
---

# 1— 引入问题
在前面学习的知识点里 
2.了解：子类重写父类方法时，访问权限子类必须大于等于父类（空着不写< protected<public)
其中中的访问权限到底是什么意思
# 2— 核心思想
## 1— java中的权限修饰符
权限修饰符：其实就是Java中的关键字，用来控制一个成员被访问的范围
修饰的内容：可以修饰成员变量，成员方法构造方法等
作用范围由小到大 `（private<空着不写< protected < public)`
权限修饰符

| 修饰符                                  | 同一个类 | 本包中其他类 | 不同包下的子类 | 不同包下的无关类 |
| ------------------------------------ | :--: | :----: | :-----: | :------: |
| <font color="#ff0000">private</font> |  ✅️  |   ❌️   | ❌️<br>  |  ❌️<br>  |
| 空着/缺省/默认                             |  ✅️  |   ✅️   |   ❌️    |    ❌️    |
| protected                            |  ✅️  |   ✅️   |   ✅️    |    ❌️    |
| <font color="#ff0000">public         |  ✅️  |   ✅️   |   ✅️    |    ✅️    |
## 代码演示
体系结构截图
![[01_权限修饰符_2026-05-24_14-42-41.png]]

代码如下
Person
```java
public class Person {  
    //父类  
    public String name;  
    public void test(){  
        System.out.println("父类test方法");  
    }  
    //同一类中  
    public void show(){  
        System.out.println(name);  
        test();  
    }  
}
```
Student
```java
public class Student extends  Person{  
    //本包子类  
    //本包中的其他类(子类+无关类是一个逻辑)  
    public void show(){  
        System.out.println(name);  
        super.test();  
    }  
}
```
Teacher
```java
package ch01课堂代码.ch02权限修饰符.bbb;  
import ch01课堂代码.ch02权限修饰符.aaa.Person;
public class Teacher extends Person {  
    //不同包下的子类  
    public void show(){  
        System.out.println(name);  
        super.test();  
    }  
}
```
Test
```java
package ch01课堂代码.ch02权限修饰符.bbb;  
import ch01课堂代码.ch02权限修饰符.aaa.Person;
public class Test {  
    //不同包下的无关类  
    public static void main(String[] args) {  
        Person p = new Person();  
        System.out.println(p.name);  
        p.test();  
    }  
}
```
private
![[02_权限修饰符_2026-05-24_14-53-59.png]]
空着 不写
![[03_权限修饰符_2026-05-24_15-12-45.png]]
protected
![[04_权限修饰符_2026-05-24_15-14-30.png]]
public
![[05_权限修饰符_2026-05-24_15-16-53.png]]
# 3— 注意事项
🈚️
# 4— 知识扩展
🈚️