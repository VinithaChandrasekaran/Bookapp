package com.example.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Repository.UserRepository;
import com.example.model.UserModel;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;

	public UserModel findByUserNameAndPassword(String userName, String password) {
		UserModel user = userRepository.findByUserName(userName);
		return userRepository.findByUserNameAndPassword(userName, user.getPassword(),'v');
	}

	public List<UserModel> findAll() 
	{
		return userRepository.findAll();
		}
	public UserModel findOne(int id) {
		return userRepository.findOne(id);
	}

}

