package org.launchcode.studio7;

public abstract class BaseDisc implements OpticalDisc {

    private boolean isDiscSpinning;
    private String name;
    private String data;
    private int capacity;
    private String discType;
    private String rpm;
    private int readSpeedKB;

    public BaseDisc(String aName, String aData, int aCapacity, String aDiscType) {
        name = aName;
        data = aData;
        capacity = aCapacity;
        discType = aDiscType;
        if (discType == "CD") {
            rpm = "200 - 500";
            readSpeedKB =  150;
        }
        if (discType == "DVD") {
            rpm = "570 - 1600";
            readSpeedKB = 1385;
        }
    }

    public boolean isDiscSpinning() {
        return isDiscSpinning;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getData() {
        return data;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getDiscType() {
        return discType;
    }


    public String getRpm() {
        return rpm;
    }

    public int getReadSpeedKB() {
        return readSpeedKB;
    }

    @Override
    public void spinDisc() {
        System.out.println("A " + this.discType + " spins at a rate of " + this.rpm + " rpm.");
        this.isDiscSpinning = true;

    }

    @Override
    public void report() {
        System.out.println("Name: " + this.name + "\nCapacity: " + this.capacity + "\nData: " + this.data + "\nDisc type: " + this.discType);
    }

    @Override
    public void writeData(String data) {
        if(isDiscSpinning) {
            this.data = data;
        }else {
            System.out.println("Sorry the disc isn't spinning!");
        }
    }

    @Override
    public void stopDisc() {
        this.isDiscSpinning = false;
    }

    @Override
    public void readData() {
        System.out.println(this.data);
    }
}
