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
}