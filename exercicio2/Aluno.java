public class Aluno{
	String nome, numeroMatricula;
	int idade;

	public void imprimirDadosCadastrais(){
		System.out.println ("Nome: " + this.nome);
		System.out.println ("Idade: " + this.idade);
		System.out.println ("Numero Matricula: " + this.numeroMatricula);
	}

	public static void main (String [] args){
		Aluno aluno1 = new Aluno();
		aluno1.nome = "Thaminy";
		aluno1.numeroMatricula = "000000";
		aluno1.idade = 15;
		aluno1.imprimirDadosCadastrais();

		Aluno aluno2 = new Aluno();
		aluno2.nome = "Maria";
		aluno2.numeroMatricula = "111111";
		aluno2.idade = 16;
		aluno2.imprimirDadosCadastrais();

		Aluno aluno3 = new Aluno();
		aluno3.nome = "João";
		aluno3.numeroMatricula = "222222";
		aluno3.idade = 17;
		aluno3.imprimirDadosCadastrais();

		Aluno aluno4 = new Aluno();
		aluno4.nome = "Paulo";
		aluno4.numeroMatricula = "333333";
		aluno4.idade = 18;
		aluno4.imprimirDadosCadastrais();

	}

}
