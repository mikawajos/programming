package testScripts.InheritanceCars;

public class Cars {

    private int speed;

    public Cars(int speed) {
        speed = this.speed;
        System.out.println("::Constructor run::");
    }

    public void increaseSpeed() {
        speed++;
        System.out.println("speed increased to: " + speed);
    }

    public void decreaseSpeed() {
        speed--;
        System.out.println("speed descreased to: " + speed);
    }
}
