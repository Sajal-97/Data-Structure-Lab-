package LeaderBoard;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many students are in the class: ");
        int studentNumber = sc.nextInt();
        
        leaderboard l_board = new leaderboard(studentNumber);

        for(int i=1; i<=studentNumber; i++) {
            System.out.println("Enter information of student " + i + ": ");
            System.out.print("Id: ");
            long id = sc.nextLong();
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("CGPA: ");
            double cgpa = sc.nextDouble();

            student newStudent = new student(id, name, cgpa);
            l_board.Add(newStudent);
        }
        
        l_board.print();
    }
}
