package virtualclassroom;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ClassroomManager manager = new ClassroomManager();
        Scanner scanner = new Scanner(System.in);
        String command;

        System.out.println("Virtual Classroom Manager");

        while (true) {
            System.out.print("> ");
            command = scanner.nextLine().trim();
            String[] parts = command.split(" ", 2);

            try {
                switch (parts[0]) {
                    case "add_classroom":
                        manager.addClassroom(parts[1]);
                        break;
                    case "add_student":
                        String[] studentInfo = parts[1].split(" ", 2);
                        manager.addStudent(studentInfo[0], studentInfo[1]);
                        break;
                    case "schedule_assignment":
                        String[] assignmentInfo = parts[1].split(" ", 2);
                        manager.scheduleAssignment(assignmentInfo[0], assignmentInfo[1]);
                        break;
                    case "submit_assignment":
                        String[] submissionInfo = parts[1].split(" ", 3);
                        manager.submitAssignment(submissionInfo[0], submissionInfo[1], submissionInfo[2]);
                        break;
                    case "exit":
                        System.out.println("Exiting...");
                        return;
                    default:
                        System.out.println("Unknown command.");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
