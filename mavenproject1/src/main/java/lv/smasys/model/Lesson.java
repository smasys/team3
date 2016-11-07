package lv.smasys.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "lessons")
public class Lesson implements Serializable {
    //Lesson ID #

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "lessonid")
    private long lessonid;
    //Lesson title
    @Column(name = "title")
    private String title;
    //Teacher's ID #
    @Column(name = "crpoints")
    private double crpoints;

    @ManyToOne
    @JoinColumn(name="courseid",referencedColumnName="courseid",
            nullable = true)
    private Course course;

    @ManyToOne
    @JoinColumn(name = "teacherid", referencedColumnName="teacherid",
            nullable = true)
    private Teacher teacher;
    
    @OneToMany(cascade = {CascadeType.ALL})
    @JoinColumn(name = "lessonid")
    private List<Grade> grades;
    @Column(name = "description")
    private String description;
   
    public Lesson() {
    }

    public Lesson(String title, double crpoints, Teacher teacher) {
        this.title = title;
        this.crpoints = crpoints;
        this.teacher = teacher;
    }

    public long getLessonid() {
        return lessonid;
    }

    public void setLessonid(long lessonid) {
        this.lessonid = lessonid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getCrpoints() {
        return crpoints;
    }

    public void setCrpoints(double crpoints) {
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

