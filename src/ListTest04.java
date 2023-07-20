import java.util.Enumeration;
import java.util.Vector;

/* java.util패키지의 Enumeration인터페이스의 특징)
 *  1.컬렉션에 저장된 복수개의 원소값을 쉽게 읽어오는 용도로 사용된다.
 *  2.jdk1.0버전에서 추가되었기 때문에 같은 버전에서 추가된 컬렉션 클래스와 궁합이 잘 맞는다.
 *  3.한번 사용하면 다시 사용못한다.다시 사용할려면 재생성해서 사용해야 한다.
 */
public class ListTest04 {
	public static void main(String[] args) {
		
		Vector vec=new Vector();//Vector컬렉션 클래스도 jdk1.0에서 추가됨
		
		//일반 for반복문으로 컬렉션 원소값 초기화
		for(int i=1;i<=3;i++) {
			vec.add(new Integer(i*10));//10 20 30원소값 저장
		}
		
		Enumeration enu2=vec.elements();
		while(enu2.hasMoreElements()) {//다음 원소값이 있다면 참
			System.out.print(" "+enu2.nextElement());//다음 원소값을 가져옴
		}
		System.out.println("\n================>");
		
		//한번 사용된 Enumeration의 boolean 타입은 거짓
		if(enu2.hasMoreElements()) {
			System.out.println("다음 원소값이 있다.");
		}else {
			System.out.println("한번 사용된 것은 다시 사용 못한다.");
		}
	}
}
