
import java.util.Scanner;

public class Etudiant {
  int Id;
  String Nom;
  float Moy;

  String tostring() {
    return "Etudiant: " + Nom + "  ID= " + Id + "  MOYENNE= " + Moy;
  }

  public Etudiant(int Id, String Nom, float Moy) {
    this.Id = Id;
    this.Nom = Nom;
    this.Moy = Moy;

  }

  public int getId() {
    return Id;
  }

  public void setid(int newId) {
    this.Id = newId;
  }

  public String getNom() {
    return Nom;
  }

  public void setNom(String newNom) {
    this.Nom = newNom;
  }

  public float getMoy() {
    return Moy;
  }

  public void setMoy(float newMoy) {
    this.Moy = newMoy;
  }
}

