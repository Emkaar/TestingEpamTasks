package tasks.collectionsTask.gems.gems.precious;

import tasks.collectionsTask.gems.gems.GemStone;
import tasks.collectionsTask.gems.gemsSpecifications.GemQuality;
import tasks.collectionsTask.gems.gemsSpecifications.PurityOfStone;

public abstract class PreciousGemStone extends GemStone {
    public PreciousGemStone(String colour, double caratWeight, PurityOfStone purity) {
        super(colour, caratWeight, purity);
        setGemQuality(GemQuality.PRECIOUS_STONE);
    }
}
