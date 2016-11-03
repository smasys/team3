// Евгений Травченко еще тот козел!
package lv.smasys.model;

import java.io.Serializable;
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

    private int lessonid;

    @ManyToOne
    @JoinColumn(name = "regid",
            insertable = false, updatable = false,
            nullable = false)
    private Registration registration;

    public Course() {
    }

    public Course(String title, int lessonid) {
        this.title = title;
        this.lessonid = lessonid;
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

    public int getLessonId() {
        return lessonid;
    }

    public void setLessonId(int lessonid) {
        this.lessonid = lessonid;
    }

    public Registration getRegistration() {
        return registration;
    }

    public void setRegistration(Registration registration) {
        this.registration = registration;
    }

}
