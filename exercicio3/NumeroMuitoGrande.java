import java.util.Scanner;

public class NumeroMuitoGrande{
    
    public int[] vetor1=new int [30];
    public int[] vetor2=new int [30];
    public int[] respsoma=new int [30];
    String n1, n2;
    
    public void leNumero(){
       
        Scanner input=new Scanner(System.in);
        System.out.println("Digite o primeiro Numero: ");
        n1 = input.next();
        System.out.println("Digite o segundo Numero: ");
        n2 = input.next();
        
    }
    
    public void converteNumero(){
        int tamanho1, tamanho2, i, j;
        
        tamanho1 = n1.length();
        tamanho2 = n2.length();
        
        for (i=tamanho1,j=0;i>0;i--,j++){
            char caracter=n1.charAt(j);
            vetor1[30-i]= Character.getNumericValue(caracter);
        }
        
        for (i=tamanho2,j=0;i>0;i--,j++){
            char caracter2=n2.charAt(j);
            vetor2[30-i]= Character.getNumericValue(caracter2);
        }
    }
    
    public void somaNumero(){
        
        for(int i=29;i>=0;i--){
            int vai=0;	
            if ((respsoma[i]+vetor1[i]+vetor2[i])>=10){
		        vai=1;
		        respsoma[i]=((vetor1[i]+vetor2[i]+respsoma[i])-10);
	        }
            else{
		        respsoma[i]=(vetor1[i]+vetor2[i]+respsoma[i]);
            }
	        if (vai==1){
	            vai=0;
		        respsoma[i-1]=1;
	        }
	    }
        int flag=0;
        System.out.println("Soma: ");
        for (int i=0;i<=29;i++){
	        if (respsoma[i]==0 && flag==0){
	   	        if(respsoma[i+1]!=0){
		            flag=1;
		        }
	        }
	        
	        else 
	            System.out.print(respsoma[i]);
	  }
    }
    
    public static void main (String [] args){
        NumeroMuitoGrande big = new NumeroMuitoGrande();
        big.leNumero();
        big.converteNumero();
        big.somaNumero();
    }  
}
