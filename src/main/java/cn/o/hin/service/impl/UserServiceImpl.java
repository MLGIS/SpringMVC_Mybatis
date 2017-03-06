package cn.o.hin.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import cn.o.hin.dao.UserDao;
import cn.o.hin.entity.User;
import cn.o.hin.service.UserService;


@Repository
@Service("userService")
public class UserServiceImpl implements UserService{

	//public List<User> userList = getAllUsers();
	
	@Resource
	private UserDao userDao;
	
	public User login(User user) {
		return userDao.login(user);
	}
	
	public User getUserById(int id) {
		return userDao.getUserById(id);
	}
	
	public List<User> getAllUsers(){
		return userDao.getAllUsers();
	}

    public void addUser(String userName){
    	userDao.addUser(userName);
    }

    public void deleteUser(String userName){
    	userDao.deleteUser(userName);
    }

    public void deleteAll(){
    	userDao.deleteAll();
    }

}
