package 异常;

public class Exception_demo {
    public void checkScore(int score) throws ScoreException {
        if (score < 0 || score > 100) {
            throw new ScoreException("你给出的分数有误，分数的区间应该在1-100之间"); //Java自带的就不用手动抛出异常
        } else {
            System.out.println("分数正常");
        }
    }
}

/*
throws和throw的区别


throws
用在方法声明后面，跟的是异常类名表示抛出异常，由该方法的调用者来处理
表示出现异常的一种可能性，并不一定会发生这些异常


throw
用在方法体内，跟的是异常对象名表示抛出异常，由方法体内的语句处理




 */
