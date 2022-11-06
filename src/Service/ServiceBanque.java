package Service;

import Model.Banque;

public class ServiceBanque {

    private static Banque banque;

    public ServiceBanque(Banque banque) {
        this.banque = banque;
    }

    public static void afficherBanque() {
        System.out.println("Banque : " + banque.getNomBanque());
        System.out.println("Email : " + banque.getEmailBanque());
        System.out.println("Nombre de clients : " + banque.getMaxClient());
        System.out.println("Nombre de comptes : " + banque.getTableCompte());
    }
}

