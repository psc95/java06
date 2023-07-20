import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* java.util패키지의  인터페이스 Iterator 특징)
 *  1.jdk 1.2에서 추가되었기 때문에 같은 버전에서 추가된 컬렉션과 궁합이 잘 맞다.그러므로 List컬렉션 인터페이스를 구현한
 *  자손클래스 ArrayList컬렉션에 저장된 복수개의 원소값을 읽어오는 용도로 사용하면 된다.
 *  
 *  2.한번 사용된 Iterator는 다시 사용못한다. 다시 사용할려면 새로 만들어서 사용해야 한다.
 */
public class ListTest03 {
	public static void main(String[] args) {

		List list=new ArrayList();
		list.add(1);
		list.add(100);
		list.add(200.6);
		list.add("신사임당님");
		list.add(false);
		
		Iterator elements = list.iterator();
		while(elements.hasNext()) {//hasNext()메서드는 다음 원소값이 존재하면 참
			System.out.print(" " + elements.next());//next()메서드로 다음원소값을 가져옴.
		}
		System.out.println("\n====================>");
		if(elements.hasNext()) {
		while(elements.hasNext()) {
			System.out.print(" "+elements.next());
		}
		}else {
			System.out.println("다음 원소값이 존재하지 않아서 사용못합니다.");
		}
		System.out.println("\n======================>");
		
	}
}
