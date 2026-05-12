package 算法训练.ch06_大乐透;

//导包
import java.util.Random;
import java.util.Scanner;
/**
 * ClassName: 大乐透
 * Package: 算法训练.ch06_大乐透
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/5/5 - 17:32
 * @Version: v1.0
 *
 */
public class SuperLotto {
	public static void main(String[] args){
		/*彩票规则：
		前区：1~35选5个号码（唯一）
		后区：1~12选2个号码（唯一）
		跨区可重复

		中奖规则：
			一等奖：5 + 2
			二等奖：5 + 1
			三等奖：5 + 0 / 4 + 2
			四等奖：4 + 1 / 3 + 2
			五等奖：4 + 0 / 3 + 1 / 2 + 2
			六等奖：3 + 0 / 1 + 2 / 2 + 1 / 0 + 2
			*/
		//分三部分
		//1.彩票
		//前区
		int[] front = new int[5];
		//后区
		int[] back = new int[2];
		//调用方法去重 并打印
		front = lotteryTicketDeduplication(front,1,35);
		traverseTheArray(front);
		//换行
		System.out.println();
		back = lotteryTicketDeduplication(back,1,12);
		traverseTheArray(back);
		//换行
		System.out.println();
		//2.用户输入彩票号码
		//定义数组 7位
		int[] arr = new int[7];
		//调用方法 输入彩票号码上区
		arr = inputLotteryNumber(arr,35,0,4);
		traverseTheArray(arr);
		//调用方法 输入彩票号码下区
		arr = inputLotteryNumber(arr,12,5,6);
		traverseTheArray(arr);
		//3.调用方法中奖判断
		winningMethod(arr,front,back);
	}
	//判断是否有重复  重复输出false 不重复输出true  start~end 指定重复区间
	public static boolean deduplicationMethod(int[] arr ,int a,int start,int end){
		for(int i = start; i < end; i++){
			if(arr[i] == a){
				return false;
			}
		}
		return true;
	}
	//彩票去重方法
	public static int[] lotteryTicketDeduplication(int[] arr,int a,int b){
		Random rd = new Random();
		int[] newArr = new int[arr.length];
		//循环遍历添加数组元素(不重复)
		//定义变量存储添加的元素位置
		int i = 0,j = 0;
		while(i< arr.length){
			//生成随机数
			 int num = rd.nextInt(a,b);
			 //定义变量判断是否重复
			 boolean flag = true;
			flag = deduplicationMethod(newArr,num,0,i);
			 if(flag){ //只有不重复
				 //添加i 自加
				 newArr[i] = num;
				 i++;
			 }
		}

		return newArr;
	}
	//方法遍历数组
	public static void traverseTheArray(int[] arr){
		for (int i = 0; i < arr.length; i++) {
			System.out.print("["+arr[i]+"]");
		}
	}
	//用户输入方法
	//arr 被添加数组   a随机范围 默认从1开始  b c添加号码的范围
	public static int[] inputLotteryNumber(int[]  arr ,int a,int b,int c){
		Scanner sc = new Scanner(System.in);
		//分为两部分
		int i = b;
		do{
			System.out.println("请输入第"+(i+1)+"位号码");
			int d = sc.nextInt();
			//注意为了方便阅读 优先判断异常数据 在处理合规数据
			if(d<1||d>a){
				System.out.println("输入的号码有误，请重新输入 范围限制为1~"+a+"的"+(b+1)+"个号码");
				continue;
			}
			Boolean flag =deduplicationMethod(arr,d,b,c);
			if(!flag){
				System.out.println("输入的号码有重复，请重新输入 范围限制为1~"+a+"的"+(c+1)+"个号码");
				continue;
			}
			arr[i] = d;
			i++;
			/*if(d>=1&&d<=a){
				Boolean flag =deduplicationMethod(arr,d,b,c);
				if(flag){
					arr[i] = d;
					i++;
				}else {
					System.out.println("输入的号码有重复，请重新输入 范围限制为1~"+a+"的"+(c+1)+"个号码");
				}
			}else {
				System.out.println("输入的号码有误，请重新输入 范围限制为1~"+a+"的"+(b+1)+"个号码");
			}*/
		}while(i<=c);
		//返回
		return arr;
	}

	//中奖判断方法
	public static void winningMethod(int[] arr,int[] arr1,int[] arr2){
		//调用判断两个数组重复次数 方法
		int count1 = judgeRepetition(arr,arr1,0,5);
		System.out.println("前区重复次数为："+count1);
		int count2 = judgeRepetition(arr,arr2,5,7);
		System.out.println("后区重复次数为："+count2);
		//开始判断
		if(count1 == 5 && count2 == 2){
			System.out.println("恭喜，中奖了一等奖");
		}else if(count1 == 5 && count2 == 1){
			System.out.println("恭喜，中奖了二等奖");
		} else if ((count1 ==5 && count2 == 0)||(count1 == 4 && count2==2) ) {
			System.out.println("恭喜，中奖了三等奖");
		} else if((count1 == 4 && count2 == 1)||(count1 == 3 && count2 == 2)){
			System.out.println("恭喜，中奖了四等奖");
		} else if((count1 == 4 && count2 == 0)||(count1 == 3 && count2 == 1)||(count1 == 2 && count2 == 2)){
			System.out.println("恭喜，中奖了五等奖");
		} else if((count1 == 3 && count2 == 0)||(count1 == 1 && count2 == 2)||(count1 == 2 && count2 == 1)||(count1 == 0 && count2 == 2)){
			System.out.println("恭喜，中奖了六等奖");
		}
		}

	//判断两个数组重复次数
	//arr1 数组1  arr2 数组2  start~end 区间
	public static int judgeRepetition(int[] arr1,int[] arr2,int start,int end){
		int count = 0, j = 0;
		/*for (int i = start; i < end; i++){
			*//*//位置和数据相同就加一
			if(arr1[i] == arr2[j]){
				count++;
			}
			j++
			*//*
			//这个是只要有数据相同就加1,无论位置如何
			for(j=0;j< arr2.length;j++){
				if(arr1[i] == arr2[j]){
					count++;
				}
			}
		}*/
		//定义变量
		boolean flat;
			for(j=0;j< arr2.length;j++){
				flat = deduplicationMethod(arr1,arr2[j],start,end);
				if (!flat){
					count++;
				}
			}

		return count;
	}
	}


