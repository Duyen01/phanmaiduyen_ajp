package thi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Cau_1 {
	public static void main(String[] args) throws IOException {
		Book book1 = new Book("1", "Nhà Giả Kim","Paulo Coelho",1900);
		try {
            FileOutputStream f = new FileOutputStream("E:\\StudyEverything\\AJP\\onthi\\book.txt");
            ObjectOutputStream oOT = new ObjectOutputStream(f); 
            oOT.writeObject(book1);
            oOT.close();
            f.close();
        } catch (IOException e) {
            System.out.println("Something wrong!");
        }
 
		Book a1 = new Book();
 
        try {
            FileInputStream f = new FileInputStream("E:\\StudyEverything\\AJP\\onthi\\book.txt");
            ObjectInputStream oIT = new ObjectInputStream(f); 
            a1 = (Book) oIT.readObject();
            oIT.close();
            f.close();
        } catch (IOException io) {
            System.out.println("Something wrong!");
        } catch (ClassNotFoundException ex) {
            System.out.println("Not found class");
        }
    
        System.out.println("Information of the book: \nCode: "+a1.getCode()
        +"\nTitle: "+a1.getTitle()+"\nAuth: "+a1.getAuthor()+"\nPrice: "+a1.getPrice());
	}
}
