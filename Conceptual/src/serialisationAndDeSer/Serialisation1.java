package serialisationAndDeSer;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialisation1 extends  RuntimeException
{

	public static void main(String[] args) 
	{
		Student s1 = new Student(123, "Arcus", 69.9);
		File f1 = new File("D:/JavaWorkspace/Conceptual/src/serialisationAndDeSer/student.ser");
		
		try
		{
			f1.createNewFile();
			FileOutputStream fos = new FileOutputStream(f1);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(s1);
			oos.flush();
			oos.close();
			fos.close();

		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}

}
