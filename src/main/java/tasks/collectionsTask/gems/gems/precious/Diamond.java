package tasks.collectionsTask.gems.gems.precious;

import tasks.collectionsTask.gems.gemsSpecifications.PurityOfStone;

public class Diamond extends PreciousGemStone {

    public Diamond(String colour, double caratWeight, PurityOfStone purity) {
        super(colour, caratWeight, purity);
        setPriceForCarat(617_590);
        setPriceOfGemStone();
    }
}
