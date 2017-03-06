package cn.o.hin.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import cn.o.hin.entity.User;

@Repository
public interface UserDao {

	public User login(User user);
	
	public User getUserById(int id);
	
	public List<User> getAllUsers();

    public void addUser(String userName);

    public void deleteUser(String userName);

    public void deleteAll();
}
