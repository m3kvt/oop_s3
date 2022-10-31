import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
class file
{
	public static void main(String a[]){
		String str="File handling using reader and writer";
		int ch;
		try{
		FileWriter fw=new FileWriter("/home/mec/file.txt");
		fw.write(str);
		fw.close();
		}
	catch (IOException e) {  
       System.out.println("Error");  
       e.printStackTrace();  
    }
		try{
		FileReader fr=new FileReader("file.txt");
		while((ch=fr.read())!=-1)
			System.out.print((char)ch);
		System.out.println("\n");
		fr.close();
		}catch (IOException e) {  
       System.out.println("Error");  
       e.printStackTrace();  
    }
}
}
