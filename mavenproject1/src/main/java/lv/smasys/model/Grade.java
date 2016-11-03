package lv.smasys.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;
import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "GRADES")
public class Grade implements Serializable {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "gradeid")
    private int gradeid;
    //Student's grade for lesson
    @Column(name = "grade")
    private double grade;
    //Lessons date
    @Column(name = "gradedate")
    private String gradedate;
    @OneToOne(mappedBy = "grade")
    private Registration registration;
    @OneToMany(cascade = {CascadeType.ALL})
    @JoinColumn(name = "gradeid")
    private List<Lesson> lessons;

    public Grade() {
    }

    public Grade(double grade, String date) {
        this.grade = grade;
        this.gradedate = date;
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

    public int getGradeid() {
        return gradeid;
    }

    public void setGradeid(int gradeid) {
        this.gradeid = gradeid;
    }

    public Registration getRegistration() {
        return registration;
    }

    public void setRegistration(Registration registration) {
        this.registration = registration;
    }

    public List<Lesson> getLessons() {
        return lessons;
    }

    public void setLessons(List<Lesson> lessons) {
        this.lessons = lessons;
    }

}
