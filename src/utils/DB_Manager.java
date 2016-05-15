/**
 * Code is prose. Lefty G Balogh
 */
package utils;

import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import org.hibernate.Session;
import org.hibernate.Transaction;
import pojos.Kerdesek;

/**
 *
 * @author lefty
 */
public class DB_Manager {

    private List<Kerdesek> kerdesLista;
    

    public List<Kerdesek> getKerdesLista() {
        return kerdesLista;
    }

    public void setKerdesLista(List<Kerdesek> kerdesLista) {
        this.kerdesLista = kerdesLista;
    }

    public void loadQuestionsFromDB() {
        Session session = hibernate.HibernateUtil.getSessionFactory().openSession();
        kerdesLista=(session.createQuery("FROM Kerdesek")).list();
        session.close();
        hibernate.HibernateUtil.getSessionFactory().close();

    }



    public DB_Manager() {
        loadQuestionsFromDB();
    }

  
  

}
