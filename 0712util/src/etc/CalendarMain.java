package etc;

import java.util.Calendar;

public class CalendarMain {

	public static void main(String[] args) {
		// 1988년 2월 10일을 Calendar 객체로 만들기
		Calendar birthday = Calendar.getInstance();
		birthday.set(Calendar.YEAR, 1988);
		birthday.set(Calendar.MONTH, 1);
		birthday.set(Calendar.DAY_OF_MONTH, 5);
		// System.out.println(birthday);
		// Date date = new Date(birthday.getTimeInMillis());
		// System.out.print.println(date);

		Calendar today = Calendar.getInstance();
		long gap = today.getTimeInMillis() - birthday.getTimeInMillis();
		System.out.println("태어난지 " + (gap / 24 / 60 / 60 / 1000) + "일 째 되는 날입니다.");
	}

}
