public class Mammal extends Animal{
    private boolean isLand;
    private boolean isWithHorns;
    private boolean isWild;

    public boolean isLand() {
        return isLand;
    }

    public void setLand(boolean land) {
        isLand = land;
    }

    public boolean isWithHorns() {
        return isWithHorns;
    }

    public void setWithHorns(boolean withHorns) {
        isWithHorns = withHorns;
    }

    public boolean isWild() {
        return isWild;
    }

    public void setWild(boolean wild) {
        isWild = wild;
    }
}
