package pl.edu.pwsz.student.demo;

/**
 * Created by Student on 2017-05-30.
 */
public class demo {

    public static void main(String[] args) {

        Student s1 = new Student();
        s1.setName("Albert");
        s1.setLastname("Albecki");
        System.out.println("s1: " + s1.getName() + " " + s1.getLastname());
    }
}
