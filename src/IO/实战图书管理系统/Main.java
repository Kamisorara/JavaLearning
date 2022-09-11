package IO.实战图书管理系统;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Book> LIST = new ArrayList<>(); //创建列表存储图书


    public static void main(String[] args) {
        menu();
    }

    @SuppressWarnings("uncheaked")
    private static void readData() {
        File file = new File("D:\\Code Learning\\JavaSE\\src\\IO\\实战图书管理系统\\data");
        if (!file.exists()) {
            LIST = new ArrayList<>();
        } else {
            try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("D:\\Code Learning\\JavaSE\\src\\IO\\实战图书管理系统\\data"))) {
                LIST = (List<Book>) inputStream.readObject(); //需要一个强制类型转换(List<Book>)
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

    private static void savaData() {
        //使用对象流存储
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("D:\\Code Learning\\JavaSE\\src\\IO\\实战图书管理系统\\data"))) {
            outputStream.writeObject(LIST);
            outputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //设计主界面
    private static void menu() {
        readData();
        Scanner sc = new Scanner(System.in);
        System.out.println("====== 图书管理系统 ======");
        System.out.println("1.插入信息");
        System.out.println("2.修改信息");
        System.out.println("3.查询图书列表");
        System.out.println("4.删除图书");
        System.out.println("...按其他任意键退出系统");
        String str = sc.nextLine();
        switch (str) {
            case "1":
                insertBook(sc);
                break;
            case "2":
                modifyBook(sc);
            case "3":
                showBooks();
            case "4":
                deleteBook(sc);
            default:
                savaData();
                sc.close();
                break;
        }
    }


    //1.插入信息
    private static void insertBook(Scanner scanner) {
        System.out.println("请依次输入图书图书名，作者名，价格");
        Book book = new Book().name(scanner.nextLine()).author(scanner.nextLine()).price(scanner.nextDouble());
        LIST.add(book);
        menu();

    }

    //2.修改信息
    private static void modifyBook(Scanner scanner) {
        int i = 0;  //给书一个编号
        for (Book book : LIST) {
            System.out.println(i + "." + book.toString());
        }
        int index = scanner.nextInt();
        if (index > LIST.size()) {
            System.out.println("错误的编号!");
        } else {
            LIST
                    .get(index)
                    .name(scanner.nextLine())
                    .author(scanner.nextLine())
                    .price(scanner.nextDouble());
        }
        menu();
    }

    //3.查询图书列表
    private static void showBooks() {
        LIST.forEach(System.out::println);  //由于println会调用toString 方法所以推荐重写同String方法
    }

    //4.删除图书
    private static void deleteBook(Scanner scanner) {
        int i = 0;  //给书一个编号
        for (Book book : LIST) {
            System.out.println(i + "->" + book.toString());
        }
        System.out.println("请输入你要删除的图书的编号:");
        int index = scanner.nextInt();
        if (index > LIST.size()) {
            System.out.println("错误的编号！");
        } else {
            LIST.remove(i);
            System.out.println("删除成功!");
        }
        menu();
    }

    //图书类
    private static class Book {
        String name;
        String author;
        double price;

        @Override
        public String toString() {  //重写这里的toString 方法
            return "书籍{" + "名称='" + name + '\'' + ", 作者='" + author + '\'' + ", 价格=" + price + '}';
        }

        //链式调用
        public Book name(String name) {
            this.name = name;
            return this;
        }

        public Book author(String author) {
            this.author = author;
            return this;
        }

        public Book price(double price) {
            this.price = price;
            return this;
        }

    }
}
