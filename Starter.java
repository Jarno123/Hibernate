package Starter;



import org.hibernate.Session;
import org.hibernate.Transaction;

import datalayer.HibernateDAOFactory;
import domain.Project;
import domain.Werknemer;

public class Starter {

    public static void main(String[] args) {
        Session sess = HibernateDAOFactory.getSession();
        Transaction ts = sess.beginTransaction();

        //start transaction adding werknemers
        
        Werknemer w = new Werknemer("BUH", "Buuhur", "laan 2", "BRS", 2300, "24-10-2005", "4486AA");
        
        Werknemer a = new Werknemer("SJK", "Sjaak", "kerkstraat 3", "BRS", 3400, "15-09-2016", "4300AA");
        
        Werknemer b = new Werknemer("HNS", "Hans", "koningstraat 38", "BRS", 1900, "05-04-2003", "4400AA");
        
        Werknemer c = new Werknemer("KES", "Kees", "westhavenstraat 8", "BRS", 2500, "29-10-2009", "4500AA");
        
        //start transaction adding projects
        
        Project p = new Project("BAM", w ,"Barman", "Rotterdam", "01-01-2001", 120000);
        

        sess.save(w);
        sess.save(a);
        sess.save(b);
        sess.save(c);
        sess.save(p);
        ts.commit();

        sess.close();

        HibernateDAOFactory.shutdown();


    }
}