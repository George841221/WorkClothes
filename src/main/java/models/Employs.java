package models;

import aplication.DBEngine;
import lombok.Getter;

import java.util.ArrayList;

public class Employs {

    @Getter
    private String name;
    @Getter
    private Position position;
    @Getter
    private String t_ShirtSize;
    @Getter
    private String sweaterSize;
    @Getter
    private String vestSize;
    @Getter
    private String jacketSize;
    @Getter
    private int trousersSize;
    @Getter
    private int shortsSize;
    @Getter
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



    @Override
    public String toString() {
        return name +
                "- " + position +
        " His sizes: " + t_ShirtSize +
                ", " + sweaterSize +
                ", " + vestSize +
                ", " + jacketSize +
                ", " + trousersSize +
                ", " + shortsSize +
                ", " + safetyBootsSize;
    }


}
