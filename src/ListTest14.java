import java.util.Arrays;
import java.util.List;

/*  제네릭 타입 와일드 카드 문법 2번째 */ 

public class ListTest14 {
    public static void addNumber(List<? super Integer> list) {
    	/* <? super Integer> 제네릭 와일드 카드는 Integer타입의 조상만 제네릭 타입간의
    	 * 형변환을 허용한다는 의미이다.
    	 */
    	for(int i=0;i<list.size();i++) {
    		System.out.print(" "+list.get(i));
    	}
    	System.out.println();//개행
    }
	public static void main(String[] args) {

		Number[] arr = {10,20,30};
		Object[] arr2 = {100,200,300};
		List<Number> li=Arrays.asList(arr);//배열을 컬렉션 List로 변환
		addNumber(li);
		List<Object> li2=Arrays.asList(arr2);
		addNumber(li2);
	}
}
