// Евгений Травченко еще тот козел!


//package lv.smasys.model;
//
//import javax.persistence.*;
//import static javax.persistence.GenerationType.IDENTITY;
//
//@Entity
//@Table(name = "REGISTRATIONS")
//public class Registration {
//	//Registration ID #
//    @Id
//    @GeneratedValue(strategy = IDENTITY)
//    @Column(name = "regid")    
//	private int regid;
//	//Student's ID #
//    @OneToOne(fetch = FetchType.LAZY, mappedBy = "Student", cascade = CascadeType.ALL)
//	private int studentid;
//	//ahuenna sokratil))))
//    @Column(name = "levelofstud")
//	private String levelofstud;
//	//Course ID#
//    @ManyToOne(cascade = CascadeType.ALL)
//	private int courseid;
//	
//	public Registration(){}
//	public Registration(int studentid, int courseid, String levelofstud){
//		this.studentid = studentid;
//		this.levelofstud = levelofstud;
//		this.courseid = courseid;
//	}
//	public int getRegId() {
//		return regid;
//	}
//	public void setRegId(int regid) {
//		this.regid = regid;
//	}
//	public int getStudentId() {
//		return studentid;
//	}
//	public void setStudentId(int studentid) {
//		this.studentid = studentid;
//	}
//	public String getLevelOfStud() {
//		return levelofstud;
//	}
//	public void setLevelOfStud(String levelofstud) {
//		this.levelofstud = levelofstud;
//	}
//	public int getCourseId() {
//		return courseid;
//	}
//	public void setCourseId(int courseid) {
//		this.courseid = courseid;
//	}
//	
//}