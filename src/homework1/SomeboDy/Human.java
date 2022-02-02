package homework1.SomeboDy;

public class Human implements Somebody {
    private final String name;
    private final int jumpHeight;
    private final int runRange;

    public Human(String name, int jumpHeight, int runRange) {
        this.name = name;
        this.jumpHeight = jumpHeight;
        this.runRange = runRange;
    }

    @Override
    public int runRange() {
        System.out.printf("Human %s способен прыгнуть %d%n", this.name, this.runRange);
        return this.runRange;
    }

    @Override
    public int jumpHeight() {
        System.out.printf("Human %s способен прыгнуть %d%n", this.name, this.jumpHeight);
        return this.jumpHeight;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", jumpHeight=" + jumpHeight +
                ", runRange=" + runRange +
                '}';
    }
}

