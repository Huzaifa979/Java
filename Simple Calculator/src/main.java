public class main {

	public static void main(String[] args) {
		
		math_opreation A=new math_opreation("power",3,2);
		System.out.println("Power="+A.An);
		
		math_opreation C=new math_opreation("factorial",3);
		System.out.println("Factorial="+C.An);
		
		math_opreation B=new math_opreation("sqrt",4);
		System.out.println("sqrt="+B.Ans);
		
		arthimatic D = new arthimatic("sum",3,2);
		System.out.println("sum="+D.A);
		
		arthimatic E = new arthimatic("subtract",8,2);
		System.out.println("subtract="+E.A);
		
		arthimatic F = new arthimatic("Multiply",14,7);
		System.out.println("Multiply="+F.A);
		
		arthimatic G = new arthimatic("Divide",10,5);
		System.out.println("Divide="+G.A);
		
		trignometric H = new trignometric("sin",1);
		System.out.println("sin="+H.Answer);
		
		trignometric I = new trignometric("cos",1);
		System.out.println("cos="+I.Answer);
		
		trignometric J = new trignometric("tan",1);
		System.out.println("tan="+J.Answer);
		
		trignometric K = new trignometric("sec",1);
		System.out.println("sec="+K.Answer);
		
		trignometric L = new trignometric("cosec",1);
		System.out.println("cosec="+L.Answer);
		
		trignometric M = new trignometric("cot",1);
		System.out.println("cot="+M.Answer);
	}

}


