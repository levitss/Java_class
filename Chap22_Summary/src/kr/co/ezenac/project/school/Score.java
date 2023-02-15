package kr.co.ezenac.project.school;

public class Score {
	private int studentId;
	private Subject subject;
	private int score;
	public Score(int id,Subject sub, int score) {
		this.score=score;
		this.studentId=id;
		this.subject=sub;
	}
	public int getStudentId() {
		return studentId;
	}
	public Subject getSubject() {
		return subject;
	}
	public int getScore() {
		return score;
	}
	
}
