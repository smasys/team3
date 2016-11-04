package lv.smasys.model;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "TEACHERS")
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
    @OneToOne(mappedBy = "teacher")
    private Lesson lesson;

    public Teacher() {
    }

    public Teacher(String firstname, String lastname, String phone, String mail, String password) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.phone = phone;
        this.mail = mail;
        this.password = password;
    }

    public int getId() {
        return teacherid;
    }

    public void setId(int id) {
        this.teacherid = id;
    }

    public String getFname() {
        return firstname;
    }

    public void setFname(String firstname) {
        this.firstname = firstname;
    }

    public String getLname() {
        return lastname;
    }

    public void setLname(String lastname) {
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

    public Lesson getLesson() {
        return lesson;
    }

    public void setLesson(Lesson lesson) {
        this.lesson = lesson;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
