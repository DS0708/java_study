package prob1;

public class Sort {
	
	public static void main(String[] arg) {
	
		int array[] = { 5, 9, 3, 8, 60, 20, 1 };
		int count =  array.length;
		
		System.out.println( "Before sort." );
		
		for (int i = 0; i < count; i++) {
			System.out.print( array[ i ] + " " );
		}
		
		//
		// 정렬 알고리즘이 적용된 코드를 여기에 작성합니다.
		//
		for(int i=0; i<count-1; i++) {
			for(int j=0; j< count-i-2; j++) {
				if(array[j] < array[j+1]) swap(array,j,j+1,count);
			}
		}

		
		// 결과 출력
		System.out.println( "\nAfter Sort." );
		
		for (int i = 0; i < count; i++) {
			System.out.print(array[i] + " ");
		}		
	}

	private static void swap(int[] array, int j, int i, int count) {
		// TODO Auto-generated method stub
		if(i > count-1 || j > count-1) return;
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
}