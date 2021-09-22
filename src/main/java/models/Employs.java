package models;

import aplication.DBEngine;

import java.util.ArrayList;

public class Employs {

    private String name;
    private Position position;
    private String t_ShirtSize;
    private String sweaterSize;
    private String vestSize;
    private String jacketSize;
    private int trousersSize;
    private int shortsSize;
    private int safetyBootsSize;

    public Employs() {
    }

    public Employs(String name) {
        this.name = name;
    }

    public Employs(String name, Position position) {
        this.name = name;
        this.position = position;
    }

    public Employs(String name, Position position, String t_ShirtSize,
                   String sweaterSize, String vestSize, String jacketSize,
                   int trousersSize, int shortsSize, int safetyBootsSize) {
        this.name = name;
        this.position = position;
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

    public void setPosition(Position position) {
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

    public int getTrousersSize() {
        return trousersSize;
    }

    public void setTrousersSize(int trousersSize) {
        this.trousersSize = trousersSize;
    }

    public int getShortsSize() {
        return shortsSize;
    }

    public void setShortsSize(int shortsSize) {
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
        return name +
                "- " + position/* +
        " His sizes: " + t_ShirtSize +
                ", " + sweaterSize +
                ", " + vestSize +
                ", " + jacketSize +
                ", " + trousersSize +
                ", " + shortsSize +
                ", " + safetyBootsSize*/;
    }


}
