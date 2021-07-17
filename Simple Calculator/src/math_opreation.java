public class math_opreation {
	double An=1;
	double Ans;
	
	math_opreation(String oprea, int a,int b) {
			power(a,b);
		
		
	}
	math_opreation(String oprea, int a) {

		
		if (oprea == "Factorial" || oprea == "factorial") {
			factorial(a);
		}
		else if (oprea == "sqrt" || oprea == "Sqrt") {
			sqrt(a);
		}
		
	}
	double power(double b, double p)
	{
	
		for (double i = 1; i <= p; i++)
		{
			An =An * b;
		}
		return An;
	}

	
	double factorial(double f)
	{
	
		for (double i = 1; i <= f; i++) 
		{
			An = An * i;
		}
		return An;
	}
	
	
	double sqrt(double x)
	{
		
		double sqr=x/2;
		do {
			Ans=sqr;
			sqr=(Ans+(x/Ans))/2;
		}while((Ans-sqr)!=0);
		return sqr;
	}
}