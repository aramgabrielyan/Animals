public class Animal {
    private String type;
    private String name;
    private String color;
    private char sex;
    private boolean isPredator;
    private boolean isViviparous;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public boolean isPredator() {
        return isPredator;
    }

    public void setPredator(boolean predator) {
        isPredator = predator;
    }

    public boolean isViviparous() {
        return isViviparous;
    }

    public void setViviparous(boolean viviparous) {
        isViviparous = viviparous;
    }
}
