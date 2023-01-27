package Music;

import java.util.ArrayList;

public class MusicDAO {

	private ArrayList<MusicDTO> musicList;

	//select 절을 썻을 때 5가지 리스트를 볼 때.
	public ArrayList<MusicDTO> select(){
		
		
		musicList = new ArrayList<>();
		
		musicList.add(new MusicDTO("뉴진스", "Hype boy", "C:/mp3/뉴진스-HypeBoy.mp3"));
		musicList.add(new MusicDTO("르세라핌", "Antifragile", "C:/mp3/르세라핌-Antifragile.mp3"));
		musicList.add(new MusicDTO("아이브", "LoveDive", "C:/mp3/아이브-LoveDive.mp3"));
		musicList.add(new MusicDTO("윤하", "사건의지평선", "C:/mp3/윤하-사건의지평선.mp3"));
		musicList.add(new MusicDTO("카라", "WhenIMove", "C:/mp3/카라-WhenIMove.mp3"));
		
		return musicList;
	}

	
}
