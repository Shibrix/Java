package Multidimensionales;
import java.util.*;
public class Repaso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array [][]= {{1,2,3},{4,5,6},{7,8,9}};
		int array2[][]={{2,4,6},{8,9,10},{11,12,15}};
		int arraysol[][]= new int[array.length][array[0].length];
		
		System.out.println(Arrays.deepToString(arraysol));
		
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				
//				arraysol[i][j]= array[i][j]+array2[i][j];
//				array[i][j]= array[i][j]*10;
				
				//Esto para sumar solamente las columnas pares
				if(j%2==0) {
					arraysol[i][j]= array[i][j]+array2[i][j];
				}
				
			}
		}
		System.out.println(Arrays.deepToString(arraysol));
		
	}

}
