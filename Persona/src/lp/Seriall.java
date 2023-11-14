package lp;

import java.io.*;

public class Seriall{
	public static void main (String[]args) {
		FileOutputStream fos= null;
		ObjectOutputStream salida = null;
		Persona p;
		
		try {
			fos = new FileOutputStream("C:\\ficheros\\personas.dat");
			salida = new ObjectOutputStream(fos);
			p= new Persona("1234567A","Lucas Gonzales",30);
			salida.writeObject(p);
			p=new Persona("98765432B","Anacleto Jimenez",28);
			salida.writeObject(p);
			p=new Persona("78234212z","Maria Zapata",35);
			salida.writeObject(p);
		}catch (FileNotFoundException e) {
			System.out.println("1"+e.getMessage());
		}catch (IOException e) {
			System.out.println("2"+e.getMessage());
		}finally {
			try {
				if(fos!=null) {
					fos.close();
				}
				if(salida!=null) {
					salida.close();
				}
			}catch (IOException e) {
					System.out.println("3"+e.getMessage());
			}
		}
	}
}