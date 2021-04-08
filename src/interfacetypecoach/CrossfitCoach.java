package interfacetypecoach;

public class CrossfitCoach implements Coach {
    @Override
    public void warmUp() {
        System.out.println("Do crossfit warmup as coach!");
    }

    @Override
    public void train() {
        System.out.println("Do crossfit training as coach!");
    }

    @Override
    public void recover() {
        System.out.println("Do crossfit recovery as coach!");
    }
}
