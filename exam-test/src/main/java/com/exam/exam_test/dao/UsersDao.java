package com.exam.exam_test.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.exam.exam_test.model.Users;

@Repository
public interface UsersDao extends CrudRepository<Users, Integer> {

	@Query(nativeQuery = true, value = "Select * from examdb.systemeventlogs where event_user_name = :name")
	public Users getUserByUserName(@Param("name") String name);

}