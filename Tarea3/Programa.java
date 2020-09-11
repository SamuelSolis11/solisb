class Fibo{

    public static void main (String args[]){
         

        int Valor1= 1;
        int Valor2=2;
        
         
        System.out.println ( Valor1 );
        System.out.println ( Valor2);
        for(int x=1; x<=10 ; x++) {
            int Suma = Valor1+Valor2;
            System.out.println ( Suma);
            Valor1 =Valor2;
            Valor2 = Suma;

        

        }
    } 
}
