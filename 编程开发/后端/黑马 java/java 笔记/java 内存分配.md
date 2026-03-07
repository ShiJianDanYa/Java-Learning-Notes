---
time: 2026-01-12T20:37:00
tags:
  - java
  - "#java内存分配"
banner: "![[pixel-banner-images/Frost 2B (3).jpg]]"
---
❕ <font color="#7030a0">星级代表重要度</font> ⭐️⭐️⭐️⭐️⭐

绿色--了解🟢
黄色--难点🟠️
红色--重点🔴
# java内存分配

![[附件存储/589cf529a63664179ee46f93d8e7ecc7_MD5.png|824]]

JDK7以前方法区和堆是连在一起的

![[附件存储/6c08acd5da497cb08c64539201a22019_MD5.png|824]]

![[附件存储/c63d3e9fc1795e57712c0629ee2620a5_MD5.png|824]]

java内存分配
* 栈 <font color="#c00000">方法运行时使用的内存</font>，比如main方法运行，进入方法栈中执行
* 堆 存储对象或者数组，<font color="#c00000">new来创建，都存储在堆内存</font>
* 方法区 <font color="#c00000">存储可以运行的Class文件</font>
* 本地方法栈 jvm在使用操作系统的时候使用
* 寄存器 给cpu使用 

![[附件存储/d7a71bd828e9fad9dfab2d16d0bf4f8f_MD5.png|824]]


![[附件存储/dfe9fbe116c865acd8122eb32aeaca71_MD5.png|824]]

![[附件存储/57903d5dc027d0cadda290141fcf0251_MD5.png|824]]

![[附件存储/20c55b8802f6ebc6fdfd4502a437a4ec_MD5.png|824]]

![[附件存储/239687d88a34d1582e989d0465b88951_MD5.png|824]]


![[附件存储/d9bc7cc07155034e2d9e76d878ab39bb_MD5.png|824]]

![[附件存储/1aed4f63e3fdf196d65651eddaf8ae71_MD5.png|824]]

规律

1. 只要是new，就一定是在堆里开辟了一块小空间
2. new 多次，就是开辟了多个小空间，每个小空间都有自己各自的数据
3. 当两个数组指向同一个小空间，他们的空间就是共享的，一个改变另一个也会改变

两个数组指向同一个空间的内存图

![[附件存储/1ee79c2d84aa79ba4315aa8e7554a1bf_MD5.png|824]]

![[附件存储/43ba99aa6f7e4c7f93889c9b37275364_MD5.png|824]]
