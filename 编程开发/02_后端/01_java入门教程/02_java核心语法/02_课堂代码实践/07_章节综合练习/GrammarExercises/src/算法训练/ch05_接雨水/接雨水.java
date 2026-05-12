package 算法训练.ch05_接雨水;

/**
 * ClassName: 接雨水
 * Package: 算法训练.ch05_接雨水
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/5/4 - 21:15
 * @Version: v1.0
 *
 */
public class 接雨水 {
	public static void main(String[] args) {
		/*给定n个非负整数表示每个宽度为1的柱子的高度图，
		计算按此排列的柱子，下雨之后能接多少雨水
		输入：height = [0,1,0,2,1,0,1,3,2,1,2,1]
		输出：6
		*/

		//先创建数组
		int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
		//定义第三方变量记录最高的柱子高度
		int max = 0;
		//遍历数组 记录雨水和柱子的总和
		//从左到右遍历
		//创建数组存储数据
		int[] leftMax = new int[height.length];
		//开始遍历
		for (int i = 0; i < height.length; i++) {
			//判断当前柱子高度是否比最大柱子高度高
			/*
			老师的解法
			if(max>height[i]){//当前柱子小于最高柱子高度
			//存储柱子取最高柱子
				leftMax[i] = max;
			}else{//当前柱子比最大柱子高或相等
			//存储柱子 取当前柱子高度
				leftMax[i] = height[i];
			//最高柱子更新
				max = height[i];
			}
			*/
			if(height[i]>max){ //当前柱子大于最高柱子高度
				//最高柱子更新
				max = height[i];
			}
			//存储柱子取最高柱子
			leftMax[i] = max;
		}
		//从右到左遍历
		 max = 0;
		//创建数组存储数据
		 int[] rightMax = new int[height.length];
		 //开始遍历
		for (int i = height.length-1; i >=0; i--) {
			//判断当前柱子高度是否比最大柱子高度高
			if(height[i]>max){
				max = height[i];
			}
			//存储柱子加雨水的总量
			rightMax[i] = max;
		}
		//开始取交集 两者中最小的部分
		int sum = 0;
		for (int i = 0; i < height.length; i++) {
			if(leftMax[i]>rightMax[i]){
				sum += rightMax[i];
			} else
				sum += leftMax[i];

		}
		//交集是雨水加柱子的总和
		System.out.println(sum);
		//只要减去柱子就是水的面积
		//柱子面积
		int barSum = 0;
		for (int i = 0; i < height.length; i++) {
			barSum += height[i];
		}
		System.out.println("柱子面积是"+barSum);
		System.out.println("雨水数量是"+(sum-barSum));

		}
	}
