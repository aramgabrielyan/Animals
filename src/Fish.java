public class Fish extends Animal{
    private boolean isFreshwaterFish;
    private boolean isEdible;
    private int fishLength;

    public boolean isFreshwaterFish() {
        return isFreshwaterFish;
    }

    public void setFreshwaterFish(boolean freshwaterFish) {
        isFreshwaterFish = freshwaterFish;
    }

    public boolean isEdible() {
        return isEdible;
    }

    public void setEdible(boolean edible) {
        isEdible = edible;
    }

    public int getFishLength() {
        return fishLength;
    }

    public void setFishLength(int fishLength) {
        this.fishLength = fishLength;
    }
}
