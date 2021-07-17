
public class trignometric {
	double Answer=0;

	trignometric(String oprea,double a){
		if (oprea == "sin" || oprea == "Sin") {
			sin(a);
		} 
		else if (oprea == "Cos" || oprea == "cos") {
			cos(a);
		}
		else if (oprea == "tan" || oprea == "Tan") {
			tan(a);
		}
		else if (oprea == "sec" || oprea == "Sec") {
			sec(a);
		}
		else if (oprea == "Cot" || oprea == "cot") {
			cot(a);
		}
		else if (oprea == "cosec" || oprea == "Cosec") {
			cosec(a);
		}
	}
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
	
	public double tan(double a) {
		trig c=new trig();
		Answer=c.sin(a)/c.cos(a);
		return Answer;
	}
	public double sec(double a) {
		trig c=new trig();
		Answer=1/c.cos(a);
		return Answer;
	}
	public double cosec(double a) {
		trig c=new trig();
		Answer=1/c.sin(a);
		return Answer;
	}
	public double cot(double a) {
		trig c=new trig();
		Answer=c.cos(a)/c.sin(a);
		return Answer;
	}
}
