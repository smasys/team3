package lv.smasys.model;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "grades")
public class Grade implements Serializable {

    //@Id
    //@GeneratedValue(strategy = IDENTITY)
    //@Column(name = "gradeid")
    //private int gradeid;
    //Student's grade for lesson
    @Id
    @OneToOne
    @JoinColumn(name = "studentid", insertable = false, updatable = false,
            nullable = false)
    private Student student;

    @ManyToOne
    @JoinColumn(name = "lessonid",
            insertable = false, updatable = false,
            nullable = false)
    private Lesson lesson;

    @Column(name = "grade")
    private double grade;
    //Lessons date
    @Column(name = "gradedate")
    private String gradedate;

    public Grade() {
    }

    public Grade(double grade, String date, Lesson lesson, Student student) {
        this.grade = grade;
        this.gradedate = date;
        this.lesson = lesson;
        this.student = student;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public String getGradedate() {
        return gradedate;
    }

    public void setGradedate(String gradedate) {
        this.gradedate = gradedate;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Lesson getLesson() {
        return lesson;
    }

    public void setLesson(Lesson lesson) {
        this.lesson = lesson;
    }

}
