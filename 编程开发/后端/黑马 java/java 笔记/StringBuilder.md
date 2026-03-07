---
time: 2025-06-06T22:26:00
tags:
  - java
  - 面向对象
  - 字符串
  - "#StringBuilder"
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
# StringBuilder


## 是什么

是一个容器，创建后内容可以变化

## 作用

作用 ：提高字符串的操作效率
![[附件存储/eedf715762b357882940a0a948b37411_MD5.png]]


![[附件存储/b48ba3b41ed00f5bdde5e939ff911f28_MD5.png]]

## 构造方法

![[附件存储/7b5ed54b7af0dbafa2da800d31649842_MD5.png]]

## 常用方法

![[附件存储/de9d33d9809dff597c3a8a2ec04f11b0_MD5.png]]

```java
public class StringBuilderDEMO {  
    public static void main(String[] args) {  
        //创建一个StringBuilder对象  
        StringBuilder sb = new StringBuilder("abc");  
        //输出  
        //因为stringBuilder是Java已经写好的类  
        //java在底层对他做了一些特殊处理。  
        //打印对象不是地址值而是属性值。  
  
        //添加元素  
        sb.append("def");  
        sb.append("123");  
        sb.append(true);  
        //反转  
        sb.reverse();  
        //获取长度  
        int length = sb.length();  
        System.out.println(length);  
        //变回字符串  
        String s = sb.toString();  
  
        System.out.println(s);  
        System.out.println("程序结束");  
    }  
}
```








<aside>
<img src="https://www.notion.so/icons/push-pin_purple.svg" alt="https://www.notion.so/icons/push-pin_purple.svg" width="40px" /> <font color="#ff0000">总结--反思</font>
</aside>