package problem3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CourseDemo {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        CourseManagement courseManagement = new CourseManagement();
        List<Course> courseList = new ArrayList<>();

        System.out.println("Enter the number of Course you want to add: ");
        int numberOfCourse = keyboard.nextInt();
        keyboard.nextLine();
        int count = 0;
        Course course = new Course();
        while (count < numberOfCourse) {
            course = courseManagement.createCourse();
            courseList.add(course);
            count++;
            System.out.println("Added successfully");
        }


        System.out.println("---------------- SEARCH COURSE NAME -------------------");
        System.out.println("Enter the course you want to search: ");
        String searchedName = keyboard.nextLine();
        List<Course> listOfCoursesSearched = courseManagement.searchCourseByCourseName(courseList, searchedName);
        for (Course searchedCourse : listOfCoursesSearched
        ) {
            System.out.println(searchedCourse);
        }


        System.out.println("---------------- SEARCH STUDENT AND THEIR COURSE -------------------");
        System.out.println("Enter the student to want to check: ");
        String searchStudentName = keyboard.nextLine();
        List<String> listOfCoursesAStudentTook = courseManagement.searchStudentAndTheirCourse(courseList, searchStudentName);
        System.out.println("---------------------------------------------------------------------");
        System.out.println("Student name: " + searchStudentName);
        for (String takenCourse : listOfCoursesAStudentTook) {
            System.out.println(takenCourse);
        }

        System.out.println("---------------- LIST OF COURSES WHICH HAVE NOT FINISHED YET -------------------");
        List<Course> listOfCoursesWhichHaveNotFinishedYet = courseManagement.listOfCoursesWhichHaveNotFinishedYet(courseList);
        for (Course notFinishedCourse : listOfCoursesWhichHaveNotFinishedYet
        ) {
            System.out.println(notFinishedCourse);
        }


        System.out.println("---------------- LIST OF COURSES WHICH HAVE NOT STARTED YET -------------------");
        List<Course> listOfCoursesWhichHaveNotStartedYet = courseManagement.listOfCoursesWhichHaveNotStartedYet(courseList);
        for (Course notStartedCourse : listOfCoursesWhichHaveNotStartedYet
        ) {
            System.out.println(notStartedCourse);
        }

    }
}
