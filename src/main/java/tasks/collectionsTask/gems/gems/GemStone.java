package tasks.collectionsTask.gems.gems;

import tasks.collectionsTask.gems.gemsSpecifications.GemQuality;
import tasks.collectionsTask.gems.gemsSpecifications.PurityOfStone;

import java.util.Objects;

public abstract class GemStone {
    private String colour;
    private double caratWeight;
    protected GemQuality gemQuality;
    private PurityOfStone purity;
    private double priceForCarat;
    private Double priceOfGemStone;

    public GemStone(String colour, double caratWeight, PurityOfStone purity) {
        this.colour = colour;
        this.caratWeight = caratWeight;
        this.purity = purity;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public double getCaratWeight() {
        return caratWeight;
    }

    public void setCaratWeight(int caratWeight) {
        this.caratWeight = caratWeight;
    }

    public GemQuality getGemQuality() {
        return gemQuality;
    }

    protected void setGemQuality(GemQuality gemQuality) {
        this.gemQuality = gemQuality;
    }

    public PurityOfStone getPurity() {
        return purity;
    }

    public void setPurity(PurityOfStone purity) {
        this.purity = purity;
    }

    public double getPriceForCarat() {
        return priceForCarat;
    }

    protected void setPriceForCarat(double priceForCarat) {
        this.priceForCarat = priceForCarat;
    }

    public void setPriceOfGemStone() {
        priceOfGemStone = caratWeight * getPriceForCarat() * getPurity().getPurityCoefficient();
    }
    public Double getPriceOfGemStone() {
        return priceOfGemStone;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "colour='" + colour + '\'' +
                ", caratWeight=" + caratWeight +
                ", gemQuality=" + gemQuality +
                ", purity=" + purity +
                ", priceForCarat=" + priceForCarat +
                ", priceOfGemStone=" + priceOfGemStone +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GemStone gemStone = (GemStone) o;
        return Double.compare(gemStone.caratWeight, caratWeight) == 0 &&
                Double.compare(gemStone.priceForCarat, priceForCarat) == 0 &&
                Double.compare(gemStone.priceOfGemStone, priceOfGemStone) == 0 &&
                Objects.equals(colour, gemStone.colour) &&
                gemQuality == gemStone.gemQuality &&
                purity == gemStone.purity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(colour, caratWeight, gemQuality, purity, priceForCarat, priceOfGemStone);
    }
}
