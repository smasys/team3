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

    @ManyToOne
    @JoinColumn(name = "regid",
            insertable = false, updatable = false,
            nullable = false)
    private Registration registration;
    
    @OneToMany(cascade={CascadeType.ALL})
    @JoinColumn(name="courseid")
    private List<Lesson> lessons;

    public Course() {
    }

    public Course(String title) {
        this.title = title;
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
