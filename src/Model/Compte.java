package Model;

import java.time.LocalDate;

public class Compte {



    private  static int cpt=0;
    private  int idcompte;
    private  double solde;
    private  LocalDate DateCreation;
     private  String[] tablejournalisation;
      private  Client Proprietaire;

        public Compte(double solde, Client Proprietaire, LocalDate DateCreation) {

            if (solde < 0) {
                System.out.println("le solde doit etre positif");
            } else {
               // this.solde = solde;
                this.DateCreation = DateCreation;
                this.Proprietaire = Proprietaire;
                this.idcompte = ++cpt;
                this.tablejournalisation = new String[10];


            }
        }




         public Compte() {

                 this.solde = 0;
                 this.DateCreation = DateCreation;
                 this.Proprietaire = new Client();
                 this.idcompte = ++cpt;
                 this.tablejournalisation = new String[10];

             }



    public  double getSolde() {
        return solde;
    }

    public LocalDate getDateCreation() {
        return DateCreation;
    }

    public  String[] getTablejournalisation() {
        return tablejournalisation;
    }

    public Client getProprietaire() {
        return Proprietaire;
    }

    public  int getIdcompte() {
        return idcompte;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }


    public void setDateCreation(LocalDate DateCreation) {
        this.DateCreation = DateCreation;
    }

    public void setProprietaire(Client Proprietaire) {
        this.Proprietaire = Proprietaire;
    }





    public void ajouter(double montant,int i){
        this.solde+=montant;
        this.tablejournalisation[i]= "ajout de "+montant+" le "+LocalDate.now();
        i++;
    }


    @Override
    public String toString(){
        return "{" + "idcompte=" + idcompte + "     " +", solde=" + solde +"      "+", DateCreation=" + DateCreation +"      "+ ", Proprietaire=" + Proprietaire.toString() + '}';
    }

    @Override
    public boolean equals(Object obj) {



        final Compte other = (Compte) obj;
        if (this.idcompte != other.idcompte) {
            return false;
        }
        return true;
    }

    public void retirer(double montant,int i) {
        if(solde>=montant){
            this.solde-=montant;
            tablejournalisation[i]= "retrait de "+montant+" le "+LocalDate.now();
            i++;
        }
        else{
            System.out.println("solde insuffisant");
        }
    }

    public int getIdCompte() {
        return idcompte;
    }
}










