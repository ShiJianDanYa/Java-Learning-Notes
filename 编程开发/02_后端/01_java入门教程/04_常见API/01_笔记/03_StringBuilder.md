---
title: StringBuilder
tags:
  - java
  - API
  - StringBuilder
date: 2026-06-02
创建时间: 2026-06-02 09:36:59
修改时间: 2026-06-02 09:36:59
星期: 星期二
banner: pixel-banner-images/粉色套裝 (4).jpg
banner-height: 950
---
# 知识目录

# 1— 引入问题
拼接字符串
```java
String s ="";
for (int i = 0; i < 1000000; i++) {
S = S + "abc";
System.out.println(s);
```
代码运行速度非常慢 2~3 分钟才可以
有什么方法可以提高效率
# 2— 核心内容
## 定义
StringBuilder 是字符串的一个工具类，可以让我们拼接字符串的时候效率更高

普通的字符串拼接
是依次拼接会产生很多冗余数据
![[01_StringBuilder_2026-06-02_09-49-38.png]]
StringBuilder 拼接
拼接字符串会依次放入容器当中
![[02_StringBuilder_2026-06-02_09-52-05.png]]
## 构造方法
```java
//构造方法
public StringBuilder()					创建StringBuilder容器，不含有任何內容
public StringBuilder(String str)		创建StringBuilder容器，包含指定的內容

```

## 常用方法

| 方法名                        | 说明              |
| -------------------------- | --------------- |
| StringBuilder append（任意类型) | 添加数据            |
| StringBuilder reverse()    | 反转容器中的内容        |
| int length()               | 返回长度（字符的个数）     |
| String toString()          | 转回 string 字符串对象 |


# 3— 扩展知识
<% tp.file.cursor(3) %>
# 4— 总结复习
<% tp.file.cursor(4) %>