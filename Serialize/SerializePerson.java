/**
* File : SerializePerson.java 31/05/23
* Penulis : Devin Januar Siahaan - 24060121140158
* Deskripsi : pengelola DAO dalam program
*/
import java.io.*;
class Person implements Serializable {
 private String name;
 public Person(String n) {
 name = n;
 }
 public String getName() {
 return name;
 }
}
public class SerializePerson {
 public static void main(String[] args) {
 Person person = new Person("Devin");
 try {
 FileOutputStream f = new FileOutputStream("person.ser");
 ObjectOutputStream s = new ObjectOutputStream(f);
 s.writeObject(person);
 System.out.println("Selesai menulis objek person");
 s.close();
 } catch (IOException e) {
 e.printStackTrace();
 }
 }
}