package lp2;

import java.io.*;

public class Binarios3 {
	public static void main(String[]args) {
		FileInputStream fis=null;
		DataInputStream entrada =null;
		int n;
		try {
			fis =new FileInputStream("C:\\ficheros\\datos.dat");
			entrada =new DataInputStream(fis);
			while (true) {
				n = entrada.readInt();
				System.out.println(n);
			}
		}catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}catch (EOFException e) {
			System.out.println("Fin de fichero");
		}catch (IOException e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				if(fis!=null) {
					fis.close();
				}
				if(entrada != null) {
					entrada.close();
				}
			}catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
