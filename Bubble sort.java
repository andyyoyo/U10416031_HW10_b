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
