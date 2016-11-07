package lv.smasys.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "students")
public class Student implements Serializable {

//Student Id number
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)    
    @Column(name = "studentid")
    private long studentid;
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
    @Column(name = "password")
    private String password;

    @ManyToOne
    @JoinColumn(name = "courseid",
            nullable = true)
    private Course course;

    @OneToOne(mappedBy = "student")
    private Grade grade;
    
    

    public Student() {
    }

    public Student(String firstname, String lastname, String phone, String mail, String password) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.phone = phone;
        this.mail = mail;
        this.password = password;

    }

    public long getStudentid() {
        return studentid;
    }

    public void setStudentid(long studentid) {
        this.studentid = studentid;
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
