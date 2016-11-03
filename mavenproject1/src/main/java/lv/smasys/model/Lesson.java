// Евгений Травченко еще тот козел!
package lv.smasys.model;

import java.io.Serializable;
import javax.persistence.*;
import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "LESSONS")
public class Lesson implements Serializable {
    //Lesson ID #

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "lessonid")
    private int lessonid;
    //Lesson title
    @Column(name = "title")
    private String title;
    //Teacher's ID #
    @Column(name = "crpoints")
    private double crpoints;

    @ManyToOne
    @JoinColumn(name = "courseid",
            insertable = false, updatable = false,
            nullable = false)
    private Course course;

    @OneToOne
    @JoinColumn(name = "teacherid", insertable = false, updatable = false,
            nullable = false)
    private Teacher teacher;

    @ManyToOne
    @JoinColumn(name = "gradeid",
            insertable = false, updatable = false,
            nullable = false)
    private Grade grade;

    public Lesson() {
    }

    public Lesson(String title, double crpoints) {
        this.title = title;
        this.crpoints = crpoints;
    }

    public int getLessonId() {
        return lessonid;
    }

    public void setLessonId(int lessonid) {
        this.lessonid = lessonid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getCrPoint() {
        return crpoints;
    }

    public void setCrPoint(double crpoints) {
        this.crpoints = crpoints;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

}
