package cbc.bean;

public class Advice {

	private int id;
	private UserInfo u;
//	private int user_ID;
	private String theme;
	private String content;
	
	public Advice() {}
	
	public Advice(String theme, String content) {
		super();
//		this.user_ID = user_ID;
		this.theme = theme;
		this.content = content;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public UserInfo getU() {
		return u;
	}
	public void setU(UserInfo u) {
		this.u = u;
	}
	public String getTheme() {
		return theme;
	}
	public void setTheme(String theme) {
		this.theme = theme;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}

/*	public int getUser_ID() {
		return user_ID;
	}

	public void setUser_ID(int user_ID) {
		this.user_ID = user_ID;
	}*/
	
}
