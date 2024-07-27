package virtualclassroom;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public class ClassroomManager {
    private static final Logger LOGGER = Logger.getLogger(ClassroomManager.class.getName());
    private Map<String, Classroom> classrooms;

    public ClassroomManager() {
        this.classrooms = new HashMap<>();
    }

    public void addClassroom(String className) {
        if (!classrooms.containsKey(className)) {
            classrooms.put(className, new Classroom(className));
            LOGGER.info("Classroom " + className + " has been created.");
        } else {
            LOGGER.warning("Classroom " + className + " already exists.");
        }
    }

    public void addStudent(String studentId, String className) {
        Classroom classroom = classrooms.get(className);
        if (classroom != null) {
            classroom.addStudent(new Student(studentId));
            LOGGER.info("Student " + studentId + " has been enrolled in " + className + ".");
        } else {
            LOGGER.warning("Classroom " + className + " does not exist.");
        }
    }

    public void scheduleAssignment(String className, String assignmentDetails) {
        Classroom classroom = classrooms.get(className);
        if (classroom != null) {
            classroom.addAssignment(new Assignment(assignmentDetails));
            LOGGER.info("Assignment for " + className + " has been scheduled.");
        } else {
            LOGGER.warning("Classroom " + className + " does not exist.");
        }
    }

    public void submitAssignment(String studentId, String className, String assignmentDetails) {
        Classroom classroom = classrooms.get(className);
        if (classroom != null) {
            for (Assignment assignment : classroom.getAssignments()) {
                if (assignment.getDetails().equals(assignmentDetails) && !assignment.isSubmitted()) {
                    assignment.submit();
                    LOGGER.info("Assignment submitted by Student " + studentId + " in " + className + ".");
                    return;
                }
            }
            LOGGER.warning("Assignment not found or already submitted.");
        } else {
            LOGGER.warning("Classroom " + className + " does not exist.");
        }
    }
}
