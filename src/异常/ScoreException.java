package 异常;

public class ScoreException extends Exception {


    /*
    格式
     自定义异常，加入Exception类，就能成为异常类的一员
    public class 异常类 extends Exception {
            无参构造
            带参构造
    }
     */
    public ScoreException() {
    }

    public ScoreException(String message) {
        super(message);
    }


}
