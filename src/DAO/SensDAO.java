/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entidad.Sensor;
import java.util.ArrayList;
import javax.persistence.*;

public class SensDAO {
    
    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("BonoPU");
    
    public void crear (Sensor object){
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        try{
            em.persist(object);
            em.getTransaction().commit();
        } catch (Exception e){
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }
    
    public boolean eliminar(Sensor object){
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        boolean ret = false;
        try{
            em.remove(object);
            em.getTransaction().commit();
            ret = true;
        } catch(Exception e){
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
            return ret;
        }
    }
    
    public ArrayList leerG(){
        EntityManager em = emf.createEntityManager();
        ArrayList sensores = new ArrayList();
        Query q = em.createQuery("SELECT h FROM Historico h" + " ORDER BY h.ID DESC LIMIT 0,5");
        try{
            sensores.add(q.getResultList());
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            em.close();
            return sensores;
        }
    }
    
    public ArrayList leerE(int id){
        EntityManager em = emf.createEntityManager();
        ArrayList sensores = new ArrayList();
        Query q = em.createQuery("SELECT * FROM Historico h " + "WHERE h.Id_sensor = :id")
                .setParameter("id",id);
        try{
            sensores.add(q.getResultList());
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            em.close();
            return sensores;
        }
    }
}
