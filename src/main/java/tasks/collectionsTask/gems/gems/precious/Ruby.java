package tasks.collectionsTask.gems.gems.precious;

import tasks.collectionsTask.gems.gemsSpecifications.GemQuality;
import tasks.collectionsTask.gems.gemsSpecifications.PurityOfStone;

public class Ruby extends PreciousGemStone {
    public Ruby(String colour, double caratWeight, PurityOfStone purity) {
        super(colour, caratWeight, purity);
        setGemQuality(GemQuality.PRECIOUS_STONE);
        setPriceForCarat(420_000);
        setPriceOfGemStone();
    }
}
