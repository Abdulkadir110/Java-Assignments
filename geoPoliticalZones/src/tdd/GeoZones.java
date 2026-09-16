package tdd;

public class GeoZones {
    private String state;
    private Zones states;


    public GeoZones (String state){
        this.state = state;
    }

    public String getState() {
        return state;
    }
    public String getZoneFor(){
        for(Zones zone : Zones.values()) {
            for( String eachZone : zone.getStates()){
                 if((eachZone.equals(getState()))){
                     return zone.name();
                }
            }
        }
        return null;
    }
}
