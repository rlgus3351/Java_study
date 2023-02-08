package model;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class date {
	private int year;
	private int month;
	private int day;
	private int min;
	private int sec;
	LocalTime now = LocalTime.now();
	LocalDateTime nowDate = LocalDateTime.now();

	public date(int year, int month, int day, int min, int sec) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
		this.min = min;
		this.sec = sec;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public int getSec() {
		return sec;
	}

	public void setSec(int sec) {
		this.sec = sec;
	}

	public date(int min, int sec) {
		super();
		this.min = min;
		this.sec = sec;
	}

	public date() {

	}

	public date startTime() {
		LocalTime now = LocalTime.now();
		int sec = now.getSecond();
		int min = now.getMinute();
		date date = new date(min, sec);
		return date;
	}

	public date endTime() {
		LocalTime now = LocalTime.now();
		int sec = now.getSecond();
		int min = now.getMinute();
		date date = new date(min, sec);
		return date;
	}

	public date time_cal(date startTime, date endTime) {
		int endMin = endTime.getMin();
		int startMin = startTime.getMin();
		int totalMin = 0;
		if (endMin >= startMin) {
			totalMin = endMin - startMin;
		} else {
			totalMin = (60 + endMin) - startMin;
		}

		int sec1 = endTime.getSec();
		int sec2 = startTime.getSec();
		int totalSec = 0;
		if (sec1 >= sec2) {
			totalSec = sec1 - sec2;
		} else {
			totalSec = (60 + sec1) - sec2;
			totalMin = totalMin - 1;
		}
		
		date date = new date(totalMin, totalSec);
		return date;
	}

	public String today() {
		LocalDateTime nowDate = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		String formatedNow = nowDate.format(formatter);

		return formatedNow;

	}

}