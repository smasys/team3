// Евгений Травченко еще тот козел!


package lv.smasys.model;

import javax.persistence.*;
import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "LESSONS")
public class Lesson {
	//Lesson ID #
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "lessonid")
	private int lessonid;
	//Lesson title
    @Column(name = "title")
	private String title;
	//Teacher's ID #
    @OneToOne(fetch = FetchType.LAZY, mappedBy = "Teacher", cascade = CascadeType.ALL)
	private int teacherid;
	//Student's Earned Credit Points
    @Column(name = "crpoints")
	private double crpoints;
	
	public Lesson(){}
	public Lesson(String title, int teacherid, double crpoints){
		this.title = title;
		this.teacherid = teacherid;
		this.crpoints = crpoints;
	}
	public int getLessonId() {
		return lessonid;
	}
	public void setLessonId(int lessonid) {
		this.lessonid = lessonid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getTeacherId() {
		return teacherid;
	}
	public void setTeacherId(int teacherid) {
		this.teacherid = teacherid;
	}
	public double getCrPoint() {
		return crpoints;
	}
	public void setCrPoint(double crpoints) {
		this.crpoints = crpoints;
	}
}