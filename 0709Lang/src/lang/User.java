package lang;

import java.util.Arrays;

public class User {
	private int num;
	private String name;
	private String [] hobbies;
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String[] getHobbies() {
		return hobbies;
	}
	public void setHobbies(String[] hobbies) {
		this.hobbies = hobbies;
	}
	@Override
	public String toString() {
		return "User [num=" + num + ", name=" + name + ", hobbies=" + Arrays.toString(hobbies) + "]";
	}

	//현재 인스턴스를 이용해서 새로운 인스턴스를 만들어주는 메소드
	public User clone() {
		User user = new User();
		user.num = this.num;
		user.name = this.name;
		//user.hobbies = this.hobbies;
		user.hobbies = new String[this.hobbies.length];
		for(int i=0; i<this.hobbies.length; i=i+1) {
			user.hobbies[i]=this.hobbies[i];
		}
		return user;
		
		
	}
}
