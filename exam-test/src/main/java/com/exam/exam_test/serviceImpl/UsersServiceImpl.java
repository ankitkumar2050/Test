package com.exam.exam_test.serviceImpl;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.exam_test.dao.UsersDao;
import com.exam.exam_test.dto.UsersDto;
import com.exam.exam_test.model.Users;
import com.exam.exam_test.service.UsersService;
import com.exam.exam_test.util.Util;

@Service
public class UsersServiceImpl implements UsersService {

	@Autowired
	UsersDao usersDao;

	private static final Logger LOGGER = Logger.getLogger(UsersServiceImpl.class.getName());

	@Override
	public Users findUserByName(String userName) {

		String md5Val = Util.getMd5(userName);
		LOGGER.severe("MD5 Value: " + md5Val);

		return usersDao.getUserByUserName(md5Val);
	}

	@Override
	public boolean createUser(UsersDto userDto) {

		Users user = new Users();
		String md5Name = Util.getMd5(userDto.getEventUserName());

		LOGGER.severe("Name Value: " + md5Name);
		String nameHash = userDto.getEventUserName() + "-" + md5Name;
		LOGGER.severe("NameHash Value: " + nameHash);
		String md5NameHash = Util.getMd5(nameHash);
		LOGGER.severe("md5NameHash Value: " + md5NameHash);
		
		user.setEventUserName(md5Name);
		user.setEventUserMac(md5NameHash);
	
		Users userRslt = usersDao.save(user);
		LOGGER.severe("User Result : " + userRslt);

		return false;
	}

}
