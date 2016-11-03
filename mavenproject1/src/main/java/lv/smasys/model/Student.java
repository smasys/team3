package lv.smasys.model;

import java.io.Serializable;
import javax.persistence.*;
import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "STUDENTS")
public class Student implements Serializable {

//Student Id number
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "studentid")

    private int studentid;
//Student First Name
    @Column(name = "firstname")
    private String firstname;
//Student Last Name
    @Column(name = "lastname")
    private String lastname;
//Student Phone Number
    @Column(name = "phone")
    private String phone;
//Student e-mail Address
    @Column(name = "mail")
    private String mail;
    private String password;
    
    @ManyToOne
    @JoinColumn(name = "courseid",
            insertable = false, updatable = false,
            nullable = false)
    private Course course;
    
    @OneToOne(mappedBy = "student")
    private Grade grade;

    public Student() {
    }

    public Student(int studentid, String firstname, String lastname, String phone, String mail, String password, Grade grade) {
        this.studentid = studentid;
        this.firstname = firstname;
        this.lastname = lastname;
        this.phone = phone;
        this.mail = mail;
        this.password = password;
        this.grade = grade;

    }

    public int getId() {
        return studentid;
    }

    public void setId(int studentid) {
        this.studentid = studentid;
    }

    public String getFirsname() {
        return firstname;
    }

    public void setFirsname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
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

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }
    
    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

}
