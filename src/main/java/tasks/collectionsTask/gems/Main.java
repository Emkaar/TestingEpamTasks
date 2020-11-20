package tasks.collectionsTask.gems;

import tasks.collectionsTask.gems.gems.GemStone;
import tasks.collectionsTask.gems.gems.precious.Alexandrite;
import tasks.collectionsTask.gems.gems.precious.Diamond;
import tasks.collectionsTask.gems.gems.semiprecious.MoonStone;
import tasks.collectionsTask.gems.gems.semiprecious.Topaz;
import tasks.collectionsTask.gems.gemsSpecifications.PurityOfStone;

public class Main {

    public static void main(String[] args) {
        GemStone diamond = new Diamond("white", 0.2, PurityOfStone.SI1);
        GemStone alexandrite = new Alexandrite("rainbow", 0.32, PurityOfStone.FL);
        GemStone moonStone1 = new MoonStone("white-yellow", 1.12, PurityOfStone.VS2);
        GemStone moonStone2 = new MoonStone("white-yellow", 1.13, PurityOfStone.VS1);
        GemStone topaz = new Topaz("blue", 0.46, PurityOfStone.VVS1);
        Necklace necklace = new Necklace();
        necklace.addGemStoneToNecklace(diamond);
        necklace.addGemStoneToNecklace(alexandrite);
        necklace.addGemStoneToNecklace(moonStone1);
        necklace.addGemStoneToNecklace(moonStone2);
        necklace.addGemStoneToNecklace(topaz);
        System.out.println(topaz);
        System.out.println(necklace.findGemsInNecklaceWithSpecifiedPurity(PurityOfStone.VS2, PurityOfStone.FL));
    }
}
