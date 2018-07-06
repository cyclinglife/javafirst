package sharedata;

public class Map {
	private double latitude;
	private double longitude;

	


	public double getLatitude() {
		return latitude;
	}




	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}




	public double getLongitude() {
		return longitude;
	}




	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}




	//지도를 출력하는 메소드
	public void showMap() {
		System.out.println("위도:"+latitude+"\n경도:"+longitude+
				"위치의 지도를 출력합니다.");
	}

}
