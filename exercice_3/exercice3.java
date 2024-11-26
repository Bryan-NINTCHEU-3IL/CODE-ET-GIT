public class StockManager {
    /**
     * @param création des variables et déclarationdes fonctions 
     */
    private String typeOperation;
    private String produit;
    private int quantite;
    private int stock;



    // gere le stock
    public void gererStock(String typeOperation, String produit, int quantite, int stock) {
        // Ajout au stock
        System.out.println("Entrer une opération à effectuer sur le produit");
        switch(typeOperation){
            case "ajout":
                Ajouterquantite();
            break;
            case "retrait":
                Retraitquantite();
            break;
            default:
                   System.out.println("Opération inconnue.");
        }

        private static int Ajouterquantite(int quantite,int stock){
            stock += quantite;
            System.out.println("Produit : " + produit + ", Stock après ajout : " + stock);
        }

        private static int Retraitquantite(int quantite, int stock){
            stock -= quantite;
                System.out.println("Produit : " + produit + ", Stock après retrait : " + stock);
        }
        
          
        
    }
}
