package model;

import java.util.List;

public class Result {
		
		public static int simpleArraySum(List<Integer> ar, int arCount) {
			
			if (arCount != ar.size())
				throw new IllegalArgumentException("El arreglo debe constar de " 
						+ arCount + " elementos, usted ingreso " +ar.size() 
						+ ". Vuelva a intentarlo por favor.");
			
			int result = 0;
			
			for(int i : ar) {
				result += i;
			}
			
			return result;
	}
}

