package com.itheima.domain;

import java.util.ArrayList;

/**
 * ClassName: HeroCharacter
 * Package: com.itheima.domain
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/6/8 - 14:42
 * @Version: v1.0
 *
 */
//我方游戏人物角色
public class HeroCharacter extends Charaacter {
	//技能列表
	public ArrayList<String> skillList;
	//构造方法
	//顺手把集合的对象也创建了
	//好处：外界我要给我方角色添加技能的时候，无需考虑集合，直接add就行了
	public HeroCharacter() {
		super();
		skillList = new ArrayList<String>();
	}

	public HeroCharacter(String name, int HP, int attack, int defense) {
		super(name, HP, attack, defense);
		skillList = new ArrayList<String>();
	}

	//技能列表的展示
	public String showSkill(){
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < skillList.size(); i++) {
			//添加数据
			sb.append(skillList.get(i));
			//如果不是最后一个元素，再添加逗号空格
			if(i != skillList.size()-1){
				sb.append(", ");
			}
		}
		return sb.toString();
	}
}
