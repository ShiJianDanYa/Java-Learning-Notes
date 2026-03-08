---
time: 2025-06-06T22:51:00
tags:
  - java
  - 面向对象
  - 集合
  - "#ArrayList"
banner: "![[pixel-banner-images/Frost 2B (3).jpg]]"
---
❕ <font color="#7030a0">星级代表重要度</font> ⭐️⭐️⭐️⭐️⭐
绿色--了解🟢
黄色--难点🟠️
红色--重点🔴

<aside>
<img src="https://www.notion.so/icons/question-mark_purple.svg" alt="https://www.notion.so/icons/question-mark_purple.svg" width="40px" /> <font color="#e36c09">总结问题</font>

</aside>

<aside>
<img src="https://www.notion.so/icons/drafts_purple.svg" alt="https://www.notion.so/icons/drafts_purple.svg" width="40px" /> <font color="#92d050">笔记正文</font>

</aside>
```table-of-contents
```
# ArrayList


## 1— 格式
```java
public class ArrayList001 {  
    public static void main(String[] args) {  
        //创建集合对象  
        //泛型 :限定集合中存储数据的类型  
        //ArrayList<String> list = new ArrayList<String>();  
        //jdk7以后 后面可以不写泛型  
        ArrayList<String> list = new ArrayList<>();  
        //此时我们创建的是ArrayList的对象，而ArrayList是java已经写好的一个类  
        //这个类在底层做了一些处理  
        //打印对象不是地址值，而是集合中存储数据内容  
        //在展示的时候会拿里面把所有的数据进行包裹  
        System.out.println(list);  
        System.out.println("程序结束");  
    }  
}
```

## 2— 成员方法 

![[附件存储/d77f22d32bfddf88fc29dfa457f42a9c_MD5.png]]

```java
//对元素修改  
//会返回一个boolean值,判断是否成功  
//添加元素  
//添加什么都会成功  
list.add("张三");  
list.add("李四");  
list.add("王五");  
//删除元素  
list.remove("王五");  
//删除会返回被删除元素  
System.out.println(list.remove(0));  
//修改元素  
//会返回被修改之前的元素  
System.out.println(list.set(0,"赵六"));  
//查询元素  
//会返回对应索引的元素  
System.out.println(list.get(0));  
//集合长度 遍历  
for (int i = 0; i < list.size(); i++) {  
    System.out.println(list.get(i));  
  
}
```

## 3— 基本数据类型所对应的包装类
![[附件存储/bf740c40549ab4e7cee9fd5474f46828_MD5.png]]








<aside>
<img src="https://www.notion.so/icons/push-pin_purple.svg" alt="https://www.notion.so/icons/push-pin_purple.svg" width="40px" /> <font color="#ff0000">总结--反思</font>
</aside>