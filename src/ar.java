
public class ar {

	public static void main(String[] args) {
		//���̰� 5�� int�� 1���� �迭�� ����
		int[]arr = new int[5];
		
		//���� �ø���=���� ����(Write)= ���� �ִ´� =���� save �Ѵ�.
		ar1[0]=1;
		ar1[1]=2;
		ar1[2]=3;
		ar1[3]=3;
		ar1[4]=4;
		
		
		//���� �о� ���ô�.
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
		
		
		//���̰� 7�� double�� 1���� �迭�� ����
		double[] ar2 = new double[7]; //8*7 56����Ʈ�� ������
		
		//�迭�� ���������� �ν��Ͻ� ���� �и�
		float[] ar3;
		ar3 = new float[9];
		
		//�迭�� �ν��Ͻ� ���� ����
		System.out.println("�迭ar1 ����: " + ar1.length);
		System.out.println("�迭ar2 ����: " + ar2.length);
		System.out.println("�迭ar3 ����: " + ar3.length);

	}

}
