package lk.ijse.hibernate;

import lk.ijse.hibernate.entity.Owner;
import lk.ijse.hibernate.entity.Pet;
import lk.ijse.hibernate.util.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class AppInitializer {
    public static void main(String[] args) {
//        Owner o1 = new Owner();
//        o1.setOId("O001");
//        o1.setName("Bashini");
//
//        Pet p1 = new Pet();
//        p1.setPId("P001");
//        p1.setName("Dog");
//        p1.setOwner(o1);
//
//        Pet p2 = new Pet();
//        p2.setPId("P002");
//        p2.setName("Rabbit");
//        p2.setOwner(o1);
//
//        o1.getPetList().add(p1);
//        o1.getPetList().add(p2);

        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        //1st methodology for fetching data from the table
//        Owner o001 = session.get(Owner.class, "O001");
//        System.out.println(o001.getName());

        //2 nd methodology for fetching data from the table
        Owner o001 = session.load(Owner.class,"O001");
        System.out.println(o001.getPetList());

        transaction.commit();
        session.close();

    }
}
