import java.util.ArrayList;

/* 제네릭 타입간 형변환을 허용하기 위한 첫번째 제네릭 타입 와일드 카드 문법
 * */
public class ListTest13 {
	public static void main(String[] args) {

		ArrayList<String> cityName=new ArrayList<String>();
		
		cityName.add("seoul");
		cityName.add("incheon");
		cityName.add("busan");
		
		ArrayList<? extends Object> objList;
		/* <? extends Object> 제네릭 타입 형변환 와일드 카드 문법형식은 
		 * Object을 상속받은 자손은 제네릭 타입간의 형변환을 허용하겠다는 의미
		 */
		objList =  cityName; //제네릭 타입간의 업캐스팅이 됨.
		
		for(Object obj:objList) {
			String cityname = (String) obj;//명시적인 다운캐스팅
			System.out.println(cityname.toUpperCase());//도시이름을 영문대문자로 변경
		}
	}
}
