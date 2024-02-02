
class lmd extends Etudiant {
  String pfe;

  lmd(int Id, String Nom, float Moy, String pfe) {
    super(Id,Nom,Moy);
    this.pfe = pfe;
  }

  String tostringlmd() {
    return "LMD: " + this.Nom + "  ID= " + this.Id + "  MOYENNE= " + this.Moy + " PFE: " + this.pfe;
  }
}
