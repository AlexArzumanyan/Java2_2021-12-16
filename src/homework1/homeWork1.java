package homework1;

import homework1.SomeboDy.Cat;
import homework1.SomeboDy.Human;
import homework1.SomeboDy.Robot;
import homework1.SomeboDy.Somebody;
import homework1.obstacle.Obstacle;
import homework1.obstacle.Track;
import homework1.obstacle.Wall;

import java.util.List;
import java.util.Random;

public class homeWork1 {
    public static void main(String[] args) {
        System.out.println("Подготовленный этап");
        Competition competition = createAndPrepareCompetition();
        System.out.println("Начинаем соревнования");
        competition.startCompetition();
        List<Somebody> lastWinners = competition.getLastWinners();
        if(!lastWinners.isEmpty()) {
            System.out.println("Победители: ");
            for (Somebody lastWinner : lastWinners) {
                System.out.println(lastWinner);
            }
        } else {
            System.out.println("Никто не смог преодолеть дистанцию");
        }
    }

    private static Competition createAndPrepareCompetition() {
        Somebody person = new Human("Олег", 2, 300);
        Somebody cat = new Cat("Маркиз", 5, 50);
        Somebody robot = new Robot("r2d2", 15, 500);

        Random random = new Random();
        Obstacle wall = new Wall(random.nextInt(20));
        Obstacle track = new Track(random.nextInt(350));

        Competition competition = new Competition("Олимпийский забег");
        competition.setObstacles(wall, track);
        competition.setSomebodies(person, cat,robot);
        return competition;
    }
}
