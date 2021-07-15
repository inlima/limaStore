package il.com.limastore.dao;

import java.util.List;

import il.com.limastore.model.User;

public interface UserDao {

	List<User> getAllUsers();

	void deleteUser(String userId);
	
	void addUser(User user);
	
	User getUserById(String userId);
}
