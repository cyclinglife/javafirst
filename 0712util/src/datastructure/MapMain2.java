package datastructure;

import java.util.HashMap;

public class MapMain2 {

	public static void main(String[] args) {
		// 프로야규 팀 별 선수 명단을 배열로 만들기
		String[] teamsky = { "C.FROOME", "G.THOMAS", "E.BERNAL GOMEZ" };
		String[] bora_hansgrohe = { "P.SAGAN ", "M.BODNAR", "M.BURGHARDT" };
		String[] astana = { "J.FUGLSANG", "D.GRUZDEV", "J.HANSEN" };
		String[] movistar = { "N.QUINTANA", "A.AMADOR", "D.BENNATI" };
		
		//동일한 의미를 갖는 배열들을 묶을 때 바로 배열이나 리스트로 묶는 것은 바람직하지 않습니다.
		//배열이나 리스트는 인덱스를 가지고 구분을 하기 때문에 의미를 부여하지 못합니다.
		//배열이나 리스트를 다시 배열이나 리스트로 묶을 때는 먼저 Map으로
		//의미를 부여해서 묶은 다음 다시 배열이나 리스트로 묶으라고 합니다.
		
		HashMap <String, Object> map1 =
				new HashMap<>();
		map1.put("team","TEAM SKY");
		map1.put("data", teamsky);
		
		HashMap <String, Object> map2 =
				new HashMap<>();
		map2.put("team","BORA HANSGROHE");
		map2.put("data", bora_hansgrohe);
		
		HashMap <String, Object> map3 =
				new HashMap<>();
		map3.put("team","ASTANA");
		map3.put("data", astana);
		
		HashMap <String, Object> map4 =
				new HashMap<>();
		map4.put("team","MOVISTAR");
		map4.put("data", movistar);
		
		//HashMap의 배열
		HashMap[] players = { map1, map2, map3, map4 };

		for (int i = 0; i < players.length; i = i + 1) {
			HashMap temp = players[i];
			// 팀 이름 출력
			System.out.printf("%-15s :  ",temp.get("team"));
			// 선수명단 가져오기
			// 출력을 할 때는 get 한 데이터를 형변환 하지 않지만
			// 저장을 하거나 사용을 할 때는 원래의 자료형으로 강제 형 변환을
			// 해서 사용합니다.
			String[] temp2 = (String[]) temp.get("data");
			for (int j = 0; j < temp2.length; j = j + 1) {
				System.out.print(temp2[j] + "\t");
			}
			System.out.println("");
		}
		
/*
		// String 배열의 배열로 묶기
		String[][] players = { teamsky, bora_hansgrohe, astana, movistar };

		// 2차원 배열의 데이터 출력
		// 큰 배열에 포함된 작은 배열의 데이터 개수만큼 반복
		for (int i = 0; i < players.length; i = i + 1) {
			if (i == 0) {
				System.out.print("TEAM SKY : "+"\t\t");
			} else if (i == 1) {
				System.out.print("BORA HANSGROHE : "+"\t");
			} else if (i == 2) {
				System.out.print("ASTANA : "+"\t\t");
			}else if (i == 3) {
				System.out.print("MOVISTAR" + "\t");
			}

			// 배열의 데이터 출력
			String[] temp = players[i];
			for (int j = 0; j < temp.length; j = j + 1) {
				System.out.print(temp[j] + "\t");
			}
			System.out.println("");
		}
		*/
	}
}
