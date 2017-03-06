package cn.o.publicer.service;

import java.util.List;

import org.springframework.stereotype.Repository;

import cn.o.publicer.model.User;

public interface UserService {
	void save(User user);
	boolean update(User user);
	User findByName(String name);
	boolean delete(int id);
	List<User> findAll();
}