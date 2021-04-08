package abstractclassplayer;

public class BasketballPlayer extends Player {
    @Override
    public void warmUp() {
        System.out.println("Do basketball warmup as player!");
    }

    @Override
    public void train() {
        System.out.println("Do basketball training as player!");
    }

    @Override
    public void recover() {
        System.out.println("Do basketball recovery as player!");
    }
}
