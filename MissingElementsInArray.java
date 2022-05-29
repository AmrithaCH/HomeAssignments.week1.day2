package week1.day2;

import java.util.Arrays;

public class MissingElementsInArray {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,7,6,8,10,11,9,12,15,13,14,16,5,18};
		Arrays.sort(arr);

		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]!=i+1)
			{
				System.out.println(i+1);
				break;
			}


		}

	}

}
