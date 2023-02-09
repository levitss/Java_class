package kr.co.ezenac.utilinterface.userinfo.dao.oracle;

import kr.co.ezenac.utilinterface.userinfo.UserInfoDTO;
import kr.co.ezenac.utilinterface.userinfo.dao.UserInfoDAO;

public class UserInfoOracleDAO implements UserInfoDAO{

	@Override
	public void insertUserInfo(UserInfoDTO userInfoDTO) {
		// TODO Auto-generated method stub
		System.out.println("insert into Oracle DB user id=" + userInfoDTO.getId());
	}

	@Override
	public void selectUserInfo(UserInfoDTO userInfoDTO) {
		// TODO Auto-generated method stub
		System.out.println("select into Oracle DB user id=" + userInfoDTO.getId());
		
	}

	@Override
	public void updateUserInfo(UserInfoDTO userInfoDTO) {
		// TODO Auto-generated method stub
		System.out.println("update into Oracle DB user id=" + userInfoDTO.getId());
	}

	@Override
	public void deleteUserInfo(UserInfoDTO userInfoDTO) {
		// TODO Auto-generated method stub
		System.out.println("delete into Oracle DB user id=" + userInfoDTO.getId());
	}
	
}
