package Students_manager;


import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    public static void main(String[] args) {
        //通过入口进入主程序
        //首先是创建一个数组类
        ArrayList<Student> array = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        //写程序的主入口
        boolean flag = true;
        while (flag == true) {
            System.out.println("--------------------欢迎来学生管理系统--------------------");
            System.out.println("1.添加学生");
            System.out.println("2.删除学生");
            System.out.println("3.修改学生");
            System.out.println("4.查看所有学生");
            System.out.println("5.退出");
            System.out.println("请输入你的选择:");
            String choice1 = sc.nextLine();
            //这里的 if语句 可以换做switch 语句 来代替
//            if (choice1.equals("1")) {
//                addStudent(array);
//            } else if (choice1.equals("2")) {
//                deleteStudent(array);
//            } else if (choice1.equals("3")) {
//                updateStudent(array);
//            } else if (choice1.equals("4")) {
//                findAllStudents(array);
//            } else if (choice1.equals("5")) {
//                break;
//            }
            switch (choice1) {
                case "1":
                    addStudent(array);
                    break;
                case "2":
                    deleteStudent(array);
                    break;
                case "3":
                    updateStudent(array);
                    break;
                case "4":
                    findAllStudents(array);
                    break;
                case "5":
                    System.out.println("退出程序！");
                    break;

            }
        }
        System.out.println("程序结束");


    }

    //定义方法
    //1.添加学生信息
    public static void addStudent(ArrayList<Student> array) {
        Scanner sc2 = new Scanner(System.in);
        System.out.println("请输入添加学生的学号:");   //思考一个问题，姓名是可以相同的,但是学号是不可以相同的
        String input2 = sc2.nextLine();
        //首先遍历一次数组，前提是数组不为空，并且没有相同的sid再进行下一步
        for (int n = 0; n < array.size(); n++) {
            Student s = array.get(n);
            if (s.getSid().equals(input2)) {
                System.out.println("已存在相同学生id，请使用不同的id");
                //如果已存在相同的，就再调用次自己
                addStudent(array);
            }
        }
        System.out.println("请输入添加学生姓名:");
        String input1 = sc2.nextLine();
        System.out.println("请输入添加学生的家庭住址:");
        String input3 = sc2.nextLine();
        System.out.println("请输入添加学生的年龄:");
        String input4 = sc2.nextLine();
        //创建学生对象
        Student st = new Student(input2, input1, input4, input3);
        array.add(st);
        System.out.println("添加成功!");
    }

    //2.查看学生信息
    public static void findAllStudents(ArrayList<Student> array) {
        if (array.size() == 0) {
            System.out.println("数据为空，请添加数据！");
        } else {
            System.out.println("学生姓名" + "\t\t\t\t学生学号" + "\t\t\t\t学生住址" + "\t\t\t\t学生年龄");
            for (int i = 0; i < array.size(); i++) {
                Student s = array.get(i);
                System.out.println(s.getName() + "\t\t\t\t\t" + s.getSid() + "\t\t\t\t\t" + s.getAddress() + "\t\t\t\t\t" + s.getAge());
            }
        }

    }

    //3.删除学生信息
    public static void deleteStudent(ArrayList<Student> array) {
        if (array.size() == 0) {
            System.out.println("数据为空，请添加数据!");

        } else {
            Scanner sc = new Scanner(System.in);
            //要删除学生信息就要首先遍历整个集合数组
            System.out.println("请输入你要修改的学生的学号");
            String sid = sc.nextLine();
            //遍历学生数组集合
            for (int j = 0; j < array.size(); j++) {
                Student s = array.get(j);
                if (s.getSid().equals(sid)) {
                    array.remove(j);
                }
            }
            System.out.println("操作成功!");
        }

    }

    //4.修改学生信息
    public static void updateStudent(ArrayList<Student> array) {
        if (array.size() == 0) {
            System.out.println("数据为空，请重新添加数据!");
        } else {
            //修改信息和删除的其实差不多
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入要删除学生的学号:");
            String sid = sc.nextLine();
            for (int k = 0; k < array.size(); k++) {
                Student s = array.get(k);
                if (s.getSid().equals(sid)) {
                    //找到了要修改的sid后 使用set() 返回
                    System.out.println("是否修改学号:(输入1 or -1)");
                    String choice2 = sc.nextLine();
                    if (choice2.equals('1')) {
                        System.out.println("请输入新的学号:");
                        String newSid = sc.nextLine();
                        System.out.println("请输入修改学生姓名:");
                        String inputName = sc.nextLine();
                        System.out.println("请输入修改学生的家庭住址:");
                        String inputAdress = sc.nextLine();
                        System.out.println("请输入修改学生的年龄:");
                        String inputAge = sc.nextLine();
                        //创建一个新的学生对象
                        Student st2 = new Student(inputName, newSid, inputAdress, inputAge);
                        array.set(k, st2);
                    } else {
                        String newSid = s.getSid();
                        System.out.println("请输入修改学生姓名:");
                        String inputName = sc.nextLine();
                        System.out.println("请输入修改学生的家庭住址:");
                        String inputAdress = sc.nextLine();
                        System.out.println("请输入修改学生的年龄:");
                        String inputAge = sc.nextLine();
                        //创建一个新的学生对象
                        Student st2 = new Student(inputName, newSid, inputAdress, inputAge);
                        array.set(k, st2);
                    }
                }
            }
            System.out.println("操作成功!");
        }
    }
}
