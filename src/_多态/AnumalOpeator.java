package _多态;


public class AnumalOpeator {
//    public void useAnimal(Cat c){  //实际就是创建对象，再调方法
//        c.eat();
//    }
//    public void userAnimal2(Dog d){
//        d.eat();
//    }
    //都继承自animal 类
    public void useAnimal(Animal  a ){
        a.eat();
    }
}
