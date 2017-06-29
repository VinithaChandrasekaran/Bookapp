package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.model.UserModel;

public interface UserRepository extends JpaRepository<UserModel, Integer>{
		
		@Query(value = "select * from user where username=?1 and password=?2 and active=A", nativeQuery = true)
		public UserModel findByUserNameAndPassword(String userName, String password, char c);
		
		@Query(value = "select * from user where username=?1", nativeQuery = true)
		public UserModel findByUserName(String userName);
	}

