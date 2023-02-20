package evaluation_project.school.view;

import java.util.ArrayList;

import evaluation_project.constants.Constants;
import evaluation_project.grade.Basic;
import evaluation_project.grade.Evaluation;
import evaluation_project.grade.Extra;
import evaluation_project.grade.Major;
import evaluation_project.school.School;
import evaluation_project.school.Score;
import evaluation_project.school.Student;
import evaluation_project.school.Subject;

public class Viewer {
	School school=School.getInstance();
	public static final String TITLE="과목 학점 결과>>>";
	public static final String HEADLINE="---------------------------------------";
	public static final String HEADER="이름 \t 학번 \t 필수 \t 점수 \t 학점 ";
	public static final String ENDLINE="=======================================";
	
	private StringBuffer str=new StringBuffer();
	//buffer 다 담아서 한번에 출력
	public void head(Subject sub) {
		str.append(sub.getSubName()+TITLE+"\n");//title 과목명 출력은 여기서
		str.append(HEADLINE+"\n");
		str.append(HEADER+"\n");
		str.append(HEADLINE+"\n");
		
	}
	
	public void body(Subject sub) {
		ArrayList<Student> stlist=sub.getStudents();//과목에 등록된 학생들
		for (int i=0; i<stlist.size();i++) {
			Student st=stlist.get(i);
			str.append(st.getStName()+"\t ");//이름
			str.append(st.getStId()+"\t ");//학번
			str.append(st.getMajorSub().getSubName()+"\t ");//전공명
			
			getGrade(st,sub);//학생별 해당 과목 학점
			str.append("\n");	
		}
		
		
	}
	public void Footer() {
		str.append(Viewer.ENDLINE+"\n");
	}
			
	
	public void getGrade(Student st, Subject sub) {
		ArrayList<Score> scoreList=st.getScores();//st에 저장된 score
		int majorSubId=st.getMajorSub().getSubId();//st 전공과목의 id

		String grade="";
		//학점 평가 기준
		Evaluation[] gradeEval= {new Basic(), new Major(),new Extra()}; 
		for(int i=0; i<scoreList.size();i++) {
			Score score=scoreList.get(i);
			//선택한 과목 id와 점수에 할당된 과목 id를 비교해서 필터링 
			if(score.getSub().getSubId()==sub.getSubId()) {
				if(score.getSub().getSubId()==majorSubId) {//해당 점수가 전공 과목의 점수인지 비교
					grade=gradeEval[Constants.MAJOR_TYPE].grading(score.getScore());
				} else if(score.getSub().getType()==Constants.PF_TYPE) {//p/f 평가가 설정되어있으면 p/f
					grade=gradeEval[Constants.PF_TYPE].grading(score.getScore());
				}else {
					grade=gradeEval[Constants.NORMAL_TYPE].grading(score.getScore());// 그외는 일반평가
				}
				str.append(score.getScore()+"\t  ");//점수와 학점 출력은 여기서
				str.append(grade+"\t");

			}
		}
	}
	public String getViewer() {
		ArrayList<Subject> subjects=school.getSubjects();
		for(Subject sub:subjects) {
			head(sub);
			body(sub);
			Footer();
		}
		return str.toString();//각 과정에서 append된 Stringbuffer를 toString으로 출력 
	}
	
	
	
}
