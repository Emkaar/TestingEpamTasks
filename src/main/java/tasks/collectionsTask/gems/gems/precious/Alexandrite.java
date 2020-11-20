package tasks.collectionsTask.gems.gems.precious;

import tasks.collectionsTask.gems.gemsSpecifications.PurityOfStone;

public class Alexandrite extends PreciousGemStone {

    public Alexandrite(String colour, double caratWeight, PurityOfStone purity) {
        super(colour, caratWeight, purity);
        setPriceForCarat(490_00);
        setPriceOfGemStone();
    }
}
