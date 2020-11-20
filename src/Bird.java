public class Bird extends Animal{
    private boolean isMigratory;
    private boolean isFlying;

    public boolean isMigratory() {
        return isMigratory;
    }

    public void setMigratory(boolean migratory) {
        isMigratory = migratory;
    }

    public boolean isFlying() {
        return isFlying;
    }

    public void setFlying(boolean flying) {
        isFlying = flying;
    }
}
