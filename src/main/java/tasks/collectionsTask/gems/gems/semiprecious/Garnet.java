package tasks.collectionsTask.gems.gems.semiprecious;

import tasks.collectionsTask.gems.gemsSpecifications.PurityOfStone;

public class Garnet extends SemipreciousGemStone {

    public Garnet(String colour, double caratWeight, PurityOfStone purity) {
        super(colour, caratWeight, purity);
        setPriceForCarat(93_800);
        setPriceOfGemStone();
    }
}
