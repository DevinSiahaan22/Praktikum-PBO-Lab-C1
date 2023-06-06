/**
* File : MainDAO.java 31/05/23
* Penulis : Devin Januar Siahaan - 24060121140158
* Deskripsi : Main program untuk akses DAO
*/
public class MainDAO {
    public static void main(String args[]) {
    Person person = new Person("Devin");
    DAOManager m = new DAOManager();
    m.setPersonDAO(new MySQLPersonDAO());
    try {
    m.getPersonDAO().savePerson(person);
    } catch (Exception e) {
    e.printStackTrace();
    }
    }
   }
   