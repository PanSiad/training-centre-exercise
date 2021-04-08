package interfacetypecoach;

public class TennisCoach implements Coach {
    @Override
    public void warmUp() {
        System.out.println("Do tennis warmup as coach!");
    }

    @Override
    public void train() {
        System.out.println("Do tennis training as coach!");
    }

    @Override
    public void recover() {
        System.out.println("Do tennis recovery as coach!");
    }
}
