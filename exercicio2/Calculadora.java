public class Calculadora{
	int variavel1, variavel2;

	public void soma (){
		System.out.println ("A soma dos dois numeros eh " + (variavel1+variavel2));
	}

	public void subtracao (){
		System.out.println ("A subtracao dos dois numeros eh " + (variavel1-variavel2));
	}

	public void multiplicacao (){
		System.out.println ("A multiplicacao dos dois numeros eh " + (variavel1*variavel2));
	}

	public void divisao (){
		System.out.println ("A divisao dos dois numeros eh " + (variavel1/variavel2));
	}

	public static void main (String [] args){
		Calculadora a1 = new Calculadora();
		a1.variavel1=10;
		a1.variavel2=2;
		a1.soma();
		a1.subtracao();
		a1.multiplicacao();
		a1.divisao();

		Calculadora a2 = new Calculadora();
		a2.variavel1=15;
		a2.variavel2=3;
		a2.soma();
		a2.subtracao();
		a2.multiplicacao();
		a2.divisao();

		Calculadora a3 = new Calculadora();
		a3.variavel1=20;
		a3.variavel2=4;
		a3.soma();
		a3.subtracao();
		a3.multiplicacao();
		a3.divisao();

	}

}
