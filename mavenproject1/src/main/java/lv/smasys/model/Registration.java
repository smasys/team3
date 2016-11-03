// Евгений Травченко еще тот козел!
package lv.smasys.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;
import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "REGISTRATIONS")
public class Registration implements Serializable {

    //Registration ID #
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "regid") 
    private int regid;
    //Student's ID #
    @Column(name = "levelofstud")
    private String levelofstud;

    @OneToOne
    @JoinColumn(name = "studentid", insertable = false, updatable = false,
            nullable = false)
    private Student student;
    
    @OneToMany(cascade={CascadeType.ALL})
    @JoinColumn(name="couseid")
    private List<Course> courses;

    public Registration() {
    }

    public Registration(String levelofstud) {
        this.levelofstud = levelofstud;
    }
    
    public int getRegId() {
        return regid;
    }

    public void setRegId(int regid) {
        this.regid = regid;
    }

    public String getLevelOfStud() {
        return levelofstud;
    }

    public void setLevelOfStud(String levelofstud) {
        this.levelofstud = levelofstud;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }   
    
    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
    

}
