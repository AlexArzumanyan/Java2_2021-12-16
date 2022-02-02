package homework1.obstacle;

import homework1.SomeboDy.Somebody;

public class Wall implements Obstacle{
    private final int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public boolean passObstacleBy(Somebody somebody) {
       if (somebody.runRange() >=this.height) {
        System.out.printf("Участник %s успешно перепрыгнул через стену с высотой %d%n", somebody, this.height);
        return true;
    } else {
        System.out.printf("Участник %s не смог перепрыгнуть через стену с высотой %d%n", somebody, this.height);
   return false;
    }
}
}