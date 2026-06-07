package com.itheima.domain;

import java.util.Random;

/**
 * ClassName: User
 * Package: com.itheima.domain
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/6/5 - 11:58
 * @Version: v1.0
 *
 */
public class User {
	//属性：id、用户名、密码、状态
	//id格式是 heima + 5位随机数
	//所以 类型是 String
	private String id;
	private String username;
	private String password;
	//状态：true账户可用，false账户禁用
	private boolean status;
	//无参构造方法
	public User() {
		//调用createId方法设定id
		this.id = createId();
		//修改status的值
		//一般情况下默认值是false
		//奥 人家 注册 给人家禁用了 搞笑
		//所以 这里 默认值变为 true
		status = true;
	}
	//有参构造方法

	public User(String username, String password) {
		//调用createId方法设定id
		this.id = createId();
		this.username = username;
		this.password = password;
		status = true;
	}
	//id 用户无法设置，是自动生成的，格式为：heima+5位数字的随机数
	public String createId() {
		StringBuilder sb = new StringBuilder();
		sb.append("heima");
		//随机数
		Random rd = new Random();
		for (int i = 0; i < 5; i++) {
			//循环五个随机🔢
			//随机范围是=~9
			int num = rd.nextInt(10);
			//拼接
			sb.append(num);
		}
		//转为字符串
		return sb.toString();
	}

	//getter和setter方法

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
}
