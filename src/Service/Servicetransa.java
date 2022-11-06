package Service;

import Model.Compte;

public class Servicetransa {



    public boolean verser(double montant, Compte c){
       int cpt=0;
        if(montant>0){

            for (int i=0;i<c.getTablejournalisation().length;i++){
                if(c.getTablejournalisation()[i]!=null){
                    cpt=i+1;
                    break;
                }
            }

            c.ajouter(montant,cpt);
            return true;
        }
        return false;
    }

    public boolean retirer(double montant, Compte c){
        int cpt=0;


        for (int i=0;i<c.getTablejournalisation().length;i++){
            if(c.getTablejournalisation()[i]!=null){
                cpt=i+1;
                break;
            }
        }
        if(montant>0 && c.getSolde()>=montant){

            c.retirer(montant,cpt);
            return true;
        }
        return false;
    }

    public boolean virement(double montant, Compte c1, Compte c2){
        int cpt=0;
        int cpt2=0;

        for (int i=0;i<c1.getTablejournalisation().length;i++){
            if(c1.getTablejournalisation()[i]!=null){
                cpt=i+1;
                break;
            }
        }
        for (int i=0;i<c2.getTablejournalisation().length;i++){
            if(c2.getTablejournalisation()[i]!=null){
                cpt2=i+1;
                break;
            }
        }


        if(montant>0 && c1.getSolde()>=montant){
            c1.retirer(montant, cpt);
            c2.ajouter(montant, cpt2);
            return true;
        }
        return false;
    }






}
