
public class Sorcier extends Personnage {
	   private double p;
	   
	   // le constructeur du sorcier
	   public Sorcier(String nom,int pv){
			super(nom,pv);
			this.p=Math.random();
		}
	  
	   
	   // la fonction d'attaque
	   public void attaque(Victime p){
		   if (super.estMort()){
			    return;
		    }else{
		    	int re_coup;
		        re_coup=p.subiCharme((int) (super.getVie()*this.p));
		        super.addVie(re_coup);
		        return;
		     }
		
	     }
	// la fonction de subir une frappe 
	public int subiFrappe(int coup){
		super.addVie(-coup);
		return (int) (-super.getVie()*this.p);
	     }

	// la fonction de subir une charme
	public int subiCharme(int coup){
		return 0;
	    }
	// la fonction de subir une charme
	public double getPouvoir(){
		return this.p;
	    }
}

