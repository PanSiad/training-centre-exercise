package interfacetypecoach;

public class FootballCoach implements Coach {
    @Override
    public void warmUp() {
        System.out.println("Do football warmup as coach!");
    }

    @Override
    public void train() {
        System.out.println("Do football training as coach!");
    }

    @Override
    public void recover() {
        System.out.println("Do football recovery as coach!");
    }
}
