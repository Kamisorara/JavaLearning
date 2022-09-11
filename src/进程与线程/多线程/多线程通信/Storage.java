package 进程与线程.多线程.多线程通信;

public class Storage {
    //数据存储数组
    private int[] cells = new int[10];
    //inPos 代表存入时候数组的下标,outPos表示取出数组的下标
    private int inPos, outPos;

    public void put(int num) {
        cells[inPos] = num;
        System.out.println("在cells[" + inPos + "]中放入数据---" + cells[inPos]);
        inPos++;
        if (inPos == cells.length) inPos = 0; //当inPos为数组长度时将其置为0
    }

    public void get() {
        int data = cells[outPos];
        System.out.println("从cells[" + outPos + "]中取出数据" + data);
        outPos++;
        if (outPos == cells.length) outPos = 0;
    }

    //针对数组元素的存取操作都是从都是从第一个元素开始依次进行的，每当操作完数组的最后一个元素，索引会被置零从数组的第一个位置开始存取操作

}
