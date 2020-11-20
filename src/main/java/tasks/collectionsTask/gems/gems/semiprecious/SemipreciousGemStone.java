package tasks.collectionsTask.gems.gems.semiprecious;

import tasks.collectionsTask.gems.gems.GemStone;
import tasks.collectionsTask.gems.gemsSpecifications.GemQuality;
import tasks.collectionsTask.gems.gemsSpecifications.PurityOfStone;

public abstract class SemipreciousGemStone extends GemStone {
    public SemipreciousGemStone(String colour, double caratWeight, PurityOfStone purity) {
        super(colour, caratWeight, purity);
        setGemQuality(GemQuality.SEMIPRECIOUS_STONE);
    }
}
