/* 제네릭 클래스 설계 */
class GenericClass<T>{//<T> 가상의 제네릭 T타입 선언=>정해지지 않은 자료형
	
	private T member;

	public T getMember() {
		return member;
	}//getter()메서드

	public void setMember(T member) {
		this.member = member;
	}//setter()메서드		
}

public class ListTest11 {
	public static void main(String[] args) {
       //GenericClass<double> obj01=new GenericClass<double>(); //제네릭 타입에 기본 타입은 안된다.
	   //타입은 자료형을 의미한다.
		
		GenericClass<Double> obj01 = new GenericClass<>();//실수 숫자값만 저장 가능,뒷부분 제네릭 타입은
		//생략한 형태인 <>을 사용함.앞부분만 봐도 어떤 제네릭 타입인 가를 알수가 있기 때문이다.결국 뒷부분 제네릭 타입을 생략
		//할 수 있는 것은 jdk1.7(자바 7)에서 추가된 문법이다.
		obj01.setMember(10.7);
		System.out.println("반환된 실수 숫자값 = "+obj01.getMember());
		
		GenericClass<Integer> obj02 = new GenericClass<>();
		//정수 숫자만 저장가능한 지네릭스 obj02를 생성
		obj02.setMember(100);
		System.out.println("반환된 정수 숫자값 = "+obj02.getMember());
		
		GenericClass<String> obj03=new GenericClass<String>();//문자열 값만 저장 가능
		obj03.setMember("홍길동");
		System.out.println("반환된 문자열 이름 = "+obj03.getMember());
	}
}
