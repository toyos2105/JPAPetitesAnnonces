
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.junit.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Formation
 */
public class JPAMesAnnoncesTest {
    EntityManagerFactory myPersistence = Persistence.createEntityManagerFactory("JPAPetitesAnnoncesPU");
    EntityManager myEm = myPersistence.createEntityManager();
    
    
    @Test
    public void JPATest() {
        myEm.getTransaction().begin();
        
        
        
        myEm.getTransaction().commit();
    }
    
}
