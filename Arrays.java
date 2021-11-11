package week1.day2;

public class Arrays {
	public static void main(String[] args) { 
		int arr[] = {100,49,398,1,267};
		
		for (int i=0;i<arr.length;i++) {
			 System.out.println("numArray["+i+"]:"+arr[i]);
			 
		}
		System.out.println("------");{
		Arrays.sort(arr);
		System.out.println("sorted array");
		for (int i=0;i <arr.length;i++) {
			System.out.println("NumberArray["+i+"]L"+arr[i]);
		
		}
		System.out.println("-------");
		int length=arr.length;
		System.out.println("Second Largest Array:"+arr[length-1]);
		System.out.println("-------");
		System.out.println("Second Smaller Array:"+arr[1]);
		}
		
	}

	private static void sort(int[] arr) {
		// TODO Auto-generated method stub
		
	}

}
