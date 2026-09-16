package tdd;

import java.util.List;

public enum Zones {
    NORTH_CENTRAL(List.of("Benue", "FCT", "Kogi", "Kwara", "Nasarawa", "Niger", "Plateau")),
    NORTH_EAST(List.of("Adamawa","Bauchi","Borno","Gombe", "Taraba", "Yobe")),
    NORTH_WEST(List.of("Kaduna","Katsina","Kano","Kebbi","Sokoto","Jigawa","Zamfara")),
    SOUTH_EAST(List.of("Abia","Anambra","Ebonyi", "Enugu","Imo")),
    SOUTH_SOUTH(List.of("Akwa-Ibom","Bayelsa","Cross-River","Delta","Edo","Rivers")),
    SOUTH_WEST(List.of("Ekiti","Lagos", "Osun","Ondo", "Ogun", "Oyo"));

    private List<String> states;

    Zones(List<String> states) {
        this.states = states;
    }

    public List<String> getStates() {
        return states;
    }
}
