package model;

public class quizDTO {
	private boolean isAcross;
	private String answer;
	private int row;
	private int column;
	private String question_text;

	public quizDTO() {

	}

	// 생성자
	public quizDTO(boolean isAcross, String answer, int row, int column, String question_text) {
		super();
		this.isAcross = isAcross;
		this.answer = answer;
		this.row = row;
		this.column = column;
		this.question_text = question_text;
	}

	public boolean isAcross() {
		return isAcross;
	}

	public String getAnswer() {
		return answer;
	}

	public int getRow() {
		return row;
	}

	public int getColumn() {
		return column;
	}

	public String getQuestion_text() {
		return question_text;
	}
}
