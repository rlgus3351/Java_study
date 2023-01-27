package 일차원배열;

import java.util.Scanner;

public class Ex09배열실습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문자열 배열

		// 팀원 검색 프로그램
		String[] team = { "왕지강", "심형선", "김호원", "이세미", "권기현" };
		// 문제. 키보드로 부터 팀원 이름을 입력받아서 일치하는 사람이 존재한다면
		// "강규남은 2번 존재합니다."
		// 일치하는 사람이 존재하지 않는다면
		// "해당 팀원은 존재하지 않습니다.를 한번만 출력해주세요.

		// 키보드 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.print("팀원을 검색해주세요 : ");
		String answer = sc.next();

		boolean isCheck = true;

		for (int i = 0; i < team.length; i++) {
			if (answer.equals(team[i])) {
				System.out.print(answer + "은 " + (i + 1) + "번 위치에 존재합니다.");
				isCheck = false;
				break;
			}
		}
		if (isCheck) {
			System.out.println("해당 팀원은 존재하지 않습니다.");
		}
	}
}
