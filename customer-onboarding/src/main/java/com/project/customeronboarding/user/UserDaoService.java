package com.project.customeronboarding.user;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {
	
private static List<User> users = new ArrayList<>();

private static int usersCount = 0;
	
	static {
		users.add(new User(++usersCount,"Adam","adam@email.com","pass1"));
		users.add(new User(++usersCount,"Eve","eve@email.com","pass2"));
	}
	
	public List<User> findAll() {
		return users;
	}
	
	public User save(User user) {
		user.setId(++usersCount);
		users.add(user);
		return user;
	}
	
	public User findOne(int id) {
		Predicate<? super User> predicate = user -> user.getId().equals(id); 
		return users.stream().filter(predicate).findFirst().orElse(null);
	}

}
