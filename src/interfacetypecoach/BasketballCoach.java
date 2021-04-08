package interfacetypecoach;

public class BasketballCoach implements Coach {
    @Override
    public void warmUp() {
        System.out.println("Do basketball warmup as coach!");
    }

    @Override
    public void train() {
        System.out.println("Do basketball training as coach!");
    }

    @Override
    public void recover() {
        System.out.println("Do basketball recovery as coach!");
    }
}
