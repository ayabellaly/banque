package Controller;

import Model.Banque;
import Model.Client;
import Model.Compte;

import java.time.LocalDate;
import java.util.Scanner;


public class ClassTest {






    public static int Menu(){

        Scanner sc=new Scanner(System.in);
        System.out.println("-----------WELOCME TO THE BANK OF JAVA-----------");
        System.out.println("1-Create a new account");
        System.out.println("2-modify an account");
        System.out.println("3-Supprimer les comptes dans la banque");
        System.out.println("4-Delete an account in a bank");
        System.out.println("5-consult all accounts");
        System.out.println("6-search a specific account in a bank" );
        System.out.println("7-Exit");
        System.out.println("------------------------------------------------");
        System.out.println("Enter your choice");
        int x =sc.nextInt();
        return x;
    }
        public static void main(String[] args) {
            Banque banque;
        double solde;

        LocalDate DateCreation;
        Client Proprietaire;
        Scanner sc=new Scanner(System.in);

        // TODO code application logic here
            boolean sort=false;
do {
    int x = Menu();

    switch (x) {
        case 1:
            System.out.println("-------------------------Creation d'un compte-------------------------");
            System.out.println("Entrer le nom du client");
            String nom = sc.nextLine();
            System.out.println("Entrer le prenom du client");
            String prenom = sc.nextLine();
            System.out.println("Entrer le mail du client");
            String mail = sc.nextLine();


            Proprietaire = new Client(nom, prenom, mail);

            Compte c1;
            System.out.println("Enter solde");
            solde = sc.nextDouble();
            DateCreation = LocalDate.now();


            c1 = new Compte(solde, Proprietaire, DateCreation);

            int cpt = 0;

            for (int i = 0; i < c1.getTablejournalisation().length; i++) {
                if (c1.getTablejournalisation()[i] != null) {
                    cpt = i + 1;
                    break;
                }
            }

            c1.ajouter(solde, cpt);

            System.out.println("------------------------------------------------");
            System.out.println("Compte créé avec succès");


            System.out.println(c1.toString());


            break;


        case 2:

            System.out.println("---------------modification d'un compte----------------");

            System.out.println("Entrer le nom du client");
            String Nom = sc.nextLine();
            System.out.println("Entrer le prenom du client");
            String Prenom = sc.nextLine();
            System.out.println("Entrer le mail du client");
            String Mail = sc.nextLine();


            Client CLT1 = new Client(Nom, Prenom, Mail);

            Compte C2 = new Compte(2000.0, CLT1, LocalDate.now());
            C2.MODIFIER(sc);
            System.out.println("Compte modifié avec succès");
            System.out.println(C2.toString());


            break;

        case 3:
            System.out.println("-------------suppression compte------------");
            Banque b1 = new Banque();
            Compte C3 = new Compte(2000.0, new Client("ANOUUSA", "NONOUSSA", "mail"), LocalDate.now());
            b1.ajouterCompte(C3);
            Compte A = new Compte(2000.0, new Client("Aya", "bellaly", "mail"), LocalDate.now());
            b1.ajouterCompte(A);
            Compte C4 = new Compte(2000.0, new Client("hiba", "bellaly", "mail"), LocalDate.now());
            b1.ajouterCompte(C4);

            b1.AfficherCompte();
            System.out.println("Entrer le num du compte à supprimer");
            int num = sc.nextInt();
            b1.supprimerCompte(num);
            System.out.println("Compte supprimé avec succès");
            b1.AfficherCompte();


            break;


        case 4:


            break;


        case 5:


            break;


        case 6:


            break;

        case 7:
            sort=true;
            System.out.println("---------------EXIT----------------");
            System.exit(0);


            break;


        default:
            // code block
    }



}while(!sort);

        }
    }













