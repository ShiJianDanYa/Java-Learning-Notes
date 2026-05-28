---
title: 老师学生
tags:
  - java
  - 实践
  - 
date: 2026-05-26
创建时间: 2026-05-26 21:56:25
修改时间: 2026-05-26 21:56:25
星期: 星期二
难度: ⭐️⭐️
知识点: 继承 javaBean
关联:
---
# 📝 老师学生
## 📌 题目要求
> 带有继承结构的标准JavaBean类
> 书写一个完整的继承体系，要求私有化成员变量、get/set 方法、构造方法、其他的成员方法
> 
> `本科学生：`
> 属性：姓名、年龄、年级
> 行为：吃饭、睡觉、学习（攻读学学位）
> `硕士研究生：`
> 属性：姓名、年龄、年级
> 行为：吃饭、睡觉、学习（攻读硕士学位）
> `专业课老师：`
> 属性：姓名、年龄、学科
> 行为：吃饭、睡觉、教书（教专业课知识）
> `通识课老师：`
> 属性：姓名、年龄
> 行为：吃饭、睡觉、教书（教通识课知识）
> 
> 过了段时间，硕士研究住宿条件升级，在豪华版学公寓睡觉
> 

## 🧠 解题思路分析
**需求拆解 和 解题思路**
1. 第一步：创建人员父类 属性 姓名 年龄 行为 吃饭 睡觉
2. 第二步：👨‍🎓父类继承人员 添加 属性年级 行为学习
3. 第三步：👨‍🏫父类继承人员 添加 行为教书
4. 第四步：本科学生继承👨‍🎓父类  重写学习方法
5. 第五步: 硕士研究生👨‍🏫父类  重写学习方法
6. 第六步: 专业课老师 独有属性学科 重写教书方法
7. 第七步: 通识课老师 重写教书方法

## 💻 核心代码
```java
// 人员类
public class Person {  
    //标准的javaBean  
    //属性  
    private String name;  
    private int age;  
    //构造方法 空参构造 全参构造  
    public Person() {  
    }  
    public Person(int age, String name) {  
        this.age = age;  
        this.name = name;  
    }  
    //对应的get和set方法  
    public String getName() {  
        return name;  
    }  
    public void setName(String name) {  
        this.name = name;  
    }  
    public int getAge() {  
        return age;  
    }  
    public void setAge(int age) {  
        this.age = age;  
    }  
    //行为  
    public void eat(){  
        System.out.println("吃饭");  
    }  
    public void sleep(){  
        System.out.println("睡觉");  
    }  
}
```

```java
//学生类
public class Student extends Person{  
    private String grade;  
    //构造方法  
    public Student() {  
    }  
    public Student(int age, String name, String grade) {  
        super(age, name);  
        this.grade = grade;  
    }  
    //get/set方法  
    public String getGrade() {  
        return grade;  
    }  
    public void setGrade(String grade) {  
        this.grade = grade;  
    }  
    //行为  
    public void study(){  
        System.out.println("学生正在学习");  
    }  
}
```

```java
//教师类
public class Teacher extends Person{  
    //构造方法  
    //空参构造  
    public Teacher() {  
    }    //全参构造  
    public Teacher(int age, String name) {  
        super(age, name);  
    }  
    //行为  
    public void teach(){  
        System.out.println("老师正在教书");  
    }  
}
```

```java
//本科学生
public class Undergraduate extends  Student{  
    //私有化 成员变量 无 没有独有  
    //构造方法  
    //空参构造  
    public Undergraduate() {  
    }    //全参构造(间接父类+直接父类+自己)  
    public Undergraduate(int age, String name, String grade) {  
        super(age, name, grade);  
    }  
    //set/get方法  
    //重写方法  
    @Override  
    public void study() {  
        System.out.println("本科学生在学习本科内容");  
    }  
}
```

```java
//硕士研究生
public class MatserStudent extends  Student{  
    //构造方法  
    public MatserStudent() {  
    }  
    public MatserStudent(int age, String name, String grade) {  
        super(age, name, grade);  
    }  
    //重写方法  
    @Override  
    public void study() {  
        System.out.println("硕士研究生在学习硕士内容");  
    }  
    //睡觉 升级  
    @Override  
    public void sleep() {  
        System.out.println("在豪华版学生公寓睡觉");  
    }  
}
```

```java
//专业课老师
public class MajorTeacher extends Teacher{  
    //学科属性私有属性  
    private String subject;  
    //构造方法  
    public MajorTeacher() {  
    }  
    public MajorTeacher(int age, String name, String subject) {  
        super(age, name);  
        this.subject = subject;  
    }  
    //get/set  
  
    public String getSubject() {  
        return subject;  
    }  
  
    public void setSubject(String subject) {  
        this.subject = subject;  
    }  
  
    @Override  
    public void teach() {  
        System.out.println("专业课老师正在传授"+subject+"课知识");  
    }  
}
```

```java
//通识课老师
public class GeneralTeacher extends  Teacher{  
    public GeneralTeacher() {  
    }  
    public GeneralTeacher(int age, String name) {  
        super(age, name);  
    }  
  
    @Override  
    public void teach() {  
        System.out.println("通识课老师正在教授通识知识");  
    }  
}
```

```java
//测试类
public class Test {  
      public static void main(String[] args) {  
        MatserStudent ms = new MatserStudent(18,"张三","2023级");  
        ms.study();  
        ms.sleep();  
        ms.eat();  
        System.out.println(ms.getGrade());  
  
        Undergraduate ug = new Undergraduate(18,"李四","2020级");  
        ug.study();  
        ug.sleep();  
        ug.eat();  
        System.out.println(ug.getGrade());  
  
        GeneralTeacher gt = new GeneralTeacher(18,"王五");  
        gt.teach();  
        gt.sleep();  
        gt.eat();  
  
        MajorTeacher mt = new MajorTeacher(18,"赵六","数学");  
        mt.teach();  
        mt.sleep();  
        mt.eat();  
        System.out.println(mt.getSubject());  
    }  
}
```
## 🧪 运行结果

```text
硕士研究生在学习硕士内容
在豪华版学生公寓睡觉
吃饭
2023级
本科学生在学习本科内容
睡觉
吃饭
2020级
通识课老师正在教授通识知识
睡觉
吃饭
专业课老师正在传授数学课知识
睡觉
吃饭
数学

进程已结束，退出代码为 0
```

##  🐛 调试记录 & 踩坑

| 问题现象 | 报错/日志 | 原因分析 | 解决方案 |
| -------- | --------- | -------- | -------- |
|          |           |          |          |
|          |           |          |          |

## ⚠️ 易错点 / 注意事项
java Bean 类的特点
* **所有成员变量必须私有化**（使用 `private` 修饰）
- **提供无参构造方法**（必须有，框架反射常用）
- **为每个私有变量提供公共的 getter/setter 方法**
- **类必须是公共的**（`public class`）

## 📖 教师反馈 & 优秀解法
### 标准/更优解法
```java
	//标准解法代码
```
### 对比反思
我的方案 vs 参考答案，差距在哪里？是否可重构？

## 🚀 扩展思考
* 如果改成...怎么做？
* 与之前某题的异同
## 📁 项目位置
