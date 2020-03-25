package rs.engineering.javacourse.spring_mvc_configuration_03_service;

import java.util.ArrayList;
import java.util.List;

import rs.engineering.javacourse.spring_mvc_configuration_03_dto.User;

public class UserService {
	
	private List<User> list;

	public UserService() {
		
		list = new ArrayList<User>();
	}
	
	public void save(User user) {
		list.add(user);
	}
	
	public List<User> getUsers() {
		return list;
	}
}
