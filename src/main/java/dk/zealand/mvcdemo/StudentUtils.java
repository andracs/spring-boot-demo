/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 14/03/2023
 */
package dk.zealand.mvcdemo;

import java.util.ArrayList;

public class StudentUtils {


    public static ArrayList<Student> buildStudents() {
        ArrayList<Student> liste = new ArrayList<>();
        liste.add(new Student(1, "András"));
        liste.add(new Student(2, "Susanne"));
        return liste;
    }
}
