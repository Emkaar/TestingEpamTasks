package tasks.collectionsTask.gems.gems.precious;

import tasks.collectionsTask.gems.gemsSpecifications.PurityOfStone;

public class Сhrysoberyl extends PreciousGemStone {
    public Сhrysoberyl(String colour, double caratWeight, PurityOfStone purity) {
        super(colour, caratWeight, purity);
        setPriceForCarat(280_000);
        setPriceOfGemStone();
    }
}
