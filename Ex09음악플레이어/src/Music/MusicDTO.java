package Music;

public class MusicDTO {

	private String singer, title, path;

	public String getSinger() {
		return singer;
	}

	public String getTitle() {
		return title;
	}

	public String getPath() {
		return path;
	}

	public MusicDTO(String singer, String title, String path) {
		this.singer = singer;
		this.title = title;
		this.path = path;
	}

}
