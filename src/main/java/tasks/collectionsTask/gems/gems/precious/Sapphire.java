package tasks.collectionsTask.gems.gems.precious;

import tasks.collectionsTask.gems.gemsSpecifications.PurityOfStone;

public class Sapphire extends PreciousGemStone {
    public Sapphire(String colour, double caratWeight, PurityOfStone purity) {
        super(colour, caratWeight, purity);
        setPriceForCarat(610_000);
        setPriceOfGemStone();
    }
}
