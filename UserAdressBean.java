package adress;

import java.io.Serializable;

//Beanクラス

public class UserAdressBean  implements Serializable{

	private static final long serialVersionUID = 1L;

	private String postNumber;
	private String userName;

	public UserAdressBean() {
		this.postNumber="";
		this.userName= "";
	}

	public String getPostNumber() {
		return postNumber;
	}

	public void setPostNumber(String postNumber) {
		this.postNumber = postNumber;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String username) {
		this.userName = username;
	}
}

