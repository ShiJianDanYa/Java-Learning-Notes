---
title: for循环
tags:
  - java
  - java语法
  - 循环语句
  - for循环
date: 2026-02-27
创建时间: 2026-02-27 18:39:17
修改时间: 2026-02-27 18:39:17
星期: 星期五
banner: "![[pixel-banner-images/GTEMAN (12).png]]"
banner-height: 690
---

# 1— 需要解决问题
已经确定好循环次数，该怎么循环？
# 2— 本质 意义 解决方法
## 1— for循环
### 1.1— 格式
```java
for(初始化语句;条件判断语句;条件控制语句){
	循环体语句;
}
```
以100 为例
```java
for(int i = 1;i<=100;i++){
	循环体语句;
}
```

![image.png](https://obsidian-1332276919.cos.ap-guangzhou.myqcloud.com/20260228131334659.png)
### 1.2— 执行流程
图示 解读
![image.png](https://obsidian-1332276919.cos.ap-guangzhou.myqcloud.com/20260316202423926.png)

1. 执行初始化语句
2. 执行条件判断语句，看其结果是否成立
	1. 成立：执行循环体语句
	2. 不成立：结束循环
3. 执行条件控制语句
4. 回到2继续执行条件判断语句

![image.png](https://obsidian-1332276919.cos.ap-guangzhou.myqcloud.com/20260228131915614.png)


# 3— 注意事项
1. 初始化语句只执行一次
2. 判断语句成立，循环继续
3. 判断语句不成立，循环结束
# 1— 知识扩展
🈚️