package tasks.collectionsTask.gems.gems.semiprecious;

import tasks.collectionsTask.gems.gemsSpecifications.PurityOfStone;

public class Opal extends SemipreciousGemStone {
    public Opal(String colour, double caratWeight, PurityOfStone purity) {
        super(colour, caratWeight, purity);
        setPriceForCarat(130_000);
        setPriceOfGemStone();
    }
}
