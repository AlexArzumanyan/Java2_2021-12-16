package homework1.obstacle;

import homework1.SomeboDy.Somebody;

public class Track implements Obstacle {

    private final int distanse;

    public Track(int distanse) {
        this.distanse = distanse;
    }

    @Override
    public boolean passObstacleBy(Somebody somebody) {
        if (somebody.jumpHeight() >= this.distanse) {
            System.out.printf("Участник %s успешно пробежал дистанцию %d%n", somebody, this.distanse);
            return true;
        } else {
            System.out.printf("Участник %s не смог пробежать дистанцию %d%n", somebody, this.distanse);
        return false;
        }
    }
}

