import java.util.Vector;

/* java.util패키지의 컬렉션 클래스 Vector를 활용한 예제 */

public class ListTest05 {
	public static void main(String[] args) {

		Vector vec=new Vector();
		double[] arr= {38.6,9.2,45.3,6.1,4.7,1.6};
		
		for(int i=0;i<arr.length;i++) {
			vec.add(arr[i]);//벡터 컬렉션에 실수 숫자 배열원소값을 저장
		}
		
		System.out.println(">>벡터 전체 원소값 출력<<");
		System.out.println("------------------------->");
		for(int i=0;i<vec.size();i++) {
			System.out.print(" "+vec.get(i));//get(주소 인덱스번호)메서드로 컬렉션 원소값을 가져옴.
		}
		System.out.println();//개행 즉 줄바꿈
		
		double findData=6.1;
		int index =  vec.indexOf(findData);//주어진 자료에 해당하는 인덱스 주소번호 반환. 첫주소번호는 0부터 시
		//작
		if(index != -1) {
			System.out.println("\n검색 성공 : "+index);
		}else {
			System.out.println("\n검색 실패 : "+index);
		}
		
		double delData = 45.3;
		if(vec.contains(delData)) {//45.3이 벡터에 포함되었다면 참
			vec.remove(delData);//벡터로 부터 해당 원소값 삭제
			System.out.println("\n삭제 완료");
		}
		
		System.out.println("\n>>>삭제후 벡터 원소값 출력 <<");
		System.out.println("---------------------------->");
		for(int i=0;i<vec.size();i++) {
			System.out.print(" "+ vec.get(i));
		}
		System.out.println("\n---------------------------->");
	}
}
