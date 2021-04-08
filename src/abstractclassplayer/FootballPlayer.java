package abstractclassplayer;

public class FootballPlayer extends Player {
    @Override
    public void warmUp() {
        System.out.println("Do football warmup as player!");
    }

    @Override
    public void train() {
        System.out.println("Do football training as player!");
    }

    @Override
    public void recover() {
        System.out.println("Do football recovery as player!");
    }
}
