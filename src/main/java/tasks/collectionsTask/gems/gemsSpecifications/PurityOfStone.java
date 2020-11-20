package tasks.collectionsTask.gems.gemsSpecifications;

public enum PurityOfStone {
    FL(3),
    IF(2),
    VVS1(1.8),
    VVS2(1.6),
    VS1(1.4),
    VS2(1.2),
    SI1(1),
    SI2(0.9),
    L1(0.7),
    L2(0.5),
    L3(0.3);

    private final double purityCoefficient;

    PurityOfStone(double purityCoefficient) {
        this.purityCoefficient = purityCoefficient;
    }

    public double getPurityCoefficient(){
        return purityCoefficient;
    }

}
