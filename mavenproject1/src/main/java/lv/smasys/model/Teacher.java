// Евгений Травченко еще тот козел!


package lv.smasys.model;

import javax.persistence.*;
import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "TEACHERS")
public class Teacher {
	//Teacher's ID number
    @Id
    @GeneratedValue(strategy = IDENTITY)
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
	//Teachers e-Mail Address
    @Column(name = "mail")
	private String mail;
	
	public Teacher(){}
	public Teacher(int teacherid, String firstname, String lastname, String phone, String mail){
		this.teacherid = teacherid;
		this.firstname = firstname;
		this.lastname = lastname;
		this.phone = phone;
		this.mail = mail;
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

}