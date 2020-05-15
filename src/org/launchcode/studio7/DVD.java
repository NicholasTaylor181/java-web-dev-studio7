package org.launchcode.studio7;

public class DVD extends BaseDisc implements OpticalDisc {

    public DVD(String aName, String aData, int aCapacity) {
        super(aName, aData, aCapacity, "DVD");
    }


    public void playMovie() {
        System.out.println("Now watching " + this.getName());
    }


    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
