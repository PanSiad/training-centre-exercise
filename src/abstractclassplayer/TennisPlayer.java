package abstractclassplayer;

public class TennisPlayer extends Player {
    @Override
    public void warmUp() {
        System.out.println("Do tennis warmup as player!");
    }

    @Override
    public void train() {
        System.out.println("Do tennis training as player!");
    }

    @Override
    public void recover() {
        System.out.println("Do tennis recovery as player!");
    }
}
