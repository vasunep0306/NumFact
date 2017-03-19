import java.util.ArrayList;
import java.util.List;


public class NumMethods {
	
	private int number;
	
	public NumMethods( int number )
	{
		if ( number <= 0 )
			throw new IllegalArgumentException( "The number must be > 0" );
		
		this.number = number;
	}
	
	public List<Integer> getFactors() throws Exception 
	{
		
		List<Integer> factors = new ArrayList<Integer>();
		
		for ( int i = 1; i <= number; i++ )
		{
			if ( (number % i) == 0 )
				factors.add( i );
		}
		
		return factors;
	}
	
	public boolean isEven(int n) {
		if(n % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean isPrime(int n) {
		for(int i=2; i<n; i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	
}