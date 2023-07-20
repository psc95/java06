import java.util.ArrayList;
import java.util.List;

/* 자바의 컬렉션 자료구조에 제네릭(지네릭스) 문법을 적용)
 *   1.제네릭은 jdk1.5에서 추가됨.
 *   2.형식)
 *     List<String> nameList=new ArrayList<String>();
 *     <String>이 제네릭 타입이다. 즉 문자열 값만 저장 가능하다.
 *   3.제네릭 타입을 지정하면 불필요한 업캐스팅,다운캐스팅을 안해서 프로그램 실행속도가 향상된다. 그리고 원하는 자료 추출도
 *   쉬워져서 자료의 안정성도 보장된다.  
 */
public class ListTest09 {
	public static void main(String[] args) {
       List<String> nameList=new ArrayList<String>();//문자열 자료형 값만 저장가능함
       
       nameList.add("HONG");//add()메서드로 원소값을 추가
       nameList.add("PARK");
       nameList.add("LEE");
       
       //JDK1.5에서 추가된 향상된 확장 for
       for(String name:nameList) {
    	   System.out.print(" "+ name.toLowerCase());//영문소문자로 변경
       }
	}
}
