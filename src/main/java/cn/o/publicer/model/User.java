package cn.o.publicer.model;

import org.apache.ibatis.type.Alias;
import org.springframework.stereotype.Repository;


@Alias("User")
public class User {
	private int id;
	private String userName;
	private String pwd;//使用访问器访问属性，访问器第一个字母大写，其他小写，否则访问不到
	private String name;
	private String sfzh;
	private int zzjgbh;
	private String mail;
	private int typeID;
	public User(){
		super();
	}
	
	public User(String username,String pwd,String name){
		super();
		this.userName=username;
		this.pwd=pwd;
		this.name=name;
	}
	
	public int getId(){
		return id;
	}
	public void setId(int id){
		this.id=id;
	}
	
	public String getUserName(){
		return userName;
	}
	public void setUserName(String userName){
		this.userName=userName;
	}
	
	public String getPwd(){
		return pwd;
	}
	public void setPwd(String pwd){
		this.pwd=pwd;
	}
	
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	
	public String getSFZH(){
		return sfzh;
	}
	public void setSFZH(String sfzh){
		this.sfzh=sfzh;
	}
	
	public String getMail(){
		return mail;
	}
	public void setMail(String mail){
		this.mail=mail;
	}
	
	public int getZZJGBH(){
		return zzjgbh;
	}
	public void setZZJGBH(int zzjgbh){
		this.zzjgbh=zzjgbh;
	}
	
	public int getTypeId(){
		return typeID;
	}
	public void setTypeId(int typeid){
		this.typeID=typeid;
	}

}
