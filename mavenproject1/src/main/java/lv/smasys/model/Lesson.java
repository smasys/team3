// Евгений Травченко еще тот козел!
package lv.smasys.model;

import java.io.Serializable;
import java.util.List;
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
    
    @OneToMany(cascade = {CascadeType.ALL})
    @JoinColumn(name = "lessonid")
    private List<Grade> grades;

    public Lesson() {
    }

    public Lesson(String title, double crpoints, Teacher teacher) {
        this.title = title;
        this.crpoints = crpoints;
        this.teacher = teacher;
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

    public List<Grade> getGrades() {
        return grades;
    }

    public void setGrades(List<Grade> grades) {
        this.grades = grades;
    }

}

