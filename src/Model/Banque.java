package Model;


import java.util.Arrays;

public class Banque {

    private int idBanque;
    private String nomBanque;
    private String emailBanque;
    private int maxCompte;
    private int maxClient;
    private Compte[] tableCompte=new Compte[maxCompte];
    private Client[] tableClient;
    private static int cmpBanque=0;


    public Banque(String nomBanque, String emailBanque, int maxCompte, int maxClient, Compte[] tableCompte, Client[] tableClient) {
        this.idBanque = ++cmpBanque;
        this.nomBanque = nomBanque;
        this.emailBanque = emailBanque;
        this.maxCompte =    10;
        this.maxClient = maxClient;
        this.tableCompte = new Compte[maxCompte];
        this.tableClient = new Client[maxClient];

    }

    public Banque() {
        this.idBanque = ++cmpBanque;
        this.nomBanque = "nomBanque";
        this.emailBanque = "emailBanque";
        this.maxCompte = 10;
        this.maxClient = maxClient;
        this.tableCompte = new Compte[maxCompte];
        this.tableClient = new Client[maxClient];


    }

    public int getIdBanque() {
        return idBanque;
    }

    public String getNomBanque() {
        return nomBanque;
    }

    public String getEmailBanque() {
        return emailBanque;
    }

    public int getMaxCompte() {
        return maxCompte;
    }

public int getMaxClient() {
        return maxClient;
    }

    public Compte[] getTableCompte() {
        return tableCompte;
    }

    public Client[] getTableClient() {
        return tableClient;
    }



    public void setNomBanque(String nomBanque) {
        this.nomBanque = nomBanque;
    }



    public void setEmailBanque(String emailBanque) {
        this.emailBanque = emailBanque;
    }



    public void setMaxCompte(int maxCompte) {
        this.maxCompte = maxCompte;
    }



    public void setMaxClient(int maxClient) {
        this.maxClient = maxClient;
    }



    public void setTableCompte(Compte[] tableCompte) {
        this.tableCompte = tableCompte;
    }



    public void setTableClient(Client[] tableClient) {
        this.tableClient = tableClient;
    }



    public void ajouterCompte(Compte c){
        for (int i = 0; i < tableCompte.length; i++) {
            if(tableCompte[i]==null){
                tableCompte[i]=c;
                break;
            }
        }
    }

    public void SupprimerCompte(Compte c){
        for (int i = 0; i < tableCompte.length; i++) {
            if(tableCompte[i].getIdCompte()==c.getIdCompte()){
               for(int j=i;j<tableCompte.length-1;j++){
                   tableCompte[j]=tableCompte[j+1];
               }
            }
        }


    }












    @Override
    public String toString() {
        return "Banque{" +
                "idBanque=" + idBanque +
                ", nomBanque='" + nomBanque + '\'' +
                ", emailBanque='" + emailBanque + '\'' +
                ", maxCompte='" + maxCompte + '\'' +
                ", maxClient='" + maxClient + '\'' +
                ", tableCompte=" + Arrays.toString(tableCompte) +
                ", tableClient=" + Arrays.toString(tableClient) +
                '}';
    }

    public void ajouterClient(Client c){
        for (int i = 0; i < tableClient.length; i++) {
            if(tableClient[i]==null){
                tableClient[i]=c;
                break;
            }
        }
    }


    public void AfficherCompte(){
        for (int i = 0; i < tableCompte.length; i++) {
            if(tableCompte[i]!=null){
               // System.out.println(tableCompte[i]);
                Compte C=tableCompte[i];
                System.out.println(C.toString());

            }
        }
    }


    public void supprimerCompte(int num) {

      for (int i = 0; i < tableCompte.length; i++) {
            if(tableCompte[i].getIdCompte()==num){
                for(int j=i;j<tableCompte.length-1;j++){
                    tableCompte[j]=tableCompte[j+1];
                }
                break;
            }
        }

    }
}












