
 class Fibo {

    public static void main (String args[]){
        int intValor1=1;
        int intValor2=2;
        int intAux;
        System.out.println (intValor1 );
        System.out.println ( intValor2);
        do{
            intAux= intValor2 +intValor1;
            System.out.println(intAux);
            intValor1=intValor2;
            intValor2 = intAux;

       
        }while(intValor2 <=100);
        

    } 
}