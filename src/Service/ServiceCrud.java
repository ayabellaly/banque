package Service;

import Model.Banque;
import Model.Client;
import Model.Compte;

import java.util.Scanner;

public class ServiceCrud
{
    private static Banque banque;

    public  ServiceCrud(Banque banque)
    {
        this.banque = banque;
    }
    public  ServiceCrud()    {    }


    public Compte chercherlCompte(Scanner clavier){

            System.out.println("Entrer l'id du compte à chercher");
            int idCompte = clavier.nextInt();
            for (int i = 0; i < banque.getTableCompte().length; i++) {
                if (banque.getTableCompte()[i].getIdCompte() == idCompte) {
                    return banque.getTableCompte()[i];
                }
            }
            return null;
    }


    public boolean supprimerCompte(Scanner clavier){
        Compte compte = chercherlCompte(clavier);
        if (compte != null) {
            for (int i = 0; i < banque.getTableCompte().length; i++) {
                if (banque.getTableCompte()[i].getIdCompte() == compte.getIdCompte()) {
                    banque.getTableCompte()[i] = null;
                    return true;
                }
            }
        }
        return false;
    }

       public boolean supprimerClient(Scanner clavier){
        System.out.println("Entrer l'id du client à supprimer");
        int idClient = clavier.nextInt();
        for (int i = 0; i < banque.getTableClient().length; i++) {
            if (banque.getTableClient()[i].getIdClient() == idClient) {
                banque.getTableClient()[i] = null;
                return true;
            }
        }
        return false;
    }

     public boolean modifierCompte(Scanner clavier){
        Compte compte = chercherlCompte(clavier);
        if (compte != null) {
            System.out.println("Entrer le nouveau solde");
            double solde = clavier.nextDouble();
            compte.setSolde(solde);
            return true;
        }
        return false;
    }



    public boolean modifierClient(Scanner clavier){
        System.out.println("Entrer l'id du client à modifier");
        int idClient = clavier.nextInt();
        for (int i = 0; i < banque.getTableClient().length; i++) {
            if (banque.getTableClient()[i].getIdClient() == idClient) {
                System.out.println("Entrer le nouveau nom");
                String nom = clavier.next();
                banque.getTableClient()[i].setNom(nom);
                return true;
            }
        }
        return false;
    }

/*
    public boolean ajouterCompte(Scanner clavier , int idClient, double solde){

        for (int i = 0; i < banque.getTableClient().length; i++) {
            if (banque.getTableClient()[i].getIdClient() == idClient) {
                for (int j = 0; j < banque.getTableCompte().length; j++) {
                    if (banque.getTableCompte()[j] == null) {
                        banque.getTableCompte()[j] = new Compte(Scanner, banque.getTableClient()[i]);
                        return true;
                    }
                    System.out.println("compte est ajouté");
                }
            }
        }
        return false;
    }*/


    public boolean ajouterClient(Scanner clavier){
        System.out.println("Entrer le nom");
        String nom = clavier.next();
        for (int i = 0; i < banque.getTableClient().length; i++) {
            if (banque.getTableClient()[i] == null) {
                banque.getTableClient()[i] = new Client();
                return true;
            }
        }
        return false;
    }









}
