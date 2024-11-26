public class GestionnaireNotes {

    /**
     * @param déclaration des variables et des fonctions
     */

    private String nomEtudiant;
    private int [] notes;
    private double moyenne;


    // Affiche note et moyennes
    public void afficherNotesEtMoyenne(String nomEtudiant, int[] notes) {
        // Affichage des notes
        System.out.println("Notes de " + nomEtudiant + ":");
        for (int note : notes) {
            System.out.println("- " + note);
        }
        return 0;
    }

    public int somme ( int somme){
        
        for (int note : notes) {
            somme += note;
        }
        return somme;

    }
    public double calculmoyenne(double moyenne ,int somme){
        moyenne= (double) somme /notes.length;
        System.out.println("Moyenne :" +moyenne);
        return moyenne;
    }
    
}
        
    

