package evaluation_project.ui;

import java.util.ArrayList;

import evaluation_project.constants.Constants;
import evaluation_project.school.School;
import evaluation_project.school.Score;
import evaluation_project.school.Student;
import evaluation_project.school.Subject;
import evaluation_project.school.view.Viewer;

public class UiMain {
	School school=School.getInstance();//singleton
	Viewer viewer=new Viewer();
	/////////////과목 목록
	Subject math;
	Subject korean;
	Subject soccer;
	/////////////
	private void inputStudent() {//학생정보 입력
		Student st1=new Student("손흥민", 231112, soccer);
		Student st2=new Student("김민재", 231113, korean);
		Student st3=new Student("이강인", 231114, korean);
		Student st4=new Student("황희찬", 231115, soccer);
		Student st5=new Student("황의조", 231116, soccer);
		
		ArrayList<Student>stList=new ArrayList<>();
		stList.add(st1);
		stList.add(st2);
		stList.add(st3);
		stList.add(st4);
		stList.add(st5);
		
		
		for(int i=0; i<stList.size();i++) {
			school.setStudents(stList.get(i));		//school 에 학생 등록
			korean.setStudents(stList.get(i));		//각 subject에 학생 등록
			soccer.setStudents(stList.get(i));
			//수학은 선택과목이니 따로 입력
		}
		math.setStudents(st1);
		math.setStudents(st2);
		math.setStudents(st5);
		
		//성적 입력
		addScore(st1, korean, 100);
		addScore(st2, korean, 95);
		addScore(st3, korean, 90);
		addScore(st4, korean, 75);
		addScore(st5, korean, 60);
		
		addScore(st1, soccer, 100);
		addScore(st2, soccer, 95);
		addScore(st3, soccer, 90);
		addScore(st4, soccer, 75);
		addScore(st5, soccer, 60);
		
		addScore(st1, math, 100);
		addScore(st2, math, 70);
		addScore(st5, math, 50);
		
		
		
		

	}
		private void inputSubject() {//과목정보 입력
		korean=new Subject(Constants.KOREAN, "국어");
		soccer=new Subject(Constants.SOCCER, "축구");
		math=new Subject(Constants.MATH, "수학");
		math.setType(Constants.PF_TYPE);//수학은 pf평가
		school.setSubjects(korean);
		school.setSubjects(soccer);
		school.setSubjects(math);
	}
		public void addScore(Student student,Subject subject,int score) {
			Score score_=new Score(student.getStId(), subject, score);
			student.setScores(score_);
			
		}
	

	public static void main(String[] args) {
		UiMain main=new UiMain();
		main.inputSubject();
		main.inputStudent();
		System.out.println(main.viewer.getViewer());
	}
	}
