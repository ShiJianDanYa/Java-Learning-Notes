package 专题综合练习.面向对象.案例03学生;

import 课堂代码.面向对象.构造方法02.Student;

/**
 * ClassName: Test3
 * Package: 专题综合练习.面向对象.案例03学生
 * Description:
 *
 * @Author 锏箪
 * @Create 2025/4/914:23
 * @Version1.0
 */
    
    /*
    要求3：通过id删除学生信息如果存在，则删除，如果不存在，则提示删除失败。
    要求4：删除完毕之后，遍历所有学生信息。
    要求5：查询数组id为"heima002"的学生，如果存在，则将他的年龄+1岁
*/
public class Test3 {
    public static void main(String[] args) {
        //1.创建一个数组用来存储学生对象
        pupil[]arr= new pupil[3];
        //2.创建学生对象并添加到数组当中
        pupil stu1 = new pupil(1,"张三", 18 );
        pupil stu2 = new pupil(2,"李四", 19 );
        pupil stu3 = new pupil(3,"王五", 20);
        //3.把学生对象添加到数组当中
        arr[0] = stu1;
        arr[1] = stu2;
        arr[2] = stu3;
        //删除对应数组
        //先找到,id对应数组元素
        int index = getIndex(arr,1);
        System.out.println(index);
        //开始判断
        if(index>=0){
            //直接变为null
            arr[index]=null;
            System.out.println("删除成功");
        }else{
            System.out.println("当前id不存在,删除失败");
        }
        //遍历数组
        printArr(arr);
        //要求5：查询数组id为"heima002"的学生，如果存在，则将他的年龄+1岁
        int index2 = getIndex(arr,2);
        //判断索引
        if(index2>=0){
            //直接修改
            arr[index2].setAge(arr[index2].getAge()+1);
            System.out.println("修改成功");
        }else{
            System.out.println("当前id不存在,修改失败");
        }
        //遍历数组
        printArr(arr);
        System.out.println("程序结束");
    }

    //找到id在数组中的索引
    public static int getIndex(pupil[]arr,int id){
        for(int i=0;i<arr.length;i++)
        {
            //防止报错非空判断
            if(arr[i]!=null){
                if(arr[i].getId()==id){
                    return i;
                }

            }

        }
        return -1;
    }
    //遍历数组
    public static void printArr(pupil[]arr){
        for (int i = 0; i < arr.length; i++) {
            pupil pupil = arr[i];
            if (pupil != null) {
                System.out.println(pupil.getId() + "," + pupil.getName() + "," + pupil.getAge());
            }
        }
    }

}
