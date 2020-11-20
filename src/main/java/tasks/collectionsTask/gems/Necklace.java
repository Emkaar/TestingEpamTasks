package tasks.collectionsTask.gems;

import tasks.collectionsTask.gems.gems.GemStone;
import tasks.collectionsTask.gems.gemsSpecifications.PurityOfStone;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

public class Necklace {
    private List<GemStone> necklaceGems = new ArrayList<>();
    public void addGemStoneToNecklace(GemStone gemStone){
        necklaceGems.add(gemStone);
    }
    public List<GemStone> getNecklaceGems() {
        return necklaceGems;
    }

    public Necklace(List<GemStone> necklaceGems) {
        this.necklaceGems = necklaceGems;
    }

    public Necklace() {
    }

    @Override
    public String toString() {
        return "Necklace{" +
                "NecklaceGems=" + necklaceGems +
                '}';
    }

    public void sortNecklaceGemsByPrice(){
        necklaceGems.sort((o1, o2) -> o1.getPriceOfGemStone().compareTo(o2.getPriceOfGemStone()));
    }

    public double getSummaryCaratWeightOfNecklaceGems(){
        double summaryWeight = 0;
        for (GemStone gemStone : necklaceGems){
            summaryWeight =+ gemStone.getCaratWeight();
        }
        return summaryWeight;
    }

    public double getSummaryPriceOfNecklaceGems() {
        double summaryPrice = 0;
        for (GemStone gemStone : necklaceGems) {
            summaryPrice = +gemStone.getPriceOfGemStone();
        }
        return summaryPrice;
    }

    public List<GemStone> findGemsInNecklaceWithSpecifiedPurity(PurityOfStone minLimitOfPurity,
                                                                PurityOfStone maxLimitOfPurity) {
        List<GemStone> gemStonesWithSpecifiedPurity = new ArrayList<>();
        EnumSet<PurityOfStone> specifiedPurity = EnumSet.range(maxLimitOfPurity, minLimitOfPurity);
        for (GemStone gemStone : necklaceGems){
            for (PurityOfStone purityOfStone : specifiedPurity){
                if(purityOfStone == gemStone.getPurity()){
                    gemStonesWithSpecifiedPurity.add(gemStone);
                    break;
                }
            }
        }
        return gemStonesWithSpecifiedPurity;
    }
}

