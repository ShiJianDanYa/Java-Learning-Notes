---
title: 集合ArrayList
tags:
  - java
  - API
  - ArrayList
date: 2026-06-03
创建时间: 2026-06-03 14:52:09
修改时间: 2026-06-03 14:52:09
星期: 星期三
banner: pixel-banner-images/粉色套裝 (5).jpg
banner-height: 760
---
# 知识目录

# 1— 引入问题
数组一旦定义完成长度是不可变的
增加 删除 插入 数据 都会很麻烦 
必须新建一个数组，再把符合要求的数据依次存入
# 2— 核心内容
## 集合定义
`集合：` 是一种长度可变的容器
随着你的操作改变长度 ，增加长度+1,减少长度-1
## 集合特点
1. 长度可变
2. 只能存引用数据类型，不能存基本数据类型
## 构造方法
```java
ArrayList( )                     创建一个长度为 0 的集合
```
问题：能判断集合中能存储什么类型的数据吗？  
以数组为例
int[] arr = new int[3]; 我们一眼就可以看出是 存储 int 类型的数据
如果没有进行限定，此时集合里面可以存储任意数据类型的数据
但是如果是所有类型的数据都可以
那我们取出的时候改用什么类型接收呢，用最终父类 Object
多态可以 ，但是弊端呢 ，子类独有方法该怎么用呢？
转为子类，如果协同开发，代码是你同事写的又该如何呢？
## 泛型
泛型：限定集合当中的数据类型<数据类型>
```java
ArrayList<String> list = new ArrayList<String>();
//同样也可以简化 JDK7的时候，后面的泛型可以省略不写，但是见括号必须保留
ArrayList<String> list = new ArrayList<>();
```
## 方法

| 方法名                      | 说明   |
| ------------------------ | ---- |
| boolean add(E e)         | 添加数据 |
| void add(int index， E e) | 添加数据 |
| boolean remove(E e)      | 删除元素 |
| E remove(int index)      | 删除元素 |
| E set(int index,E e)     | 修改元素 |
| E get(int index)         | 获取元素 |
| int size()               | 集合长度 |
### 添加数据
细节 1
ArrayList 的 add 方法不管添加什么都添加成功，忽略返回值即可   true：添加成功 false:添加失败  
细节 2
如果集合长度为 3，那么下面方法要添加的索引范围只能是 0~3 
如果索引 是3 把当前元素添加到集合的末尾，等同于一个参数的 add 方法 
如果要添加的索引超出了这个范围，程序就会直接报错  
⚠️
在集合当中无法直接添加基本数据类型的（byte short int long float double char boolean）   只能添加引用数据类型（对象） 如果在集合里面一定要添加基本数据类型，那么可以转成其对应的[[05_包装类|包装类]]
```java
//添加数据  
//细节1：ArrayList的add方法不管添加什么都添加成功，忽略返回值即可  
//true：添加成功 false:添加失败  
//此时add方法在任意情况下，都会添加成功，永远不会失败  
//因为在Java当中，有很多很多的集合HashSet（元素要唯一）  aaa(true) aaa(false)
//设计：跟其他的集合保持统一（面向对象的思想）  
boolean hello = list.add("hello");  
System.out.println(hello);  
list.add("world");  
list.add("java");  
System.out.println(list);  
//细节1：  
//如果集合长度为3，那么下面方法要添加的索引范围只能是0~3  
//0- 2已经存在的索引  
//3：把当前元素添加到集合的末尾，等同于一个参数的add方法  
//如果要添加的索引超出了这个范围，程序就会直接报错  
list.add(2,"插入");  
System.out.println(list);  
//非要求类型 直接报错  
//list.add(123); 
 
//细节2：在集合当中无法直接添加基本数据类型的（byte short int long float double char boolean）  
//只能添加引用数据类型（对象）  
//如果在集合里面一定要添加基本数据类型，那么可以转成其对应的包装类（下一个视频）
```
add 方法 代码 永远是 true
![[01_ArrayList_2026-06-03_15-43-41.png]]
结果
```text
true
[hello, world, java]
[hello, world, 插入, java]
```
### 删除方法
细节一
根据元素的内容进行删除的存在 删除成功 true 不存在删除失败 false
细节 二
根据索引进行删除的   会把被删除的元素进行返回  
⚠️ 如果当前的索引不存在，代码会报错  
```java
//删除方法  
//boolean remove(E e)       根据元素删除  
//细节：  
//根据元素的内容进行删除的存在：  
// 删除成功true         不存在：删除失败false  
boolean remove = list.remove("world");  
System.out.println(remove);  
System.out.println(list);  
//E remove(int index)       根据索引删除  
//细节：  
//根据索引进行删除的  
//会把被删除的元素进行返回  
//注意：  
//如果当前的索引不存在，代码会报错  
String remove1 = list.remove(1);  
System.out.println("删除元素为"+remove1);  
System.out.println(list);
```
结果
```test
true
[hello, 插入, java]
删除元素为插入
[hello, java]
```
### 修改方法
细节 把指定索引上的数据修改为新的数据，把被替换的元素进行返回 
注意 如果当前的索引不存在，代码会报错
```java
//E set(int index,E e)     将指定位置的数据，修改为新元素  
//细节：  
//把指定索引上的数据修改为新的数据，把被替换的元素进行返回  
//注意：  
//如果当前的索引不存在，代码会报错  
String set = list.set(1, "修改");  
System.out.println("被修改的元素为："+set);  
System.out.println(list);
```
结果
```test
被修改的元素为：java
[hello, 修改]
```
### 获取方法
```java
//E get(int index)                               	   获取元素  
//     int size()                                      集合长度  
String get = list.get(1);  
System.out.println("获取的元素为："+get);  
System.out.println("集合长度为："+list.size());  
//集合遍历  
//遍历： get + size//遍历：把容器里面的数据一个一个的拿出来，打印，计算，处理  
for (int i = 0; i < list.size(); i++) {  
    String s = list.get(i);  
    System.out.println(s);  
}  
//只能看一看集合当中有什么，无法操作里面的每一个元素  
System.out.println( list);
```
结果
```Test
获取的元素为：修改
集合长度为：2
hello
修改
[hello, 修改]
```
# 3— 扩展知识
🈚️
# 4— 总结复习
🈚️