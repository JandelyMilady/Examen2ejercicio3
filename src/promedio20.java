import java.util.Scanner;


public class promedio20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arreglo [] = new int [20];
//hice un arreglo pero cree varios scanners para que no se borre el dato que guardo de cada arreglo porque al final ocupo sumarlos
Scanner a=new Scanner (System.in);
Scanner b=new Scanner (System.in);
Scanner c=new Scanner (System.in);
Scanner d=new Scanner (System.in);
Scanner e=new Scanner (System.in);
Scanner f=new Scanner (System.in);
Scanner g=new Scanner (System.in);
Scanner h=new Scanner (System.in);
Scanner i=new Scanner (System.in);
Scanner j=new Scanner (System.in);
Scanner k=new Scanner (System.in);
Scanner l=new Scanner (System.in);

//aqui pido el numero con un s.o.p y luego le asigno un scanner a cada uno

			System.out.println("Ingrese numero1: ");
			arreglo[0]=a.nextInt();
			System.out.println("Ingrese numero2: ");
			arreglo[1]=a.nextInt();
			System.out.println("Ingrese numero3: ");
			arreglo[2]=a.nextInt();
			System.out.println("Ingrese numero4: ");
			arreglo[3]=a.nextInt();
			System.out.println("Ingrese numero5: ");
			arreglo[4]=a.nextInt();
			System.out.println("Ingrese numero6: ");
			arreglo[5]=a.nextInt();
			System.out.println("Ingrese numero7: ");
			arreglo[6]=a.nextInt();
			System.out.println("Ingrese numero8: ");
			arreglo[7]=a.nextInt();
			System.out.println("Ingrese numero9: ");
			arreglo[8]=a.nextInt();
			System.out.println("Ingrese numero10: ");
			arreglo[9]=a.nextInt();
			System.out.println("Ingrese numero11: ");
			arreglo[10]=a.nextInt();
			System.out.println("Ingrese numero12: ");
			arreglo[11]=a.nextInt();
			System.out.println("Ingrese numero13: ");
			arreglo[12]=a.nextInt();
			System.out.println("Ingrese numero14: ");
			arreglo[13]=a.nextInt();
			System.out.println("Ingrese numero15: ");
			arreglo[14]=a.nextInt();
			System.out.println("Ingrese numero16: ");
			arreglo[15]=a.nextInt();
			System.out.println("Ingrese numero17: ");
			arreglo[16]=a.nextInt();
			System.out.println("Ingrese numero18: ");
			arreglo[17]=a.nextInt();
			System.out.println("Ingrese numero19: ");
			arreglo[18]=a.nextInt();
			System.out.println("Ingrese numero20: ");
			arreglo[19]=a.nextInt();
//al final sumo todos los arreglos y los divido entre 20 
int promedio; 
promedio=((arreglo[0]+arreglo[1]+arreglo[2]+arreglo[3]+arreglo[4]+arreglo[5]+arreglo[6]+arreglo[7]+arreglo[8]+arreglo[9]+arreglo[10]+arreglo[11]+arreglo[12]+arreglo[13]+arreglo[14]+arreglo[15]+arreglo[16]+arreglo[17]+arreglo[18]+arreglo[19])/(20));
System.out.println(promedio);
	}

}
