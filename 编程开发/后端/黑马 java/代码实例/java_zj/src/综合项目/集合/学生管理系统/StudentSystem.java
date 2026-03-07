package 综合项目.集合.学生管理系统;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * ClassName: StudentSystem
 * Package: 综合项目.集合.学生管理系统
 * Description:
 *
 * @Author 锏箪
 * @Create 2025/4/1311:17
 * @Version1.0
 */
    
    /*
    需求如下
    1. 
    2.
    3. 
*/
public class StudentSystem {
    //常量
    private static final String ADD_STUDENR = "1";
    private static final String DELETE_STUDENR = "2";
    private static final String UPDATE_STUDENR = "3";
    private static final String QUERY_STUDENR = "4";
    private static final String EXIT_STUDENR = "5";


    public static void startStudentSystem() {
        //创建集合
        ArrayList<Student> students = new ArrayList<Student>();
        //欢迎界面
        loop:while (true) {
            System.out.println("-----------欢迎来到学生管理系统-----------");
            System.out.println("1 添加学生");
            System.out.println("2 删除学生");
            System.out.println("3 修改学生");
            System.out.println("4 查询学生");
            System.out.println("5 退出");
            System.out.println("请输入你的选择：");
            Scanner sc = new Scanner(System.in);
            String choice = sc.next();
            switch(choice){
                case ADD_STUDENR->addStudent(students);
                case DELETE_STUDENR->deleteStudent(students);
                case UPDATE_STUDENR->updateStudent(students);
                case QUERY_STUDENR->queryStudent(students);
                case EXIT_STUDENR->{
                    System.out.println("退出");
                    //break只能跳出单层循环 这时可以用标号
                    break loop;
                    //System.exit(0);//停止虚拟机运行
                }
                default -> System.out.println("输入的什么玩意");
            }
        }
    }

    //添加学生
    public static void addStudent(ArrayList<Student> students){
        Scanner sc = new Scanner(System.in);
        //创建学生对象
        Student student = new Student();
        int id = 0;
        while (true) {
            System.out.println("请输入学生id");
            id = sc.nextInt();
            //开始和集合对比是否重复
            if(loop(students,id)){
                System.out.println("id重复");

            }else{
                break;
            };
        }

        System.out.println("请输入学生姓名");
        String name = sc.next();
        System.out.println("请输入学生年龄");
        int phone = sc.nextInt();
        System.out.println("请输入学生家庭地址");
        String address = sc.next();
        //创建一个新学生对象
        Student xs = new Student();
        //添加属性
        xs.setId(id);
        xs.setName(name);
        xs.setPhone(phone);
        xs.setAddress(address);
        //学生对象添加到集合中
        students.add(xs);
        //提示
        System.out.println("学生信息添加成功");
    }
    //删除学生
    public static void deleteStudent(ArrayList<Student> students){
        System.out.println("请输入要删除的id");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        //判断是否存在
        if(loop(students,id)){
            //通过索引直接删除
            //找索引
            int sy = Look(students,id);
            //删除
            if(Del(students,sy)>0){
                System.out.println("删除成功");
            }else{
                System.out.println("删除失败");
            }
        }else{
            System.out.println("id不存在，你那头删⛰️");
        }
        //删除方法
    }
    //修改学生
    public static void updateStudent(ArrayList<Student> students){
        //先判断id是否存在
        System.out.println("输入需要修改的id");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        //判断id是否存在
        if(loop(students,id)){
            //id存在找到索引位置
            int sy = Look(students,id);
            System.out.println("请输入学生姓名");
            String name = sc.next();
            System.out.println("请输入学生年龄");
            int phone = sc.nextInt();
            System.out.println("请输入学生家庭地址");
            String address = sc.next();
            //创建一个新学生对象
            Student xs = new Student();
            //添加元素
            xs.setId(id);
            xs.setName(name);
            xs.setPhone(phone);
            xs.setAddress(address);

            //修改集合内容
            students.set(sy,xs);


        }else{
            System.out.println("id不存在啊朋友");
        }

    }
    //查询学生
    public static void queryStudent(ArrayList<Student> students){
        //集合中没有学生信息，返回无学生信息
        if(students.size()==0){
            System.out.println("当前学生不存在");
            return;
        }
        //有学生信息,打印全部学生信息
        //打印表头
        System.out.println("ID\t\t姓名\t\t年龄\t\t家庭住址");
        for(int i=0; i<students.size(); i++){
            System.out.println(students.get(i).getId()+"\t\t"+students.get(i).getName()
                    +"\t\t"+students.get(i).getPhone()+"\t\t"+students.get(i).getAddress());
        }
    }
    //方法判断id在集合中是否唯一
    public static boolean loop(ArrayList<Student> students,int id){
        for(int i=0; i<students.size(); i++){
            if(students.get(i).getId()==id){
                return true;
            }
        }
        return false;
    }
    //找索引方法
    public static int Look(ArrayList<Student>students,int id){
            for(int i=0; i<students.size(); i++){
                if(students.get(i).getId()==id){
                    return i;
                }
            }
            return -1;
    }
    //删除方法
    public static int Del(ArrayList<Student> students,int sy ){
        students.remove(sy);
        return 1;
    }
}
