package tasks.collectionsTask.gems.gems.semiprecious;

import tasks.collectionsTask.gems.gemsSpecifications.PurityOfStone;

public class Amethyst extends SemipreciousGemStone {
    public Amethyst(String colour, double caratWeight, PurityOfStone purity) {
        super(colour, caratWeight, purity);
        setPriceForCarat(180_000);
        setPriceOfGemStone();
    }
}
