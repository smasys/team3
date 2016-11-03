// Евгений Травченко еще тот козел!
package lv.smasys.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;
import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "COURSES")
public class Course implements Serializable {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "courseid")
    private int courseid;
    
    @Column(name = "title")
    private String title;

    @OneToMany(cascade = {CascadeType.ALL})
    @JoinColumn(name = "courseid")
    private List<Lesson> lessons;
    
    @OneToMany(cascade = {CascadeType.ALL})
    @JoinColumn(name = "courseid")
    private List<Student> students;
    

    public Course() {
    }

    public Course(String title, List<Lesson> lessons) {
        this.title = title;
        this.lessons = lessons;
    }

    public int getCourseId() {
        return courseid;
    }

    public void setCourseId(int courseid) {
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
