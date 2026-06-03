import java.util.Scanner;
/**
 *
 * @author cassia
 */
public class analiseEstoque {
    
    public static void main (String[]args){
     Scanner input = new Scanner (System.in);
     int produto = 0;
     int contLote = 0;
     int soma = 0;
     while(produto>=0){
     System.out.println("Informe a quantidade de produtos do lote:\n"+(contLote+1));
     produto = input.nextInt();
     
     soma+=produto;
     contLote++;
     } 
        
     
     System.out.println("A quantidade de lotes revisados é: "+contLote);
        
     System.out.println("A soma total de defeitos é: "+soma);
     
     if(soma>50){
         
      System.out.println("Atenção: Alto indeice de perda!");
        
     }        
    }
    
    
}
