package javaProject;

import java.util.ArrayList;
import java.util.Scanner;

import model.date;
import model.quizDAO;
import model.quizDTO;
import model.rankDAO;
import model.rankDTO;
import model.userDAO;
import model.userDTO;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		date date = new date();
		date startTime = null;
		date endTime = null;
		date endDate = null;
		rankDAO rankDAO = new rankDAO();

		System.out.println("==========가로 세로 퀴즈 프로그램========");
		while (true) {
			System.out.print("+------------+----------+---------+\r\n" + "| [1] 회원 가입 | [2] 로그인 | [3] 종료 | \r\n"
					+ "+------------+----------+---------+ ");
			System.out.print("입력 >> ");
			int choice = sc.nextInt();
			if (choice == 1) {
				// 회원가입
				userDAO dao = new userDAO();
				String id = null;
				System.out.println("| 회원 가입을 진행하겠습니다. |");
				System.out.println("+---------------------+ ");
				while (true) {
					System.out.print("사용하실 ID를 입력해주세요 : ");
					System.out.print("입력 >> ");
					id = sc.next();
					userDTO uDTO = dao.userCheck(id); // 아이디 검색하여 해당 값이 존재하면 중복된 아이디, null이면 사용가능한 id
					if (uDTO != null) {
						System.out.println("중복된 아이디가 존재합니다.");
					} else {
						System.out.println("사용하실 수 있는 아이디입니다.");
						break;
					}
				}
				System.out.println("+---------------------------------+ ");
				System.out.print("사용하실 PW를 입력해주세요 : ");
				System.out.print("입력 >> ");
				String pw = sc.next();
				System.out.println("+---------------------------------+ ");
				String birth_date = date.today();
				int row = dao.join(id, pw, birth_date);
				if (row > 0) {
					System.out.println("저희와 함께하실 수 있습니다!!!");
				} else {
					System.out.println("저희와 함께하실 수 없습니다...");
					System.out.println("+---------------------------------+ ");
				}

			} else if (choice == 2) {
				// 로그인

				System.out.print("ID 입력 : ");
				String id = sc.next();
				System.out.println("+---------------------------------+ ");
				System.out.print("PW 입력 : ");
				String pw = sc.next();

				// 로그인 메소드 사용

				userDAO dao = new userDAO();

				userDTO dto = dao.login(id, pw);

				// 로그인 성공 유무 판단.
				if (dto != null) {
					System.out.println("+---------------------------------+ ");
					System.out.println("로그인 성공.");
					System.out.printf("%s님 환영합니다~\n", dto.getId());
					while (true) {
						System.out.print("+------------+------------+-------------+\r\n"
								+ "| [1] 문제 풀기 | [2] 랭킹 조회 | [3] 이전 메뉴 | \r\n"
								+ "+------------+------------+-------------+ ");
						System.out.print("입력 >> ");
						int choice2 = sc.nextInt();
						if (choice2 == 1) {
							// 문제 풀이 ( 문제 보여주고 입력받기)
							int score = 0;
							int[] step = { 1, 10, 100 };
							while (true) {
								// 문제 푸는거
								System.out.print("+---------+--------+---------+-------------+\r\n"
										+ "| [1] 초급 | [2] 중급 | [3] 고급 |  [4] 이전 메뉴 |\r\n"
										+ "+---------+--------+---------+-------------+ ");
								System.out.print("입력 >> ");
								int choice3 = sc.nextInt();
								if (choice3 == 1) {
									// 변수 ++;
									startTime = date.startTime();
									int answerCnt = quizView(step[0]);
									if (answerCnt != 0) {
										break;
									}

									int row = insertRank(id, startTime, choice3);
									step[0]++;
									if (row > 0) {
										System.out.println("+---------------------+ ");
										System.out.println("랭킹 등록 성공");

									} else {
										System.out.println("+---------------------+ ");
										System.out.println("랭킹 등록 실패");
									}
									if (step[0] > 3) {
										step[0] = 1;
									}

								} else if (choice3 == 2) {
									// 변수 10;
									startTime = date.startTime();
									int answerCnt = quizView(step[1]);
									if (answerCnt != 0) {
										break;
									}

									int row = insertRank(id, startTime, choice3);
									step[1]++;
									if (row > 0) {
										System.out.println("+---------------------+ ");
										System.out.println("랭킹 등록 성공");
									} else {
										System.out.println("+---------------------+ ");
										System.out.println("랭킹 등록 실패");
									}
									if (step[1] > 14) {
										step[1] = 10;
									}
								} else if (choice3 == 3) {
									startTime = date.startTime();
									int answerCnt = quizView(step[2]);
									if (answerCnt != 0) {
										break;
									}

									int row = insertRank(id, startTime, choice3);
									step[2]++;
									if (row > 0) {
										System.out.println("+---------------------+ ");
										System.out.println("랭킹 등록 성공");
									} else {
										System.out.println("+---------------------+ ");
										System.out.println("랭킹 등록 실패");
									}
									if (step[2] > 104) {
										step[2] = 100;
									}

								} else if (choice3 == 4) {
									System.out.println("이전 메뉴로 돌아갑니다");
									break;
								} else {
									// 다른 숫자 입력시
									System.out.println("+---------------------+ ");
									System.out.println("다시입력하세요.");
								}
							}

						} else if (choice2 == 2) {
							rankDAO rankDao = new rankDAO();

							System.out.println("조회할 등급을 선택하세요.");
							System.out.print("+---------+--------+---------+\r\n" + "| [1] 초급 | [2] 중급 | [3] 고급 | \r\n"
									+ "+---------+--------+---------+ ");
							System.out.print("입력 >> ");
							int level_no = sc.nextInt();
							ArrayList<rankDTO> rank = rankDao.selectAll(level_no);
							// 가져온 데이터 출력
							// 열이름 출력
							System.out.print("+--------+---------+---------+\r\n" + "| [1] ID | [2] 문제 | [3] 기록 | \r\n"
									+ "+--------+---------+---------+ \r\n");
							for (int i = 0; i < rank.size(); i++) {
								System.out.print(rank.get(i).getId() + "\t");
								System.out.print(rank.get(i).getLevel_no() + "\t");
								System.out.print(rank.get(i).getTime() + "\t");
								System.out.println();
							}

						} else if (choice2 == 3) {
							// 종료
							System.out.println("이전 메뉴로 돌아갑니다.");
							break;
						}
					}

				} else {

					System.out.println("아이디나 비밀번호를 다시 확인해주세요.");
				}

			} else if (choice == 3) {
				System.out.println("종료합니다.");
				break;
			} else {
				// 다른 숫자 입력시
				System.out.println("다시입력하세요.");
			}

		}

	}

	public static int quizView(int step) {

		Scanner sc = new Scanner(System.in);

		quizDAO quizDAO = new quizDAO();
		ArrayList<quizDTO> questionList = new ArrayList<>();

		// DB에서 문제 번호에 맞는 문제 가져오기
		questionList = quizDAO.getQuiz(step);
		int cnt = questionList.size();
		// 십자말풀이 판 만들기
		String[][] gameBorad = quizDAO.makeBroad(step, questionList);

		while (true) {
			// 문제판 출력
			for (int i = 0; i < gameBorad.length; i++) {
				for (int j = 0; j < gameBorad.length; j++) {
					System.out.print(gameBorad[i][j]);
				}
				System.out.println();
			}

			// 문제들 출력
			System.out.println();
			System.out.println("가로");
//			System.out.println("+---------------------------------+ ");
			for (int i = 0; i < questionList.size(); i++) {
				if (questionList.get(i).isAcross())
					System.out.println(questionList.get(i).getQuestion_text());
			}

			System.out.println();
			System.out.println("세로");
//			System.out.println("+---------------------------------+ ");
			for (int i = 0; i < questionList.size(); i++) {
				if (!questionList.get(i).isAcross())
					System.out.println(questionList.get(i).getQuestion_text());
			}

			if (questionList.size() <= 0) {
				System.out.println("퀴즈를 완료하였습니다");
				break;
			}

			System.out.println("알것같은 문제의 정답을 입력해주세요");
			System.out.print("중도 포기시 x를 입력해주세요. >> ");
			String answer = sc.next();

			if (answer.equals("x") || answer.equals("X")) {
				break;
			}
			System.out.printf("\n\n\n\n\n");
			// 정답 맞는지 확인, 맞았으면 gameBorad에 표시
			boolean getWrong = true;
			for (int i = 0; i < questionList.size(); i++) {
				if (questionList.get(i).getAnswer().equals(answer)) {
					gameBorad = quizDAO.putAnswer(gameBorad, questionList.get(i));
					questionList.remove(i);
					getWrong = false;
					System.out.println("정답입니다.");
					break;
				}
			}
			if (getWrong)
				System.out.println("아쉽지만 정답이 아닙니다");
		}

		// 남은 문제의 개수 리턴
		return questionList.size();
	}

	public static int insertRank(String id, date startTime, int level_no) {

		date date = new date();
		rankDAO rankDAO = new rankDAO();
		date endTime = date.endTime();
		System.out.println("종료합니다.");
		date endDate = date.time_cal(startTime, endTime);
		System.out.printf("경과 시간 : %d분 %d초\n", endDate.getMin(), endDate.getSec());
		String time = null;
		if (endDate.getSec() / 10 < 1) {
			time = String.format("%d분 0%d초", endDate.getMin(), endDate.getSec());
		} else {
			time = String.format("%d분 %d초", endDate.getMin(), endDate.getSec());
		}

		int row = rankDAO.rankInsert(id, level_no, time);

		return row;
	}

}
