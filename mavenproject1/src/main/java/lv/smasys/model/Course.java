package lv.smasys.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "COURSES")
public class Course implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "courseid")
    private long courseid;

    @Column(name = "title")
    private String title;

    @OneToMany(mappedBy="course",targetEntity=Lesson.class,cascade = {CascadeType.ALL})    
    private List<Lesson> lessons;

    @OneToMany(mappedBy="course",targetEntity=Student.class,cascade = {CascadeType.ALL})    
    private List<Student> students;
//    @OneToMany(cascade = {CascadeType.ALL})
//    @JoinColumn(name = "courseid")
//    private List<Student> students;

    public Course() {
    }

    public Course(String title) {
        this.title = title;
        this.lessons = lessons;
    }

    public long getCourseid() {
        return courseid;
    }

    public void setCourseid(long courseid) {
        this.courseid = courseid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Lesson> getLessons() {
        return lessons;
    }

    public void setLessons(List<Lesson> lessons) {
        this.lessons = lessons;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

}
