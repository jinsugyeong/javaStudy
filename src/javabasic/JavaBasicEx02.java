package javabasic;

class UserDto {
	private String userCode;
	private String userName;
	private int userAge;
	public String getUserCode() {
		return userCode;
	}
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getUserAge() {
		return userAge;
	}
	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}
	@Override
	public String toString() {
		return "UserDto [userCode=" + userCode + ", userName=" + userName + ", userAge=" + userAge + "]";
	}
}

class UserService {
	private UserDto ud;
	/*public UserService() {
		ud = new UserDto();
	}*/
	
	public UserService addUserProcess(UserDto ud) {
		
		this.ud = ud;
		
		/*this.ud.setUserName(ud.getUserName());
		this.ud.setUserAge(ud.getUserAge());*/
		if(ud.getUserCode()!=null) {
			int code = Integer.parseInt(ud.getUserCode())+1;
			String codeStr = code<10 ? "000"+code : "00"+code;
			this.ud.setUserCode(codeStr);
		}else {			
			this.ud.setUserCode("0001");
		}
		return this;
	}
	
	public UserDto getUser() {
		return ud;
	}
}

public class JavaBasicEx02 {

	public static void main(String[] args) {
		
		//사용자가 넘긴 값이라는 가정
		String userName = "홍길동";
		int userAge = 20;
		
		UserService us	= new UserService();
		UserDto ud 		= new UserDto();
		
		ud.setUserName(userName);
		ud.setUserAge(userAge);
		System.out.println(ud.toString());
		//UserDto [userCode=null, userName=홍길동, userAge=20]
		
		UserDto ud2 = us.addUserProcess(ud).getUser();
		System.out.println(ud2.toString());
		//UserDto [userCode=0001, userName=홍길동, userAge=20]

	}

}
