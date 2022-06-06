package problem3;

import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;


@Data
@Setter
@Getter
@NoArgsConstructor
public class Course {
    private String courseName;
    private LocalDate startDate;
    private int duration;
    private List<Student> listOfStudents;
    private int year, month, day;


    public Course(String courseName, LocalDate startDate, int duration, List<Student> listOfStudents) {
        this.courseName = courseName;
        this.startDate = startDate;
        this.duration = duration;
        this.listOfStudents = listOfStudents;
    }



}
