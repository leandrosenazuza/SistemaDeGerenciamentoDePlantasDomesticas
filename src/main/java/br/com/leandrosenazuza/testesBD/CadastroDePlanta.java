package br.com.leandrosenazuza.testesBD;

import br.com.leandrosenazuza.modelo.Planta;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CadastroDePlanta {
    public static void main(String[] args) {

        Planta samambaias = new Planta();
        samambaias.setName("Americana");
        samambaias.setSpecie("samambaia");

        //Interface para criacao de gerenciadores de entidade
        EntityManagerFactory factory = Persistence
                .createEntityManagerFactory("jardim");

        EntityManager em = factory.createEntityManager();

        em.getTransaction().begin(); //Inciar a operacao
        em.persist(samambaias);
        em.getTransaction().commit();
        em.close();
    }
}
