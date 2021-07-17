
public class arthimatic {
	public int A;
	arthimatic(String oprea, int a,int b) {

		if (oprea == "Sum" || oprea == "sum") {
			sum(a,b);
		} 
		else if (oprea == "Subtract" || oprea == "subtract") {
			subtract(a,b);
		}
		else if (oprea == "multiply" || oprea == "Multiply") {
			multiply(a,b);
		}
		else if (oprea == "divide" || oprea == "Divide") {
			divide(a,b);
		}
	}
	public void sum(int a,int b){
		A=a+b;
	}
	
	public void subtract(int a,int b){
		A=a-b;
	}
	
	public void multiply(int a,int b){
		A=a*b;
	}
	
	public void divide(int a,int b){
		A=a/b;
	}
}
