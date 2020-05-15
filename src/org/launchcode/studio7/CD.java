package org.launchcode.studio7;

public class CD extends BaseDisc implements OpticalDisc {

    public CD(String aName, String aData, int aCapacity) {
        super(aName, aData, aCapacity, "CD");
    }


    public void playMusic() {
        System.out.println("Now listening to " + this.getName());
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
