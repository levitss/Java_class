package kr.co.ezenac.project.school.view;


import java.util.ArrayList;

import kr.co.ezenac.project.grade.BasicEvaluation;
import kr.co.ezenac.project.grade.ExtraEvaluation;
import kr.co.ezenac.project.grade.GradeEvaluation;
import kr.co.ezenac.project.grade.MajorEvaluation;
import kr.co.ezenac.project.school.School;
import kr.co.ezenac.project.school.Score;
import kr.co.ezenac.project.school.Student;
import kr.co.ezenac.project.school.Subject;
import kr.co.ezenac.project.utils.Constants;

public class GenerateGradeDisplay {
	
	School school=School.getInctance();
	public static final String TITLE="과목 학점 결과>>>\n";
	public static final String LINE="------------------------------------------------------------------\n";
	public static final String HEADER="이름\t학번\t  필수\t점수\t학점\n";
	public static final String LINE2="=================================================================\n";
	private StringBuffer str=new StringBuffer();
	
	public void makeHeader(Subject sub) {
		str.append(sub.getSubjectName()+" ");
		str.append(GenerateGradeDisplay.TITLE);
		str.append(GenerateGradeDisplay.LINE);
		str.append(GenerateGradeDisplay.HEADER);
		str.append(GenerateGradeDisplay.LINE);
		
	}
	public void makeBody(Subject sub) {
		ArrayList<Student> student=sub.getStudents();
		for (int i=0;i<student.size();i++) {
			Student st=student.get(i);
			str.append(st.getStudentName()+"\t");
			str.append(st.getStudentId()+"  ");
			str.append(st.getMajorSub().getSubjectName()+"\t");
			getScoreGrade(st, sub);//학생별 해당과목 학점		
			str.append("\n");	
		}
		
		
	}
	private void getScoreGrade(Student st, Subject sub) {
		ArrayList<Score> scoreList= st.getScores();
		int majorId=st.getMajorSub().getSubjectId();
		//학점 평가 클래스들
		GradeEvaluation[] gradeEval= {new BasicEvaluation(), new MajorEvaluation(),new ExtraEvaluation()};
		//학생의 점수들
		for (int i=0; i<scoreList.size();i++) {
			Score score=scoreList.get(i);
			//현재 학점을 산출할 과목
			//현재 점수에 있는 과목아이디와 산출할 과목 아이디 비교
			if(score.getSubject().getSubjectId()==sub.getSubjectId()) {
				String grade;
				if(score.getSubject().getSubjectId()==majorId) {
					grade=gradeEval[Constants.SAB_TYPE].getGrade(score.getScore());
				}
				else if (score.getSubject().getGradeType()==1){
					grade=gradeEval[Constants.EAB_TYPE].getGrade(score.getScore());
				}
				else {
					grade=gradeEval[Constants.AB_TYPE].getGrade(score.getScore());
				}
					
				str.append(score.getScore()+"\t");
				str.append(grade+"\t");
			}
			
		}
		
		
	}
	public void makeFooter() {
		str.append(GenerateGradeDisplay.LINE2);
		str.append("\n");
	}

	
	public String getDisplay() {
		ArrayList<Subject> subjects=school.getSubjects();
		for(Subject sub:subjects) {
			makeHeader(sub);
			makeBody(sub);
			makeFooter();
		}
		return str.toString();
	}
	
	
	
}

