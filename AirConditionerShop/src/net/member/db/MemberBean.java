package net.member.db;

import java.sql.Date;

public class MemberBean {
	
	private int num;//회원 번호
	private String id;//아이디
	private String password;//패스워드
	private String name;//이름
	private String email;//이메일
	private String phone;//휴대폰 번호
	private Date birthDate;//생년월일
	private String address;//주소
	
	//setter & getter
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	//toString
	@Override
	public String toString() {
		return "MemberBean [num=" + num + ", id=" + id + ", password=" + password + ", name=" + name + ", email="
				+ email + ", phone=" + phone + ", birthDate=" + birthDate + ", address=" + address + "]";
	}
	
	
	
}
