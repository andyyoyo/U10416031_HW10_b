//U10416031
import java.util.Scanner;

public class bubbleSort {
  //bubble sort method
	public static void bubbleSort(int[] list){

		boolean needNextPass = true;
	
		needNextPass = true;
		for(int k = 1;k<list.length&&needNextPass;k++){
			needNextPass = false;
			//array may be sorted and next pass not needed
			for(int i = 0;i<list.length-k;i++){
				if(list[i]>list[i+1]){
					//swap list[i] with list[i+1]
					int temp = list[i];
					list[i] = list[i+1];
					list[i+1] = temp;
					
					needNextPass = true;
				}
			}
		}
	}
	//main method
	public static void main(String[] args){
		//prompt the user to enter the amount that user want
		System.out.println("Enter the amount of the number that you want:");
		Scanner input = new Scanner(System.in);
		int a =input.nextInt();
		System.out.println("Enter, please");
		int[] b= new int[a];
		for(int i=0;i<a;i++){
			int c = input.nextInt();
			System.out .println("Enter the next");
			b[i] = c;
		}
		bubbleSort(b);
		for(int i=0;i<b.length;i++){
			System.out.println(b[i]+"");
		}
	}
}
