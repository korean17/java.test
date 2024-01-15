import com.sun.java_cup.internal.runtime.Scanner;

class Box {
   private String conts; 
   Box(String cont) 
	   this.conts = cont;
   }
   public String toString() {
	   return conts; // 문자열 반환
   }
}

class AutoCallToString{                                                                                                                                                     

	public static void main(String[] args) {
    	
		        //길이가 5인 int형 1차원 배열의 생성
				int[]arr = new int[1000];
				int sum=0;
				
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
				
				//입력
				for(int i=0;i< arr.length;i++) {
					arr[i]=i+1;
				}
				
				for(int i=0;i<arr.length;i++) {
					sum=sum + arr[i];
				}
				
				System.out.println(sum);
				
    	String source = "1 3 5";
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 입력: ");
		String str1 = sc.nextline();
		
		System.out.printf("입력된 문자열 1: %s \n", str1);
		System.out.printf("입력된 문자열 2: %s \n", str2);   
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		int sum = num1 + num2 + num3;
    	
    	
    	
    	
    	//		StringBuilder stb = new StringBuilder("12");
//		stb.append(34);
		
//		System.out.println(stb.toString());
//		System.out.println(stb);
		
		Box box = new Box("Camera");
		
		//System.out.pirintln(box.toStiring());
	    System.out.println(box);

	}

}
	


