
public class math {
	double power(double b, double p)
	{
		double An=1;
		for (double i = 1; i <= p; i++)
		{
			An =An * b;
		}
		return An;
	}

	
	double factorial(double f)
	{
		double An=1;
		for (double i = 1; i <= f; i++) 
		{
			An = An * i;
		}
		return An;
	}
	
	
	double sqrt(double x)
	{
		double Ans;
		double sqr=x/2;
		do {
			Ans=sqr;
			sqr=(Ans+(x/Ans))/2;
		}while((Ans-sqr)!=0);
		return sqr;
	}
}

