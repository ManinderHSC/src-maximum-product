

public class MaximumProduct {
	
	
public static int findMax(int number) {
	
	if (number < 3 ) {
		return 0;
	}
	int[] storedMaxProduct = new int[number];
	
	storedMaxProduct[2] = 1;
	storedMaxProduct[3] = 2;
	int result = 1;
	for(int i = number - 1 ; i > 2 ; i --) {
		int firstNumber = i;
		int secondNumber = number - i;
		int maxProductBetweenSecondNumberAndStoredProduct = 0;
		if (storedMaxProduct[secondNumber] != 0) {
			 maxProductBetweenSecondNumberAndStoredProduct = Math.max(secondNumber, storedMaxProduct[secondNumber]);
						
		} else {
			 int max = findMax(secondNumber);
			 
			 maxProductBetweenSecondNumberAndStoredProduct = Math.max(secondNumber, max);
			 
			 storedMaxProduct[secondNumber] = maxProductBetweenSecondNumberAndStoredProduct;
			 			
		}
		int productFirstAndSecond = firstNumber * maxProductBetweenSecondNumberAndStoredProduct;
		
		if (productFirstAndSecond > result) {
			result = productFirstAndSecond;
		}
		
	}
	return result;
	
}

public static void main (String arg [] ) {
	
	System.out.println(MaximumProduct.findMax(8));
	
	
}

}
