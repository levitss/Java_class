package kr.co.ezenac.userinfo.web;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import kr.co.ezenac.utilinterface.userinfo.UserInfoDTO;
import kr.co.ezenac.utilinterface.userinfo.dao.UserInfoDAO;
import kr.co.ezenac.utilinterface.userinfo.dao.mysql.UserInfoMysqlDAO;
import kr.co.ezenac.utilinterface.userinfo.dao.oracle.UserInfoOracleDAO;
import kr.co.ezenac.utilinterface.userinfo.dao.postgres.UserInfoPostgresDAO;

public class UserInfoClient {
	public static void main(String[] args) throws IOException  {//file not found보다 상위의 것이라 커버해줌
		
		FileInputStream fis=new FileInputStream("db.properties");//예외처리 해줘야함 1. try catch 적극적. ~~한 경우엔 이렇게 해라 2. throws 간접적
		Properties prop=new Properties(); 
		prop.load(fis);
		String dbType=prop.getProperty("DBTYPE");
		
		UserInfoDTO userinfoDTO=new UserInfoDTO();
		userinfoDTO.setId("ezen");
		userinfoDTO.setPw("q1w2e3");
		userinfoDTO.setUserName("Eze");
		
		UserInfoDAO userInfoDAO=null;
		if (dbType.equals("POSTGRES")) {
			userInfoDAO=new UserInfoPostgresDAO();//다형성
		}
		else if(dbType.equals("ORACLE")) {
			userInfoDAO=new UserInfoOracleDAO();
		}
		else if (dbType.equals("MYSQL")) {
			userInfoDAO=new UserInfoMysqlDAO();
		}
		else {
			System.out.println("ERROR");
		}
		
		userInfoDAO.insertUserInfo(userinfoDTO);
		userInfoDAO.updateUserInfo(userinfoDTO);
		userInfoDAO.selectUserInfo(userinfoDTO);
		userInfoDAO.deleteUserInfo(userinfoDTO);
		
	}
}
