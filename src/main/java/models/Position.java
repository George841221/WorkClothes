package models;

public enum Position {

    OFFICE_WORKER,
    MECHANIC,
    ELECTRICIAN,
    MAINTENANCE,
    INDOOR_WORKER,
    UNKNOWN;

    public static Position find(String name) {
        for (Position position : Position.values()){
            if (position.name().equalsIgnoreCase(name)) {
                return position;
            }
        }
        return Position.UNKNOWN;
    }
}
