/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Zac Allen
 */
public class Map {
    private Location locations[][];
    private Point currentLocation;
    
    public Map() {
        //Empty constructor for JavaBeans
    }

    public Location[][] getLocations() {
        return locations;
    }
    
    public Point getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(Point currentLocation) {
        this.currentLocation = currentLocation;
    }

    @Override
    public String toString() {
        return "Map {" 
                + "locations=" + locations 
                + ", currentLocation=" + currentLocation 
                + '}';
    }
    
}
