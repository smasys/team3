// Евгений Травченко еще тот козел!


package Operators;

import javax.persistence.*;

@Entity
@Table(name = "COURSES")
public class Course {
    @Id
    @GeneratedValue
    @Column(name = "courseid")
	private int courseid;
    @Column(name = "title")
	private String title;
    @Column(name = "studentid")
	private int studentid;
    @Column(name = "lessonid")
	private int lessonid;
	
	public Course(){}
	public Course(String title, int studentid, int lessonid){
		this.title = title;
		this.studentid = studentid;
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
	public int getStudentId() {
		return studentid;
	}
	public void setStudentId(int studentid) {
		this.studentid = studentid;
	}
	public int getLessonId() {
		return lessonid;
	}
	public void setLessonId(int lessonid) {
		this.lessonid = lessonid;
	}

}
