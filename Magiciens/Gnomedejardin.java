
public class Gnomedejardin extends Naindejardin implements Superpouvoir{
	   private int solidite;
	   
	   
	  // Constructeur
	   public Gnomedejardin(int s){
			super(s);
			this.solidite=super.getSolidite();
		}
	   
      // la methode sort()
	   public double sort(){
		   return this.solidite*Math.random();
	   }
	   
	  //la methode subicharme
	   public int subiCharme(int coup){
			double x=this.sort();
			if (x>coup) return -coup;
			return -1;
			}
	   
	  
	   //l'affichage
	   public String toString(){ 
	    	if (this.solidite<=0 ){
	    	      return String.format("Un gnome de jardin est mort");
	        }
	        return String.format("Je suis un gnome de jardin de solidite: %d", this.solidite);
	    }
	   
}
