package abstractclassplayer;

public class CrossfitPlayer extends Player {
    @Override
    public void warmUp() {
        System.out.println("Do crossfit warmup as player!");
    }

    @Override
    public void train() {
        System.out.println("Do crossfit training as player!");
    }

    @Override
    public void recover() {

        System.out.println("Do crossfit recovery as player!");
    }
}
