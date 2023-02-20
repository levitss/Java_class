package evaluation_project.school;

import java.util.ArrayList;
//student DTO
public class Student {
	private String stName;
	private Subject majorSub;
	private int stId;
	private ArrayList<Score> scores=new ArrayList<>();
	public Student(String name, int stId,Subject sub) {
		this.stId=stId;
		this.majorSub=sub;
		this.stName=name;
	}	
	
	public String getStName() {
		return stName;
	}
	public void setStName(String stName) {
		this.stName = stName;
	}
	public Subject getMajorSub() {
		return majorSub;
	}
	public void setMajorSub(Subject majorSub) {
		this.majorSub = majorSub;
	}
	public int getStId() {
		return stId;
	}
	public void setStId(int stId) {
		this.stId = stId;
	}
	public ArrayList<Score> getScores() {
		return scores;
	}
	public void setScores(Score scores) {
		this.scores.add(scores);
	}
}
