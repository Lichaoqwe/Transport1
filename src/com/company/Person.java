package com.company;

import com.company.*;

/**
 * @description:
 * @author: 佚名
 * @date: Created in 2020/5/18 12:50
 * @version: 1.0
 * @modified By:
 */
public class Person {
    private int p_Age;
    private String p_Sex;
    private String id;
    private String p_Name;

    public void driveTransport(Aircraft aircraft) {
    aircraft.drivingMethod();
}

    public void driveTransport(Airship airship) {
        airship.drivingMethod();
    }

    public void driveTransport(HotAirBalloon hotAirBalloon) {
        hotAirBalloon.drivingMethod();
    }

    public void driveTransport(Ship ship) {
        ship.drivingMethod();
    }

    public void driveTransport(Bicycle bicycle) {
        bicycle.drivingMethod();
    }

    public void driveTransport(Motorcycle motorcycle) {
       motorcycle.drivingMethod();
    }

    public void driveTransport(Automobile automobile) {
        automobile.drivingMethod();
    }

    public void driveTransport(Submarine submarine) {
       submarine.drivingMethod();
    }

    public void driveTransport(Hovercraft hovercraft) {
       hovercraft.drivingMethod();
    }

    public Person(String id) {
        this.id = id;
    }

    public Person() {
    }

    public int getP_Age() {
        return p_Age;
    }

    public void setP_Age(int p_Age) {
        this.p_Age = p_Age;
    }

    public String getP_Sex() {
        return p_Sex;
    }

    public void setP_Sex(String p_Sex) {
        this.p_Sex = p_Sex;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getP_Name() {
        return p_Name;
    }

    public void setP_Name(String p_Name) {
        this.p_Name = p_Name;
    }
}
