package cn.o.publicer.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import cn.o.publicer.dao.UserMapper;
import cn.o.publicer.model.User;
import cn.o.publicer.service.UserService;

@Repository
@Service("userService")
public class UserServiceimpl implements UserService {

	@Resource
	private UserMapper mapper;
	

	public void save(User user) {
		// TODO Auto-generated method stub
		mapper.save(user);
	}


	public boolean update(User user) {
		// TODO Auto-generated method stub
		return mapper.update(user);
	}


	public User findByName(String name) {
		// TODO Auto-generated method stub
		return mapper.findByName(name);
	}


	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return mapper.delete(id);
	}


	public List<User> findAll() {
		// TODO Auto-generated method stub
		return mapper.findAll();
	}

}
