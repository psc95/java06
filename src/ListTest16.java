import java.util.ArrayList;
import java.util.ListIterator;

/*  java.util패키지의 ListIterator 인터페이스 특징)
 *   1. java.util 패키지의 Iterator 인터페이스를 상속받아서 기능을 향상시킨 인터페이스이다. 
 *   2. 컬렉션의 원소에 접근할 때 Iterator는 한쪽방향 즉 다음 방향으로만 이동이 가능한 것에 비해 ListIterator는 양방향
 *   이동이 가능하다라는 장점이 있다. 하지만 java.util패키지의 컬렉션 List인터페이스를 구현 상속받은 자손에서만 사용이 가
 *   능하다라는 특징이 있고, jdk1.2에서 추가되었다.
 *   
 *   3.이 인터페이스도 컬렉션에 저장된 복수개의 원소값을 쉽게 읽어오는 용도로 활용된다.
 */
public class ListTest16 {
	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();
		list.add("1");
		list.add("2");
		list.add("3");//add()메서드로 컬렉션에 원소값을 추가
		list.add("4");
		list.add("5");
		
		ListIterator<String> it = list.listIterator();
		
        while(it.hasNext()) {//다음 컬렉션 원소값이 있다면 참 
        	System.out.print(" "+it.next());//next()메서드로 다음 원소값을 가져옴.
        	//순방향 진행
        }
        System.out.println("\n=======================>");
        
        while(it.hasPrevious()) {//이전 컬렉션 원소값이 있다면 참 =>역방향 진행
        	System.out.print(" "+ it.previous());//이전 원소값을 가져옴.
        }
        System.out.println("\n========================>");
	}
}



