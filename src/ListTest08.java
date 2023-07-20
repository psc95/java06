import java.util.ArrayList;

/* 자바 컬렉션에서 제네릭(지네릭스:jdk1.5에서 추가된 문법)이 추가된 이유)
 *  1.컬렉션은 복수개의 자료형 값이 동시 저장되다 보니 자료의 안정성도 떨어진다. 저장되는 값도 모두 자바 최상위 부모클래스인
 *  Object타입으로 업캐스팅이 되어져서 저장된다. 그러다 보니 불필요한 업캐스팅과 다운캐스팅 레퍼런스간의 형변환이 발생해서
 *  프로그램 실행속도를 저하시키는 원인이 된다.
 *  
 *  2.제네릭을 지정하지 않으면 원하는 자료형 값 추출도 어렵다.
 */
public class ListTest08 {
	public static void main(String[] args) {

		ArrayList cityList=new ArrayList();
		cityList.add("seoul");//불필요하게 Object타입으로 업캐스팅이 되어져서 저장된다.
		cityList.add("busan");
		cityList.add("suwon");
		
		System.out.println("도시 개수 : "+cityList.size());
		
		String result;
		for(int i=0;i<cityList.size();i++) {
			result=(String)cityList.get(i);//get()메서드로 원소값을 가져와서 불필요한 다운캐스팅
			System.out.println("영문대문자로 변경한 도시이름:"+result.toUpperCase());
		}//for
	}
}
