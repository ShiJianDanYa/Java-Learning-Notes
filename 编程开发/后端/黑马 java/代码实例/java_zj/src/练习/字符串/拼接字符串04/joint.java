package 练习.字符串.拼接字符串04;

/**
 * ClassName: joint
 * Package: 练习.字符串.拼接字符串04
 * Description:
 *
 * @Author 锏箪
 * @Create 2025/4/1117:30
 * @Version1.0
 */
    
    /*
    需求如下
    定义一个方法，把int数组中的数据按照指定的格式拼接成一个字符串返回，
    调用该方法，并在控制台输出结果。
    例如：
    数组为 int[] arr = {1,2,3};
    执行方法后的输出结果为：[1，2，3]

*/
public class joint {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        //String s = new String(arr);
        String s = joint(arr);
        System.out.println(s);



        System.out.println("程序结束");
    }
    //开始编拼接
        public static String joint(int[] arr){
        //健壮性建设
            if(arr == null){
                return "数组指向为空";
            }
            if(arr.length == 0){
                return "数组元素为空";
            }
            String s = "[";
            for (int i = 0; i < arr.length; i++) {
                if(i < arr.length-1){
                    s = s +arr[i]+",";
                }else if(i==arr.length-1){
                    s = s + arr[i] +"]";
                }
            }
            return s;
        }
}
