package tasks.collectionsTask.gems.gems.semiprecious;

import tasks.collectionsTask.gems.gemsSpecifications.PurityOfStone;

public class MoonStone extends SemipreciousGemStone {
    public MoonStone(String colour, double caratWeight, PurityOfStone purity) {
        super(colour, caratWeight, purity);
        setPriceForCarat(130_500);
        setPriceOfGemStone();
    }
}
