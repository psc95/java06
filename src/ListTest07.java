import java.util.Enumeration;
import java.util.Hashtable;

/* java.util 패키지의 Map컬렉션 인터페이스를 구현한 컬렉션 클래스 Hashtable의 특징)
 *  1.키,값 쌍으로 저장하는 사전적인 자료구조이다.
 *  2.키를 통해서 값을 검색하기 때문에 검색속도가 빠르다.
 *  3.저장되는 순서를 유지하지 않는다.
 */
public class ListTest07 {
	public static void main(String[] args) {

		Hashtable ht=new Hashtable();
		ht.put("apple","사과");//키,값 쌍으로 저장
		ht.put("banana", "바나나");
		ht.put("grape","포도");
		
		String val=(String)ht.get("grape");//grape키에 대한 값을 구함
		//명시적인 다운캐스팅
		
		if(val != null) {
			System.out.println("grape : "+ val);
		}
		
		Enumeration enum2=ht.keys();
		while(enum2.hasMoreElements()) {//키가 있다면 참
			Object k=enum2.nextElement();//키요소를 구함
			Object v=ht.get(k);//키에 대한 값을 구함
			System.out.println(k+" : "+v);//키 : 값 쌍으로 출력
		}
	}
}
