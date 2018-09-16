package l06;

public class Main {
    public static void main(String[] args) {
        MonsterBall ball1 = new MonsterBall("Poke Ball","200.0", "100.0", "1.0");
        MonsterBall ball2 = new MonsterBall("Great Ball", "600.0", "300.0", "1.5");
        MonsterBall ball3 = new MonsterBall("Ultra Ball", "1200.0", "600.0", "2.0");
        MonsterBall ball4 = new MonsterBall("Drive Ball", "1000.0", "500.0", "3.5");

        ball1.showBall();
        ball2.showBall();
        ball3.showBall();
        ball4.showBall();
    }
}
