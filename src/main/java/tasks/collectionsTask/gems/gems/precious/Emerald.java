package tasks.collectionsTask.gems.gems.precious;

import tasks.collectionsTask.gems.gemsSpecifications.PurityOfStone;

public class Emerald extends PreciousGemStone {
    public Emerald(String colour, double caratWeight, PurityOfStone purity) {
        super(colour, caratWeight, purity);
        setPriceForCarat(570_000);
        setPriceOfGemStone();
    }
}
