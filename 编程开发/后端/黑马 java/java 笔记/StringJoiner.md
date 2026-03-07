---
time: 2025-06-06T22:30:00
tags:
  - java
  - 面向对象
  - 字符串
  - "#StringJoiner"
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
# StringJoiner

## 作用


StringJoiner跟StringBuilder一样，也可以看成是一个容器，创建之后里面的内容是可变的。

作用：提高字符串的操作效率，而且代码编写特别简洁，但是目前市场上很少有人用。

![[附件存储/0956b60e5433ed2bb5307dcf3a1a7425_MD5.png]]

## 构造方法
![[附件存储/09c86acfc3b878523d16e422e082abd9_MD5.png]]

## 成员方法
 ![[附件存储/c94dc0621fb9399f03e754325f156afd_MD5.png]]

```java
public class StringJoinerDemo {  
    public static void main(String[] args) {  
        //创建一个StringJoiner对象  
        StringJoiner sj = new StringJoiner(",", "[", "]");  
        //添加元素  
        sj.add("aaa").add("bbb").add("ccc");  
        //输出  
        System.out.println(sj);  
        //个数  
        System.out.println(sj.length());  
        //转为字符串  
        String s = sj.toString();  
        System.out.println(s);  
  
        System.out.println("程序结束");  
    }  
}
```







<aside>
<img src="https://www.notion.so/icons/push-pin_purple.svg" alt="https://www.notion.so/icons/push-pin_purple.svg" width="40px" /> <font color="#ff0000">总结--反思</font>
</aside>