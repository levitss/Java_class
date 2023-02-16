package kr.co.ezenac.project.school;
//st나 sub의 멤버변수로 두면 안되는가 이중배열
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
