package kr.co.ezenac.utilinterface.userinfo.dao.postgres;

import kr.co.ezenac.utilinterface.userinfo.UserInfoDTO;
import kr.co.ezenac.utilinterface.userinfo.dao.UserInfoDAO;

public class UserInfoPostgresDAO implements UserInfoDAO{

	@Override
	public void insertUserInfo(UserInfoDTO userInfoDTO) {
		// TODO Auto-generated method stub
		System.out.println("insert"+userInfoDTO.getId());		
	}

	@Override
	public void selectUserInfo(UserInfoDTO userInfoDTO) {
		// TODO Auto-generated method stub
		System.out.println("select"+userInfoDTO.getId());	}

	@Override
	public void updateUserInfo(UserInfoDTO userInfoDTO) {
		// TODO Auto-generated method stub
		System.out.println("update"+userInfoDTO.getId());	}

	@Override
	public void deleteUserInfo(UserInfoDTO userInfoDTO) {
		// TODO Auto-generated method stub
		System.out.println("delete"+userInfoDTO.getId());	}
	

}

//207까지  	30분