package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        CD myCd = new CD("Gorillaz: Demon Days", "Music", 700);

        DVD myDvd = new DVD("Apocalypse Now", "Movie", 4700);

        myCd.spinDisc();
        myDvd.spinDisc();

        myCd.playMusic();
        myDvd.playMovie();

        myCd.report();
        myDvd.report();

        myCd.stopDisc();

        myCd.writeData("Program");
        myDvd.writeData("Program");

        myCd.readData();
        myDvd.readData();


        // TODO: Declare and initialize a CD and a DVD object.

        // TODO: Call each CD and DVD method to verify that they work as expected.

    }
}
