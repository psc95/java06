import java.util.ArrayList;
import java.util.List;

/* java.util패키지의 컬렉션 인터페이스 List 특징)
 *  1.복수개의 원소값,복수개의 자료형을 동시 저장 가능하다. 가변적 크기이다.
 *  2.저장되는 순서를 유지한다.
 *  3.중복원소값을 허용한다. 실제 가장 많이 사용되고 중요한 컬렉션에 해당한다.
 *  4.제일 중요한 것은 List 컬렉션 인터페이스를 구현한 컬렉션 클래스 ArrayList이다.
 */
public class ListTest02 {
	public static void main(String[] args) {

		List list=new ArrayList();
		
		list.add(100);
		list.add(100.3);
		list.add("서울시");
		list.add("서울시");
		list.add(true);
		list.add('a');
		
		System.out.println("list컬렉션 요소개수="+list.size());
		System.out.println(list);	
		
		//일반 for반복문으로 컬렉션 원소값을 출력
		for(int i=0;i<list.size();i++) {
			System.out.print(" "+list.get(i));//get()메서드로 원소값을 가져옴.
		}
	}
}
