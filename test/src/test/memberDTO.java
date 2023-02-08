package test;

import java.util.ArrayList;

public class memberDTO {

	String id;
	String pw;
	String nick;

	// 생성자

	public memberDTO() {

	}

	public memberDTO(String id, String pw, String nick) {
		super();
		this.id = id;
		this.pw = pw;
		this.nick = nick;
	}

	public String getId() {
		return id;
	}

	public String getPw() {
		return pw;
	}

	public String getNick() {
		return nick;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String toString(memberDTO dto) {
		String id = dto.getId();
		String pw = dto.getPw();
		String nick = dto.getNick();
		String result = String.format("%s/%s/%s", id, pw, nick);
		return result;
	}

}
