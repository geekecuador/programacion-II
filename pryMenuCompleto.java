package prycompleto;

import java.util.Scanner;

/**
 *
 * @author David Pulloquinga
 * @e-mail david@pulloquinga
 *
 */
public class PryCompleto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada =new Scanner(System.in);
        System.out.println("..::Bienvenido::..\n");
        System.out.println("1.-Opciones Básica\n"
                + "2.-Funcionces\n"
                + "3.-Mis datos Personales\n"
                + "4.-Salir");
        int a=entrada.nextInt();
        menu(a);
        }
    public static void menu(int a){
        Scanner entrada=new Scanner(System.in);
            switch (a) {
            case 1:
             System.out.println("        1 Suma \n" +
"	2 Resta\n" +
"	3 Multiplicación\n" +
"	4 División\n" +
"	5 Modulo\n" +
"	6 Salir ");
                int b=entrada.nextInt();
                menu1(b);
                break;
            case 2:
                System.out.println("	1 Factorial\n" +
"	2 Exponente\n" +
"	3 Primo\n" +
"	4 Numero Palíndromo\n" +
"	5 Numero amigos\n" +
"	6 Salir");
                int c=entrada.nextInt();
                menu2(c);
                break;
            case 3:
                System.out.println("	1 Datos Personales\n" +
"	2 Datos Institución\n" +
"	3 Salir");
                int d=entrada.nextInt();
                menu3(d);
                break;
            case 4:
                System.exit(0);
                break;
                
            default:
                System.exit(0);
                        }
        
    }
    public static void menu1(int b){
        
        switch (b) {
            case 1:
                Scanner entrada =new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        int x=entrada.nextInt();
        System.out.println("Ingrese el segundo numero");
        int y=entrada.nextInt();
                System.out.println("La suma es: "+(x+y));
                break;
            case 2:
                Scanner entrada2 =new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        int x2=entrada2.nextInt();
        System.out.println("Ingrese el segundo numero");
        int y2=entrada2.nextInt();
                System.out.println("La resta es: "+(x2 - y2));
                break;
            case 3:
                Scanner entrada3 =new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        int x3=entrada3.nextInt();
        System.out.println("Ingrese el segundo numero");
        int y3=entrada3.nextInt();
                System.out.println("La multiplicacion es: "+(x3 * y3));
                break;
            case 4:
                Scanner entrada4 =new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        int x4=entrada4.nextInt();
        System.out.println("Ingrese el segundo numero");
        int y4=entrada4.nextInt();
                System.out.println("La division es: "+((double)x4/y4));
                break;
            case 5:
                Scanner entrada5 =new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        int x5=entrada5.nextInt();
        System.out.println("Ingrese el segundo numero");
        int y5=entrada5.nextInt();
                System.out.println("El módulo es:"+(((double)x5)%y5));
                break;
            case 6:
                System.exit(0);
                break;
            default:
                System.exit(0);
        }
        
    }
    public static void menu2(int c){
        switch (c) {
            case 1:
                Scanner entrada=new Scanner(System.in);
                System.out.println("Ingrese un numero:\n");
                double fact=entrada.nextDouble();
                System.out.println("El factorial de "
                        +fact
                        +" es: "
                        +factorial(fact));
                break;
            case 2:
                Scanner entra=new Scanner(System.in);
                System.out.println("Ingrese la base:");
                double base=entra.nextDouble();
                System.out.println("Ingrese la potencia");
                double potencia=entra.nextDouble();
                System.out.println("La pontencia es: "+potencia(base,potencia));
                break;
            case 3:
                Scanner s=new Scanner(System.in);
                System.out.println("Ingrese un numero");
                int primo=s.nextInt();
                if (numeroprimo(primo)==1)
                    System.out.println("El numero es primo");
                else
                    System.out.println("El numero no es primo");
                
                break;
            case 4:
                Scanner teclado = new Scanner(System.in);
                System.out.println("Ingrese el numero:");
                int n=teclado.nextInt();
                capi(n);
                break;
            case 5:
                Scanner in = new Scanner(System.in);
                System.out.println("Ingrese el 1er. número");
                int x1=in.nextInt();
                System.out.println("Ingrese el 2do. número");
                int x2=in.nextInt();
                if (amigos(x1,x2)==1)
                    System.out.println("Los numeros son amigos");
                else    
                    System.out.println("Los numeros no son amigos");
                
                break;
            case 6:
                System.exit(0);
                break;    
            default:
                System.exit(0);
        }
        
    }
    public static void menu3(int d){
        switch (d) {
            case 1:
                System.out.println("..:Datos Personales:..");
                System.out.println("Nombre: David");
                System.out.println("Apellido: Pulloquinga");
                System.out.println("Curso:2do.");
                System.out.println("Carrera: Ingeniería en Software");
                System.out.println("Ciudad: Latacunga");
                System.out.println("Correo: david@pulloquinga.com");
                break;
             case 2:
                 System.out.println("..::Datos Institucion::..");
                 System.out.println("Universidad: ESPE");
                 System.out.println("Carrera: Software");
                 System.out.println("Campus: Latacunga");
                 System.out.println("Teléfono: 032123456");
                break;
             case 3:
                System.exit(0);
                break;                
                
            default:
                throw new AssertionError();
        }
        
    }
    public static double factorial(double fact){
        double factorial = 1;
        for (int i = 1; i <= fact; i++) {
         factorial=factorial*i;
        }
        return factorial;
    
    }
    public static double potencia(double base, double potencia){
        double resultado = 1;
        for (int j = 1; j <=potencia; j++) {
            resultado=resultado*base;
        }
        return resultado;
    
    }
    public static int numeroprimo(int primo){
        int z=0;
        int ayuda=0;        
        int aux;
        for (int k = 1; k <=primo; k++) {
            aux=primo%k;
            if (aux==0) {
                z++;
            }       
        }
        if (z==2)
                return ayuda=1;
        else
                return ayuda=0;
    }
    public static int amigos(int x1,int x2){
        int aux = 0;
        int aux1=0;
        int emision=0;
        int suma = 0;
        int suma1 = 0;
        for (int v = 1; v < x1; v++) {
            aux=x1%v;
            if (aux==0)
                suma=suma+v;
            
        }
        for (int w = 1; w <x2; w++) {
            aux1=x2%w;
            if (aux1==0)
                suma1=suma1+w;
            
        }
        if (suma1==x1 && suma==x2)
            return emision=1;
        else
            return emision=0;
    }
    public static void capi (int n)
    {
	int r,s=0,k;
	k=n;
    while(n!=0)
	{    
	r=n%10;
	s=s*10+r;
	n=n/10;
     	}
     	System.out.print("\nEl numero invertido es :"+s);
     if(s==k)
	System.out.println ("\nEs palindromo ");
	else
	System.out.println ("\nNo es palindromo ");
    }
}
