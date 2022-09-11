package 枚举类;

public enum Status {
    RUNNING("跑步"), SLEEP("睡觉"), STUDY("学习");
    private final String name;

    Status(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
