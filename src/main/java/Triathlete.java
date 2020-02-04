public class Triathlete extends Athlete implements ICanDoTriathlon  {

    public void run(int distance) {
        this.distanceTravelled += distance;
    }

    public void swim(int distance) {
        this.distanceTravelled += distance;
    }

    public void cycle(int distance) {
        this.distanceTravelled += distance;
    }
}
