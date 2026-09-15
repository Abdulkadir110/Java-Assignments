package bike;

class Bike {
    private boolean isOn;
    protected double speed;
    void turnOn() {
        isOn = true;
    }
    void turnOff(){
        isOn = false;
    }
    void accelerate(){
        speed++;
    }
    void brake(){
        speed--;
    }
}
class ElectricBike extends Bike {
    private int batteryPercent;

    ElectricBike(int batteryPercent){
        this.batteryPercent = batteryPercent;
    }
    @Override
    void accelerate(){
        if(batteryPercent > 0) {
            super.accelerate();
            batteryPercent--;
        }
    }
}
class MountainBike extends Bike{
    private boolean isOffRoadMode;

    void setOffRoadModeOn(){
        isOffRoadMode = true;
    }
    @Override
    void accelerate(){
        if(isOffRoadMode) speed += 0.5;
    }
}
