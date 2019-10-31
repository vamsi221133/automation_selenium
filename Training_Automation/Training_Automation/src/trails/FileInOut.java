package trails;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInOut {
public static void main(String[] args) {
	File file=null;
	FileInputStream f=null;
	try
	{
	String d="ssatesh";
	FileOutputStream ff=new FileOutputStream("C:/Users/training/Desktop/context.txt")	;
	ff.write(d.getBytes());
	ff.close();
	file=new File("C:/Users/training/Desktop/context.txt");
	f=new FileInputStream(file);
	System.out.println("Total char : " +f.available());
	int i;
	while((i=f.read())!=-1)
	{
		System.out.print((char)i);
		
	}
	}
	catch (IOException e) {
		System.out.println("No files");
	}
	
	}

}
