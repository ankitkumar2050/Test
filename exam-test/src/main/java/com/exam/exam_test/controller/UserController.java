package com.exam.exam_test.controller;

import java.util.logging.Logger;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.exam.exam_test.dto.SingleResultDto;
import com.exam.exam_test.dto.UsersDto;
import com.exam.exam_test.model.Users;
import com.exam.exam_test.service.UsersService;

@RestController
@RequestMapping("/examsrvr/blu/main/service")
public class UserController {

	@Autowired
	private UsersService userServices;

	private static final Logger LOGGER = Logger.getLogger(UserController.class.getName());

	/**
	 * User search by Name
	 * 
	 * @param name
	 * @return
	 */
	@RequestMapping(value = "/usersearch", method = RequestMethod.GET)
	public ResponseEntity<?> userSearch(@RequestParam(name = "name") String name) {

		LOGGER.severe("Name: " + name);

		Users user = userServices.findUserByName(name);
		if (user != null) {
			return new ResponseEntity<>(new SingleResultDto("success", "", ""), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(new SingleResultDto("error", "", ""), HttpStatus.BAD_REQUEST);
		}

	}

	/**
	 * For Create user (It was not in the requirement but I have added just for
	 * demo.)
	 * 
	 * @param user
	 * @param httpHeaders
	 * @return
	 */
	@RequestMapping(value = "/usersubmit", method = RequestMethod.POST)
	public ResponseEntity<?> userSubmit(@Valid @RequestBody UsersDto user, @RequestHeader HttpHeaders httpHeaders) {

		LOGGER.severe("Name: " + user.getEventUserName());

		userServices.createUser(user);

		return new ResponseEntity<>(new SingleResultDto("success", "", ""), HttpStatus.OK);
	}

}