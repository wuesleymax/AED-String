
public class Main{

    

public static String converterPosParaMaiuscula( String entrada, int pos ) {

    String retorno = "";
    retorno= entrada = entrada.substring(0,3) + entrada.toUpperCase().charAt(3) +  entrada.substring(4,entrada.length());

    return retorno;

}

public static String obterPosicaoProxChar(String entrada, int pos_ini,char c)

{ int pos_retorno= -1;
    int i;

for(i=pos_ini; i<entrada.length(); i++){

    if (entrada.charAt(i) == c) {

        return i;
        
    }
}
    return pos_retorno;
}

public static String tiraCaracter(String entrada, )




public static void main(String[] args) {
    
    String st1, st2, st3;
    int i;
st1= "algoritimo";
st2 = "Estruturas de dados";

System.out.println(converterPosParaMaiuscula("Algoritimos", 4));
    


}


}