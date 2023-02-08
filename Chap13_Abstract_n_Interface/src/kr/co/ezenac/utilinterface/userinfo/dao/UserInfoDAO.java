package kr.co.ezenac.utilinterface.userinfo.dao;

import kr.co.ezenac.utilinterface.userinfo.UserInfoDTO;

public interface UserInfoDAO {
	void insertUserInfo(UserInfoDTO userInfoDTO);
	void selectUserInfo(UserInfoDTO userInfoDTO);
	void updateUserInfo(UserInfoDTO userInfoDTO);
	void deleteUserInfo(UserInfoDTO userInfoDTO);
}
