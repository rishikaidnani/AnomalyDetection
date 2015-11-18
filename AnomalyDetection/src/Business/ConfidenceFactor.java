/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author Rishika Idnani
 */
public class ConfidenceFactor {
    
    private ArrayList<Node> pathFromSourceToDestination;
    private int numberOfTimesPathTaken;
    private float fuelConsumed;

    public ArrayList<Node> getPathFromSourceToDestination() {
        return pathFromSourceToDestination;
    }

    public void setPathFromSourceToDestination(ArrayList<Node> pathFromSourceToDestination) {
        this.pathFromSourceToDestination = pathFromSourceToDestination;
    }

    public int getNumberOfTimesPathTaken() {
        return numberOfTimesPathTaken;
    }

    public void setNumberOfTimesPathTaken(int numberOfTimesPathTaken) {
        this.numberOfTimesPathTaken = numberOfTimesPathTaken;
    }

    public float getFuelConsumed() {
        return fuelConsumed;
    }

    public void setFuelConsumed(float fuelConsumed) {
        this.fuelConsumed = fuelConsumed;
    }
}
