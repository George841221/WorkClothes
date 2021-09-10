package models;

public class Employs {

    private String name;
    private Enum position;
    private String t_ShirtSyze;
    private String sweaterSyze;
    private String vestSyze;
    private String jacketSyze;
    private String trousersSyze;
    private String shortsSyze;
    private int safetyBootsSyze;

    public Employs(String name) {
        this.name = name;
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

    public String getT_ShirtSyze() {
        return t_ShirtSyze;
    }

    public void setT_ShirtSyze(String t_ShirtSyze) {
        this.t_ShirtSyze = t_ShirtSyze;
    }

    public String getSweaterSyze() {
        return sweaterSyze;
    }

    public void setSweaterSyze(String sweaterSyze) {
        this.sweaterSyze = sweaterSyze;
    }

    public String getVestSyze() {
        return vestSyze;
    }

    public void setVestSyze(String vestSyze) {
        this.vestSyze = vestSyze;
    }

    public String getJacketSyze() {
        return jacketSyze;
    }

    public void setJacketSyze(String jacketSyze) {
        this.jacketSyze = jacketSyze;
    }

    public String getTrousersSyze() {
        return trousersSyze;
    }

    public void setTrousersSyze(String trousersSyze) {
        this.trousersSyze = trousersSyze;
    }

    public String getShortsSyze() {
        return shortsSyze;
    }

    public void setShortsSyze(String shortsSyze) {
        this.shortsSyze = shortsSyze;
    }

    public int getSafetyBootsSyze() {
        return safetyBootsSyze;
    }

    public void setSafetyBootsSyze(int safetyBootsSyze) {
        this.safetyBootsSyze = safetyBootsSyze;
    }
}
