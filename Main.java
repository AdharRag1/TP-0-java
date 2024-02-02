import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    String nom;
    int id;
    float moy;
    String stage1;
    String stage2;
    String pfe;
    String type;
    int taille;
    Scanner scan = new Scanner(System.in);
    System.out.println("donner le nombre des utilisateurs");
    taille = scan.nextInt();//pour connaitre la taille exacte du tableau a cree 
    String  tableau[ ] = new String[taille];
    
    System.out.println("etudiant ingénieur ou lmd");
    type = scan.next();// pour connaitre le type de l'utilisateur etudiant ingénieur ou lmd
    
//faire condition pour le type de l'utilisateur 
    for (int i = 0; i < taille; i++){
    if (type.equals("lmd")) {
      System.out.println("donner le nom");
      nom = scan.next();
      System.out.println("donner l'id");
      id = scan.nextInt();
      System.out.println("donner la moyenne");
      moy = scan.nextFloat();
      System.out.println("donner le pfe");
      pfe = scan.next();
      lmd C = new lmd(id, nom, moy, pfe);
      tableau[i] ="nom: "+nom+" id: "+id+" moy: "+moy+"pfe: "+pfe;

    } else if (type.equals("etudiant")) {
      System.out.println("donner le nom");
      nom = scan.next();
      System.out.println("donner l'id");
      id = scan.nextInt();
      System.out.println("donner la moyenne");
      moy = scan.nextFloat();
      Etudiant A = new Etudiant(id, nom, moy);
      tableau[i] ="nom: "+nom+" id: "+id+" moy: "+moy;
      

    } else if (type.equals("ingenieur")) {

      System.out.println("donner le nom");
      nom = scan.next();
      System.out.println("donner l'id");
      id = scan.nextInt();
      System.out.println("donner la moyenne");
      moy = scan.nextFloat();
      System.out.println("donner le stage1");
      stage1 = scan.next();
      System.out.println("donner le stage2");
      stage2 = scan.next();
      ingenieur B = new ingenieur(id, nom, moy, stage1, stage2);
      tableau[i] ="nom: "+nom+" id: "+id+" moy: "+moy+ " stage1: "+stage1+" stage2: "+stage2;
  
  }
  
  }
  for (int i = 0; i < taille; i++){
     System.out.println(tableau);
  }
}
}
