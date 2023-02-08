package model;

public class rankDTO {
	private String id;
	private int level_no;
	private String time;

	public rankDTO() {

	}

	public rankDTO(String id, int level_no, String time) {
		super();
		this.id = id;
		this.level_no = level_no;
		this.time = time;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getLevel_no() {
		return level_no;
	}

	public void setLevel_no(int level_no) {
		this.level_no = level_no;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}
}
