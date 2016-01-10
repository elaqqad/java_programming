
public class Magicien extends Sorcier implements Superpouvoir{
	   
	   private double p;
	   
	   
	   // le constructeur d'unmagicien
	   public Magicien(String nom,int pv){
			super(nom,pv);
			this.p=super.getPouvoir()*extra;
		}
	   
	   // le sort() d'unmagicien
	   public double sort(){
		   return this.p*Math.random();  
	   }
	   
	   
	   //La fonction definissons la subition d'une charme
		public int subiCharme(int coup){
			return (int)this.sort()*coup;
		}
}
