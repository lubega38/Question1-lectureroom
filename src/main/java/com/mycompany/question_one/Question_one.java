/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.question_one;

/**
 *
 * @author ST.EDWARDS
 */
import java.util.Scanner;
public class Question_one {

    public static void main(String[] args) {
        LectureRoom room = new LectureRoom();
        Scanner reader = new Scanner(System.in);
        char choice;

        do {
            // Display menu
            System.out.println("Menu:");
            System.out.println("W - Add students to the room");
            System.out.println("X - Remove students from the room");
            System.out.println("Y - Turn on a light");
            System.out.println("Z - Turn off a light");
            System.out.println("Q - Quit");
            System.out.print("Enter your choice: ");
            choice = reader.next().charAt(0);

            switch (choice) {
                case 'W':
                case 'w':
                    System.out.print("Enter the number of students to add: ");
                    int studentsToAdd = reader.nextInt();
                    room.addStudents(studentsToAdd);
                    room.displayRoomStatus();
                    break;

                case 'X':
                case 'x':
                    System.out.print("Enter the number of students to remove: ");
                    int studentsToRemove = reader.nextInt();
                    room.removeStudents(studentsToRemove);
                    room.displayRoomStatus();
                    break;

                case 'Y':
                case 'y':
                    System.out.print("Enter the light number to turn on (1, 2, or 3): ");
                    int lightToTurnOn = reader.nextInt();
                    room.turnOnLight(lightToTurnOn);
                    room.displayRoomStatus();
                    break;

                case 'Z':
                case 'z':
                    System.out.print("Enter the light number to turn off (1, 2, or 3): ");
                    int lightToTurnOff = reader.nextInt();
                    room.turnOffLight(lightToTurnOff);
                    room.displayRoomStatus();
                    break;

                case 'Q':
                case 'q':
                    System.out.println("Quitting the program...");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
                    break;
            }
        } while (choice != 'Q' && choice != 'q');

        reader.close();
    }
}
