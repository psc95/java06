import java.util.Arrays;
import java.util.List;

/* 제네릭 타입간의 형변환 세번째 와일드 카드 
 *  <?> : 모든 객체 타입 배치 가능
 * */
class MyList{
	public static void printList(List<?> list) {
		
		for(Object obj:list) {
			if(obj instanceof Double) {//Object타입 obj가 Double 자손타입으로 다운캐스팅이 가능한가?참
				Double a=(Double)obj;
				System.out.print(" "+ a);
			}else if(obj instanceof String) {
                String b=(String)obj;
                System.out.print(" "+b);
			}else if(obj instanceof Integer) {
				Integer c=(Integer)obj;
				System.out.print(" "+c);
			}else if(obj instanceof Boolean) {				
				Boolean d=(Boolean)obj;
				System.out.println(d.getClass().getName());//자료형 타입을 구할수 있다.
				System.out.print(" "+d);
			}
			//System.out.print(" " + obj);
		}
		System.out.println("\n=====================>");
	}
}

public class ListTest15 {
	public static void main(String[] args) {

		List<Double> li=Arrays.asList(10.3,20.5);//배열을 컬렉션 List로 변환
		List<String> li2=Arrays.asList("one","two");
		List<Integer> li3=Arrays.asList(100,200,300);
		List<Boolean> li4=Arrays.asList(true,false);
		MyList.printList(li);
		MyList.printList(li2);
		MyList.printList(li3);
		MyList.printList(li4);
	}
}

