package arithmetic_pratice;

public class test_1 {
    public static void main(String[] args) {

        pratice_1 pt = new pratice_1();
        String licensePlate = "1s3 PSt";
        String[] words = {"step", "steps", "stripe", "stepple"};
        String result = pt.shortestCompletingWord(licensePlate, words);
        System.out.println(result);



    }
}
