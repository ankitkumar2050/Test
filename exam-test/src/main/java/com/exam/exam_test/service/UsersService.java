package com.exam.exam_test.service;

import com.exam.exam_test.dto.UsersDto;
import com.exam.exam_test.model.Users;

public interface UsersService {

	Users findUserByName(String userName);
	
	boolean createUser(UsersDto user);
}
