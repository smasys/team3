package lv.smasys.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "teachers")
public class Teacher implements Serializable {
    //Teacher's ID number

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "teacherid")
    private int teacherid;
    //Teacher's First Name
    @Column(name = "firstname")
    private String firstname;
    //Teacher's Last Name
    @Column(name = "lastname")
    private String lastname;
    //Teacher's Phone number
    @Column(name = "phone")
    private String phone;
    private String password;
    //Teachers e-Mail Address
    @Column(name = "mail")
    private String mail;
    @OneToMany(mappedBy="teacher",targetEntity=Lesson.class,cascade = {CascadeType.ALL})
    private List<Lesson> lessons;
    @OneToMany(mappedBy="teacher",targetEntity=Course.class,cascade = {CascadeType.ALL})
    private List<Course> courses;

    public Teacher() {
    }

    public Teacher(String firstname, String lastname, String phone, String mail, String password) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.phone = phone;
        this.mail = mail;
        this.password = password;
    }

    public int getTeacherid() {
        return teacherid;
    }

    public void setTeacherid(int teacherid) {
        this.teacherid = teacherid;
    }

  

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public List<Lesson> getLessons() {
        return lessons;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public void setLessons(List<Lesson> lessons) {
        this.lessons = lessons;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

  

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
