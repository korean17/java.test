
public class ar {

	public static void main(String[] args) {
		//길이가 5인 int형 1차원 배열의 생성
		int[]arr = new int[5];
		
		//값을 올린다=값을 쓴다(Write)= 값을 넣는다 =값을 save 한다.
		ar1[0]=1;
		ar1[1]=2;
		ar1[2]=3;
		ar1[3]=3;
		ar1[4]=4;
		
		
		//값을 읽어 봅시다.
		System.out.println(ar1[0]);
		System.out.println(ar1[1]);
		System.out.println(ar1[2]);
		System.out.println(ar1[3]);
		System.out.println(ar1[4]);
		
		for(int i=0;i< ar1.length;i++) {
			arr[1]=i+1;
		}
		
		for(int i=0;i<arr.length;i++) {
			sum=sum + arr[i];
		}
		
		System.out.println(sum);
		
		
		//길이가 7인 double형 1차원 배열의 생성
		double[] ar2 = new double[7]; //8*7 56바이트가 순차적
		
		//배열의 참조변수와 인스턴스 생성 분리
		float[] ar3;
		ar3 = new float[9];
		
		//배열의 인스턴스 변수 접근
		System.out.println("배열ar1 길이: " + ar1.length);
		System.out.println("배열ar2 길이: " + ar2.length);
		System.out.println("배열ar3 길이: " + ar3.length);

	}

}
