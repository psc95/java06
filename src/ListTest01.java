import java.util.HashSet;
import java.util.Set;

/* java.util 패키지의 컬렉션 Set인터페이스의 특징)
 *  1.하나이상의 복수개의 원소값을 동시 저장 가능하다.
 *  2.복수개의 자료형 타입을 동시 저장할 수 있다.
 *  3.변화하는 가변적 배열이다.고정 크기가 아니다.
 *  4.저장되는 순서를 보장하지 않는다.
 *  5.중복원소값을 허용하지 않는다. 
 */
public class ListTest01 {
	public static void main(String[] args) {

		Set nameSet=new HashSet();//Set컬렉션 인터페이스를 구현 상속받은 자손 컬렉션 클래스가 HashSet이다.
		nameSet.add(100);//Object타입으로 업캐스팅 해서 저장
		nameSet.add(100.6);
		nameSet.add("홍길동");
		nameSet.add("홍길동");//중복이름을 허용하지 않는다.
		nameSet.add("A");
		
		System.out.println("컬렉션 원소개수 :"+nameSet.size());//4
		System.out.println(nameSet);//컬렉션 원소값 출력
	}
}
