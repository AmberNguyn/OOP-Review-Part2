package problem3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CourseManagement {


    //create new Course
    public Course createCourse() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter course name: ");
        String courseName = keyboard.nextLine();
        System.out.println("Enter start date in year, month, day order: ");
        System.out.println("Enter year: ");
        int year = keyboard.nextInt();
        System.out.println("Enter month: ");
        int month = keyboard.nextInt();
        System.out.println("Enter day: ");
        int day = keyboard.nextInt();

        LocalDate startDate = LocalDate.of(year, month, day);

        System.out.println("Enter duration: ");
        int duration = keyboard.nextInt();


        List<Student> studentList = new ArrayList<>();
        System.out.println("=============================");
        System.out.println("Enter the number of student you want to add to list: ");
        int numberOfStudent = keyboard.nextInt();
        int count = 0;

        while (count < numberOfStudent) {
            studentList.add(addStudent());
            count++;
        }

        return new Course(courseName, startDate, duration, studentList);
    }

    //add Student into Course
    public Student addStudent() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter first name: ");
        String firstName = keyboard.nextLine();
        System.out.println("Enter last name: ");
        String lastName = keyboard.nextLine();
        System.out.println("Enter address: ");
        String address = keyboard.nextLine();
        System.out.println("Enter phone number: ");
        String phoneNumber = keyboard.nextLine();
        System.out.println("==============================");


        return new Student(firstName, lastName, address, phoneNumber);


    }

    //search course
    public List<Course> searchCourseByCourseName(List<Course> inputCourse, String keyword) {
        List<Course> listOfCourseNeededToSearch = new ArrayList<>();
        for (Course course : inputCourse
        ) {
            if (course.getCourseName().equalsIgnoreCase(keyword)) {
                listOfCourseNeededToSearch.add(course);
            }
        }
        return listOfCourseNeededToSearch;
    }

    //search student and his course
    public List<String> searchStudentAndTheirCourse(List<Course> inputCourse, String studentName) {
        List<String> listOfCourseThatAStudentTook = new ArrayList<>();
        for (Course course : inputCourse
        ) {
            for (int i = 0; i < course.getListOfStudents().size(); i++) {
                if (course.getListOfStudents().get(i).getFirstName().equalsIgnoreCase(studentName) ||
                        course.getListOfStudents().get(i).getLastName().equalsIgnoreCase(studentName)) {
                    listOfCourseThatAStudentTook.add(course.getCourseName());
                }
            }
        }
        return listOfCourseThatAStudentTook;
    }

    //which courses hasn't started yet
    public List<Course> listOfCoursesWhichHaveNotStartedYet(List<Course> inputCourse) {
        List<Course> listOfCoursesHaventStartedYet = new ArrayList<>();
        for (Course course : inputCourse
        ) {
            if (course.getStartDate().isAfter(LocalDate.now())) {
                listOfCoursesHaventStartedYet.add(course);
            }
        }
        return listOfCoursesHaventStartedYet;
    }

    // which courses haven't finished yet
    public List<Course> listOfCoursesWhichHaveNotFinishedYet(List<Course> inputCourse) {
        List<Course> listOfCoursesWhichHaveNotFinishedYet = new ArrayList<>();
        for (Course course : inputCourse
        ) {
            if (course.getStartDate().isBefore(LocalDate.now()) &&
                    course.getStartDate().plusDays(course.getDuration()).isAfter(LocalDate.now())) {
                listOfCoursesWhichHaveNotFinishedYet.add(course);
            }
        }
        return listOfCoursesWhichHaveNotFinishedYet;
    }
}
