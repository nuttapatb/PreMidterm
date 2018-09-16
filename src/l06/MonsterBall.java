package l06;


public class MonsterBall {

    public String[] monsterBall = new String[4];

    public MonsterBall(String type, String price, String sellFor, String ballValue) {
        this.monsterBall[0] = type;
        this.monsterBall[1] = price;
        this.monsterBall[2] = sellFor;
        this.monsterBall[3] = ballValue;
    }

    public void showBall() {
        System.out.println("MonsterBall{type='" + monsterBall[0] + "', price=" + monsterBall[1] + ", sellFor=" + monsterBall[2] + ", ballValue=" + monsterBall[3] + "}");
    }


}

