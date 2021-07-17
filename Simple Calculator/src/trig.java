
public class trig {
	double Answer;
	public double sin(double x)
	{
	      math cal = new math();
	      
	      for(double n=0;n<=14;n++)
	      {
	    	  Answer=Answer+((cal.power(-1,n)*cal.power(x, 2*n+1))/cal.factorial(2*n+1));  
	      }
			return Answer;
		}
	public double cos(double x)
	{
		
		 math cal = new math();
	    
	      for(double n=0;n<=14;n++)
	      {
	    	  Answer=Answer+((cal.power(-1,n)*cal.power(x, 2*n))/cal.factorial(2*n));  
	      }
			return Answer;
	}
}

