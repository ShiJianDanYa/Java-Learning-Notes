---
title: 字符串String
tags:
  - java
  - API
  - 字符串String
date: 2026-06-01
创建时间: 2026-06-01 08:51:43
修改时间: 2026-06-01 08:51:43
星期: 星期一
banner: pixel-banner-images/粉色套裝 (3).jpg
banner-height: 870
---
# 知识目录

# 1— 引入问题
用户登录对比用户名和密码
快递填写地址,一整块文字如何正确分割
游戏敏感词替换
这些情况开发中几乎都会用到次数还不低,总不能每次开发都自己再写一遍吧,太麻烦了/
# 2— 核心内容
## 定义
String 类，定义在 `java.lang 包` 下，`无需导包`。
Java 中的所有字符串文字（例如"abc"）都为此类的对象
## 格式
```java
String name="尼古拉斯·阿玮";
String schoolName="黑马程序员";
```
## 注意事项
字符串的内容是不可变的，它的对象在创建后不能被更改 
![[01_字符串String_2026-06-01_09-20-03.png]]
同样 再赋值也是 是两个字符串 替换关系
![[02_字符串String_2026-06-01_09-22-11.png]]
## 创建 String 对象的方式
### 直接赋值 
```java
//直接赋值  最简单 最常用  
String s1 = "hello world";  
System.out.println(s1);
```
结果
```Test
hello world
```
### new 关键字

| 构造方法                               | 说明                 |
| ---------------------------------- | ------------------ |
| public String()                    | 空白字符串，不含任何内容       |
| public String(String original)<br> | 根据传入的字符串，创建新的字符串对象 |
| public String(char[] chs)          | 根据字符数组，创建字符串对象     |
| public String(byte[] chs)          | 根据字节数组，创建字符串对象     |
new+构造方法的方式创建字符串对象
new+空参构造
```java
//new+空参构造  
String s2 = new String();  
System.out.println("["+s2+"]");
```
结果
```Test
[]
```
new+有参构造
```java
//new+有参构造
//根据传入字符串的内容，创建一个新的字符串对象 
String a = "你好啊世界";  
String s3 = new String(a);  
System.out.println(s3);
```
结果
```Test
你好啊世界
```
new+有参构造(字符数组，创建字符串对象)
```java
//new+有参构造(字符数组，创建字符串对象)  
char[] chs = {'是','在','下','无','敌','啦'};  
String s4 = new String(chs);  
System.out.println(s4);

```
结果
```Test
是在下无敌啦
```
new+有参构造(字节数组，创建字符串对象)
```java
//new+有参构造(字节数组，创建字符串对象)  
//ASCII码表  
//97 = a  
//98 = b  
byte[] bytes = {97,98,99};  
String s5 = new String(bytes);  
System.out.println(s5);
```
结果
```Test
abc
```
### 在内存中的区别
字符串常量池 StringTable(串池）
作用存储字符串
位置
`jdk 7 以前(不包含 jdk 7)`
![[03_字符串String_2026-06-01_10-20-05.png]]
jdk 7
![[04_字符串String_2026-06-01_10-20-53.png]]

直接赋值
第一步加载字节码文件
![[05_字符串String_2026-06-01_10-21-49.png]]
第二步 main 方法进栈
![[06_字符串String_2026-06-01_10-22-30.png]]
第三步
在栈中声明类型为 String 的变量名字为 S 1
在串池中创建对应的字符串对象
先看是否有
没有才会创建字符串对象
将地址赋值给 s 1
![[07_字符串String_2026-06-01_10-27-06.png]]
第四步
还是声明变量 
但是串池检查已经有了,复用 已经存在的
![[08_字符串String_2026-06-01_10-29-37.png]]
new 
创建字符数组
![[09_字符串String_2026-06-01_10-31-22.png]]
在栈中创建变量 通过 chs 创建字符对象赋值 并且把其地址值赋给 s 1
![[10_字符串String_2026-06-01_10-32-24.png]]
s 2 同理
![[11_字符串String_2026-06-01_10-33-59.png]]
注意直接 new 是不存在复用机制
看通过 new 的 s 1 和 s 2 所对应的地址值是不同的

通过传入的字符串对象
串池创建对应对象赋值
![[12_字符串String_2026-06-01_10-36-40.png]]
通过串池里的字符串 创建对象并给其赋值 然后将地址值给 s 1
![[13_字符串String_2026-06-01_10-38-03.png]]
s 2 同理
![[14_字符串String_2026-06-01_10-39-36.png]]
所以
获取字符串对象的两种方式：
`直接赋值：` 代码简单+串池复用
`new：` 每次都会创建一个新的字符串对象

## 字符串常见的成员方法
### 比较字符串
```java
//比较
String s1 = new String("abc");
String s2 = "abc";
System.out.println(s1 == s2);
```
结果是
```text
false
```
等等号运算符到底比的是什么?
1. 基本数据类型比较的是数据值
2. 引用数据类型比较的是地址值

如果我要比较字符串的内容呢？
#### 格式
```java
boolean equals方法(要比较的字符串）  		   //完全样结果才是true，否则为false
boolean equalsIgnoreCase(要比较的字符串）  //忽略大小写的比较
```

例子
```java
//用户名  
String name = "lisi";  
//密码  
String pwd = "123";  
//登录次数  
int count = 3;  
//接收用户输入  
Scanner sc = new Scanner(System.in);
//因为次数已经确定了3次,所以for显然更合适  
for(int i = 0; i < 3; i++){  
    System.out.println("您还有" + (3-i) + "次机会！");  
    //次数判断 直接和for结合  
    //接收用户输入  
    System.out.println("请输入用户名：");  
    String name2 = sc.next();  
    System.out.println("请输入密码：");  
    String pwd2 = sc.next();  
    //布尔 变量 接收  
    boolean flag = name2.equals( name) && pwd2.equals(pwd);  
    //如果对布尔类型的变量进行判断的时候，不建议写==  
    //建议：如果对布尔类型的变量进行判断，建议直接把变量写在小括号当中  
    //表示：判断变量里面记录的值是真还是假，如果是真执行if，如果是假执行else  
    if(flag){  
       System.out.println("登录成功！");  
       break;  
    }else {  
       System.out.println("用户名密码都错误！");  
    }  
    //判断位置和do...while不一样  
    if(i == 2){  
       System.out.println("登录失败！账号"+name+"被锁定，请联系黑马程序员客服e1012345678");  
    }  
}
```
结果
✅
```Test
您还有3次机会！
请输入用户名：
lisi
请输入密码：
123
登录成功！

进程已结束，退出代码为 0
```
❌
```Test
您还有3次机会！
请输入用户名：
whwu
请输入密码：
123
用户名密码都错误！
您还有2次机会！
请输入用户名：
张三
请输入密码：
123
用户名密码都错误！
您还有1次机会！
请输入用户名：
呜呜
请输入密码：
123
用户名密码都错误！
登录失败！账号lisi被锁定，请联系黑马程序员客服e1012345678

进程已结束，退出代码为 0
```
### 遍历字符串
格式
```java
public char charAt(intindex);				根据索引返回字符
public int length();						返回此字符串的长度

数组的长度：数组名.length
字符串的长度：字符串对象.length()
```
注意 
1. charAt 也有索引越界问题,
2. 字符长度是方法后面有();

例子
```java
// charAt  
String s = "于苦难中扎根,以坚韧铸荣光";  
//注意和数组一样也存在索引越界问题  
char c1 = s.charAt(3); //'中'  
System.out.println(c1);  
//length()  
int len = s.length();  
System.out.println(len);  
  
//需求：键盘录入一个字符串，使用程序实现在控制台遍历该字符串  
Scanner sc = new Scanner(System.in);  
System.out.println("请输入一个字符串:");  
String s1 = sc.next();  
//字符串遍历中循环的快速生成方式s.length().fori  
for (int i = 0; i < s1.length(); i++) {  
    char c = s1.charAt(i);  
    System.out.println(c);  
}
```
结果
```Test
中
13
请输入一个字符串:
发生口角
发
生
口
角

进程已结束，退出代码为 0
```
### 截取字符串
格式
```java
String substring(int beginlndex, int endIndex)        截取
注意点：包头不包尾，包左不包右
	   只有返回值才是截取之后的结果
String substring(int beginlndex)				      从beginlndex开始直接截取到末尾
```

例子
```java
//定义字符串  
String stu = "欧洲不安,中美冷战性质已变";  
//截取  
//第一个参数：截取的开始索引  
//第二个参数：截取的末尾索引  
//包头不包尾，包左不包右 以0~9位为例 子
//---->包含0索引，但是不包含9索引  
//字符串本身一旦创建之后，是无法发现改变的，  
// 截取的时候不会影响调用者的字符串，  
// 切记：只有返回值才是截取之后的结果  
String sub = stu.substring(0, 9);  
System.out.println(sub);  
//参数：截取的开始索引，默认是截取到字符串的末尾  
//字符串本身一旦创建之后，是无法发现改变的，  
// 截取的时候不会影响调用者的字符串，  
// 切记：只有返回值才是截取之后的结果  
String sub1 = stu.substring(5);  
System.out.println(sub1);  
  
  
//练习：  
//只保留用户名的第一个字符，后面用三个***替代  
String name = "jianlun";  
//charAt(0)  
char sub2 = name.charAt(0);  
String sub3 = sub2+"***";  
System.out.println(sub3);  
//substring(0,1)  
String sub4 = name.substring(0,1);  
sub4+="***";  
System.out.println(sub4);
```
结果
```Test
欧洲不安,中美冷战
中美冷战性质已变
j***
j***

进程已结束，退出代码为 0
```
### 替换字符串
```java
String replace(旧值，新值)
//替换
//注意点：只有返回值才是替换之后的结果
//substring 截取：截取固定位置的数据
//replac替换：位置不确定，替换指定内容
```
例子
```java
String sentence = "傻逼,大傻逼,超级大傻逼";  
//替换  
//替换  
//第一个参数：被替换的数据  
//第二个参数：用来替换的数据  
//只有返回值才会替换之后的结果  
sentence = sentence.replace("傻逼", "笨蛋");  
System.out.println( sentence);  
  
//定义敏感词库  
String[] words = {"傻逼", "傻B", "你妈的","他妈的"};  
//用户输入  
Scanner sc = new Scanner(System.in);  
System.out.println("用户请输入测试脏话");  
String stu = sc.next();  
//循环替换  
for (int i = 0; i < words.length; i++) {  
    stu = stu.replace(words[i], "***");  
}  
//输出  
System.out.println(stu);
```
结果
```Test
笨蛋,大笨蛋,超级大笨蛋
用户请输入测试脏话:
你妈的,靠你妈的,你是傻逼吧

***,靠***,你是***吧
进程已结束，退出代码为 0
```
## 常用方法
⚠️  `不需要背诵   了解即可`
是否包含     contains 方法
ctrl+鼠标左键
源代码
![[01_其他常用方法_2026-06-02_08-44-05.png]]
那这个 charSequence 到底是什么
继续 ctrl+鼠标左键
![[02_其他常用方法_2026-06-02_08-45-59.png]]
实现接口
![[03_其他常用方法_2026-06-02_08-48-28.png]]
这个接口就是提供了一些字符串读取的规则
如果一个方法的形参 是他 `charSequence`,那我们就可以传递字符串对象
![[04_其他常用方法_2026-06-02_08-52-38.png]]
### 是否包含 
 是否包含    contains 
代码
```java
//创建字符串  
String str = "hello world";  
//是否包含      contains
//contains---敏感词过滤  tmd
//替换之前判断是否存在 存在才替换  
System.out.println(str.contains("llo"));  
System.out.println(str.contains("nihc"));
```
结果
```Test
true
false
```
### 判断开头、结尾          
判断开头、结尾                  startsWith / endswith
代码
```java
//判断开头、结尾          startsWith/endswith
//判断文件的后缀名  
//比如判断是否为文本文件  str.endswith(".txt");

//判断str是否以hello作为开头  
System.out.println(str.startsWith("hello"));  
//判断str是否以你好作为开头  
System.out.println(str.startsWith("你好"));  
//判断str是否以d作为结尾  
System.out.println(str.endsWith("d"));  
//判断str是否以世界作为结尾  
System.out.println(str.endsWith("世界"));  

//判断str从0索引开始，是否以hello开头  
System.out.println(str.startsWith("hello",0));  
//判断str从1索引开始，是否以hello开头  
System.out.println(str.startsWith("hello",1));
```
结果
```Test
true
false
true
false
true
false
```
### 查找                   
查找        indexOf(int ch)     lastIndexOf(int ch)
代码
```java
//查找      indexOf(int ch)     lastIndexOf(int ch)
//如果当前要查找的内容不存在，方法会返回-1  
//查找当前字符/字符串 第一次出现的索引  
str = "abcdefga";  
System.out.println(str.indexOf(97));  
//查找当前字符/字符串 最后一次出现的索引  
System.out.println(str.lastIndexOf(97));  
System.out.println(str.lastIndexOf('王'));
```
结果
```Test
0
7
-1
```

### 判断是否为空
判断是否为空          isEmpty()
代码
```java
//判断是否为空            isEmpty()
//登录注册 判断用户是否输入  
System.out.println(str.isEmpty());  
str = "";  
System.out.println(str.isEmpty());
```
结果
```Test
false
true
```
### 转字符数组
转字符数组              toCharArray()
代码
```java
//转字符数组       toCharArray()
//"abcdaefg"---->['a','b','c','d','a','e','f',g]  
//"abc"-->0索引改为A 先变为字符数组.a变为A,在转为字符串  
str = "你好啊,世界";  
char[] chars = str.toCharArray();  
for (int i = 0; i < chars.length; i++) {  
    System.out.println(chars[i]);  
}
```
结果
```Test
你
好
啊
,
世
界
```
### 大小写转换
大小写转换         toUpperCase()、toLowerCase()
代码
```java
//大小写转换        toUpperCase()、toLowerCase()  
     
str = "   hello world   ";  
System.out.println(str.toUpperCase());  
System.out.println(str.toLowerCase());  
```
结果
```Test
    HELLO WORLD   
    hello world   
```
### 去除头尾空格
去除头尾空格            trim()
代码
```java
 //去除头尾空格 trim()
 //登录注册 用户开头误输入空格  
str = "   hello world   ";
System.out.println(str.trim());
```
结果
```Test
hello world
```
# 3— 扩展知识
🈚️
# 4— 总结复习
🈚️