package Model;

public class Client {
    private int idClient;
    private String nom;
    private String prenom;
    private String email;
    private int nbc=2;
    //private Compte[] cpt;

    private static int cmpClient=0;

    //getters
    public int getIdClient(){
        return idClient;
    }
    public String getNom(){
        return nom;
    }
    public String getPrenom(){
        return prenom;
    }
    public String getEmail(){
        return email;
    }
   /* public Compte[] getCpt() {
        return cpt;
    }*/
    //setters


    public void setNbc(int nbc) {
        this.nbc = nbc;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public void setEmail(String email){
        this.email=email;
    }
    /*public void setCpt(Compte[] cpt) {
        this.cpt = cpt;
    }*/
    //constructeur par defaut

    public Client(){

            this.idClient=++cmpClient;
            this.nom="nom";
            this.prenom="prenom";
            this.email="email";
            //this.cpt=new Compte[nbc];



    }

    public Client(String nom, String prenom, String email) {
        this.idClient=++cmpClient;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        //this.cpt=new Compte[nbc];
    }
    public String toString(){
        return "idClient: "+idClient+" nom: "+nom+" prenom: "+prenom+" email: "+email;
    }
}


