package evaluation_project.school;
//score DTO
public class Score {
	private int stId;
	private int score;
	private Subject sub;
	public Score(int stId,Subject sub,int score) {
		this.score=score;
		this.stId=stId;
		this.sub=sub;
	}
	//set은 생성자에서
	public int getStId() {
		return stId;
	}
	public int getScore() {
		return score;
	}
	public Subject getSub() {
		return sub;
	}
	
}
