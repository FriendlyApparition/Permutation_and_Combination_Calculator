package permutation_combination;
import java.math.BigInteger;
public class Permutation {
	public static BigInteger permutationFormula(int n,int r ) {
		BigInteger numerator = BigInteger.ONE;
		BigInteger denominator = BigInteger.ONE;
		for(int i = n; i > 0; i-- ) {
			numerator = numerator.multiply(BigInteger.valueOf(i));
		}
		if (n-r == 0) {
			denominator = BigInteger.valueOf(1);
		} else {
				for (int i = (n-r); i > 0; i--) {
					denominator = denominator.multiply(BigInteger.valueOf(i));
				}
		}
		return numerator.divide(denominator);
	}
	public static void main(String[] args) {
		System.out.println(permutationFormula(10,8));
	}
	

}
