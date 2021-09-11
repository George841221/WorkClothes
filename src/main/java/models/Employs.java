package models;

public class Employs {

    private String name;
    private Enum position;
    private String t_ShirtSize;
    private String sweaterSize;
    private String vestSize;
    private String jacketSize;
    private String trousersSize;
    private String shortsSize;
    private int safetyBootsSize;

    public Employs(String name, Position position) {
        this.name = name;
        this.position = position;
    }

    public Employs(String name, String t_ShirtSize, String sweaterSize, String vestSize, String jacketSize,
                   String trousersSize, String shortsSize, int safetyBootsSize) {
        this.name = name;
        this.t_ShirtSize = t_ShirtSize;
        this.sweaterSize = sweaterSize;
        this.vestSize = vestSize;
        this.jacketSize = jacketSize;
        this.trousersSize = trousersSize;
        this.shortsSize = shortsSize;
        this.safetyBootsSize = safetyBootsSize;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Enum getPosition() {
        return position;
    }

    public void setPosition(Enum position) {
        this.position = position;
    }

    public String getT_ShirtSize() {
        return t_ShirtSize;
    }

    public void setT_ShirtSize(String t_ShirtSize) {
        this.t_ShirtSize = t_ShirtSize;
    }

    public String getSweaterSize() {
        return sweaterSize;
    }

    public void setSweaterSize(String sweaterSize) {
        this.sweaterSize = sweaterSize;
    }

    public String getVestSize() {
        return vestSize;
    }

    public void setVestSize(String vestSize) {
        this.vestSize = vestSize;
    }

    public String getJacketSize() {
        return jacketSize;
    }

    public void setJacketSize(String jacketSize) {
        this.jacketSize = jacketSize;
    }

    public String getTrousersSize() {
        return trousersSize;
    }

    public void setTrousersSize(String trousersSize) {
        this.trousersSize = trousersSize;
    }

    public String getShortsSize() {
        return shortsSize;
    }

    public void setShortsSize(String shortsSize) {
        this.shortsSize = shortsSize;
    }

    public int getSafetyBootsSize() {
        return safetyBootsSize;
    }

    public void setSafetyBootsSize(int safetyBootsSize) {
        this.safetyBootsSize = safetyBootsSize;
    }

    @Override
    public String toString() {
        return name + "- " + position;
    }
}
