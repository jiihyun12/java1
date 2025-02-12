package castingTask1;


public class CastingTask {
// 넷플릭스
// 애니메이션, 영화, 드라마 --> 클래스 생성 필요시 +@ 클래스 생성
// 사용자가 선택한 영상이 애니메이션이라면 "자막 지원"기능 사용 (출력)
// 영화라면 "4D" 기능 사용 (출력)
// 드라마라면 "굿즈" 기능 사용 (출력)
	
	public void checkVideo(Video video) {
//		분류
		if(video instanceof Drama) { // 드라마인지 확인   video가 Drama 객체라면 true
			Drama drama = (Drama)video; // 다운캐스팅 (부모 -> 자식)
			drama.sellGoods(); // 드라마 기능 실행 (굿즈 판매)
		} else if(video instanceof Animation) { // 애니메이션인지 확인  video가 Animation 객체라면 true
			Animation animation = (Animation)video; // 다운캐스팅
			animation.showSubTitle();
		} else if(video instanceof Film) { // 영화인지 확인  video가 Film 객체라면 true
			Film film = (Film)video; // 다운캐스팅
			film.shakeChair();
		}
	}
	
	public static void main(String[] args) {
		CastingTask ct = new CastingTask();
		ct.checkVideo(new Drama());
		ct.checkVideo(new Film());
		ct.checkVideo(new Animation());
		
	}
	
}
