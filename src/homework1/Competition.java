package homework1;

import homework1.SomeboDy.Cat;
import homework1.SomeboDy.Somebody;
import homework1.obstacle.Obstacle;

import java.util.ArrayList;
import java.util.List;

public class Competition {

    private Obstacle[] obstacles;
    private Somebody[] somebodies;

    private final String competitionTitle;

    private final List<Somebody> lastWinners = new ArrayList<>();

    public Competition(String competitionTitle) {
        this.competitionTitle = competitionTitle;
    }

    public void setObstacles(Obstacle... obstacles) {
        this.obstacles = obstacles;
    }
    public void setSomebodies(Somebody ...somebodies) {
        this.somebodies = somebodies;
    }

    public List<Somebody> getLastWinners() {
        return lastWinners;

    }

    public void startCompetition() {
        System.out.printf("Начало соревнования %s%n", this.competitionTitle);
        this.lastWinners.clear();
        for (Somebody somebody : this.somebodies) {
boolean success = this.passAllObstacles(somebody);
if (!success) {
    System.out.printf("Участник %s покинул соревнования %%n", somebody);
} else {
    this.lastWinners.add(somebody);
}
        }
    }

    private boolean passAllObstacles(Somebody somebody) {
        for (Obstacle obstacle : this.obstacles) {
            if (!obstacle.passObstacleBy(somebody)) {
                return false;
            }

        }
        return true;
    }
}


