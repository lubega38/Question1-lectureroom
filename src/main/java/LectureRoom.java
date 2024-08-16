/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ST.EDWARDS
 */
public class LectureRoom {
    private int numberOfStudents;
    private boolean[] lights; // 3 lights: index 0 for light 1, index 1 for light 2, index 2 for light 3

    public LectureRoom() {
        numberOfStudents = 0;
        lights = new boolean[3]; // Initially, all lights are off
    }

    public void addStudents(int count) {
        if (count > 0) {
            numberOfStudents += count;
        }
    }

    public void removeStudents(int count) {
        if (count > 0) {
            numberOfStudents = Math.max(0, numberOfStudents - count);
        }
    }

    public void turnOnLight(int lightNumber) {
        if (lightNumber >= 1 && lightNumber <= 3) {
            lights[lightNumber - 1] = true;
        }
    }

    public void turnOffLight(int lightNumber) {
        if (lightNumber >= 1 && lightNumber <= 3) {
            lights[lightNumber - 1] = false;
        }
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public boolean isLightOn(int lightNumber) {
        if (lightNumber >= 1 && lightNumber <= 3) {
            return lights[lightNumber - 1];
        }
        return false;
    }

    public void displayRoomStatus() {
        System.out.println("Number of students: " + numberOfStudents);
        for (int i = 0; i < lights.length; i++) {
            System.out.println("Light " + (i + 1) + " is " + (lights[i] ? "ON" : "OFF"));
        }
    }
    
}
