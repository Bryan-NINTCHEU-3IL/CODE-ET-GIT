public class FactureManager {

    /**
     * @param création des variables et déclarations des variables 
     */
    public String typeProduit;
    public int quantite;
    public double prixUnitaire;

    /**
     * @param calcul d'une facture avec la methode calculerfactue
     * 
     */
    public double calculerfactue(int quantite,double prixUnitaire){
        double total = quantite *prixUnitaire;
        return total;
    }

    switch(typeProduit){

        case "Alimentaire":
            Alimentaire();
            break;
        case "Electronique":
            Electronique();
            break;
        case "Luxe":
            Luxe();
            break;
            default: 
            System.out.println ("Aucune réduction spécifique pour ce tyepe : " )

    }
    /**
     * @param déclartion des méthodes pour l'appel  
     */

    private static doulble Alimentaire(double total){

        return total -= total*0.05;
    }

    private static doulble Electronique(double total){
        
        return total -= total*0.1;
    }
    private static double Luxe (double total){

        return total -= total *0.15;
        
    }
        // Reduction sur le total
        if (total > 1000) {
            total -= total * 0.05; // Réduction supplémentaire de 5% pour les gros montants
        }

        return total;
    }

