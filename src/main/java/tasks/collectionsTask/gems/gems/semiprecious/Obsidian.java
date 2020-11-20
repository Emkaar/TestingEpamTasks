package tasks.collectionsTask.gems.gems.semiprecious;

import tasks.collectionsTask.gems.gemsSpecifications.PurityOfStone;

public class Obsidian extends SemipreciousGemStone {
    public Obsidian(String colour, double caratWeight, PurityOfStone purity) {
        super(colour, caratWeight, purity);
        setPriceForCarat(73_400);
        setPriceOfGemStone();
    }
}
