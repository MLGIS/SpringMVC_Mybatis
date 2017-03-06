package cn.o.publicer.dao;

import cn.o.publicer.model.*;
import java.util.List;

import org.springframework.stereotype.Repository;


public interface UserMapper {
	void save(User user);
	boolean update(User user);
	User findByName(String name);
	boolean delete(int id);
	List<User> findAll();
}
