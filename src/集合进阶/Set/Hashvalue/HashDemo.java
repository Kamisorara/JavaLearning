package 集合进阶.Set.Hashvalue;

public class HashDemo {
    public static void main(String[] args) {
        //创建学生对象
        Students st = new Students("张三",10);
        System.out.println(st.hashCode());
        //在默认情况下hashCode是不同的，而通过重写hashCode可以实现hashCode相同

    }
}
