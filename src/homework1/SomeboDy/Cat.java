package homework1.SomeboDy;

public class Cat implements Somebody {
    private final String name;
    private final int jumpHeight;
    private final int runRange;

    public Cat(String name, int jumpHeight, int runRange) {
        this.name = name;
        this.jumpHeight = jumpHeight;
        this.runRange = runRange;
    }

    @Override
    public int runRange() {
        System.out.printf("Cat %s способен прыгнуть %d%n", this.name, this.runRange);
        return this.runRange;
    }

    @Override
    public int jumpHeight() {
        System.out.printf("Cat %s способен прыгнуть %d%n", this.name, this.jumpHeight);
        return this.jumpHeight;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", jumpHeight=" + jumpHeight +
                ", runRange=" + runRange +
                '}';
    }
}
