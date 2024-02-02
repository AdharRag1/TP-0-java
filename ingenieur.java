
class ingenieur extends Etudiant {
  String stage1;
  String stage2;

  public ingenieur(int Id, String Nom, float Moy, String stage1, String stage2){
    super(Id,Nom,Moy);
    this.stage1= stage1;
    this.stage2 = stage2;
  }
 String tostringing(){
   return "ingenieur: " + Nom + "  ID= " + Id + "  MOYENNE= " + Moy + "  STAGE1= " + stage1 + "  STAGE2= " + stage2;
 }
}
