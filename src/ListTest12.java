import java.util.ArrayList;

/* 제네릭 타입간의 형변환은 안된다.그래서 나온 문법이 제네릭 와일드 카드이다. 
 */
public class ListTest12 {
	public static void main(String[] args) {

	  ArrayList<String> fruitList = new ArrayList<String>();
	  fruitList.add("apple");
	  fruitList.add("grape");
	  
	  ArrayList<Object> objList;
	  objList = fruitList;//<String>제네릭 타입을 조상타입인 <Object> 타입으로 업캐스팅이 안된다. 즉 제네릭
	  //타입간의 형변환은 허용하지 않는다.	  
	}
}
