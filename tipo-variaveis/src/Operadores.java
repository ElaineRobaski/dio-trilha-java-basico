public class Operadores {

    public static void main(String[] args) {
        String nomeCompleto = "LINGUAGEM" + "JAVA"; //+concatena 2 variaveis
        String concatenacao = "?";
        concatenacao = 1 + 1 + 1 + "1"; //a soma
        // quando encontra caracter soma, antes disso soma os numeros
        // 1+1+1+"1" = 31 soma 3 e o ultimo concatena
        // 1+"1"+1+1= 1111 concatena o 1 com o "1" e depois concatena os outros 1
        // "1"+(1+1+1)= 13 soma os parenteses e concatena o caaracter 
      //  System.out.println(nomeCompleto);
       /* int numero = 5;

        System.out.println(numero);
        numero ++;
        System.out.println(numero);
        numero ++;
        System.out.println(numero);
        numero --;
        System.out.println(numero);
    */

//TERNARIO
        int a, b;
        a = 5;
        b = 5;
        //retorna valor false e true, dependendo da comparação
        //String resultado = a==b ? "verdadeiro" : "falso";
        int resultado = a==b ? 1 : 0; 
        System.out.println(resultado);      
    
/*
    == comparação de valor
    != comparação de valor diferente
    < comparação de valor menor
    > comparação de valor maior
    <= comparação de valor menor ou igual
    >= comparação de valor maior ou igual
*/
    }
    
}
