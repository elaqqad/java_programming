
public class Naindejardin implements Victime {
	   private int solidite;
	   
	   // le constructeur 
	   public Naindejardin(int s){
			this.solidite=s;
		}
	  
	   // la fonction subir une frappe 
	   public int subiFrappe(int coup){
		if (coup>this.solidite ){
			int s=this.solidite;
			this.solidite=0;
			return -s;
	     }else{
			return coup;
			}
		}

	
	   // la fonction subir une charme
	   public int subiCharme(int coup){
		   return -1;
	    }
	
	   // lafonction get solidite
	   public int getSolidite(){
		   return this.solidite;
	
	   }
    
	   public String toString(){ 
    	
		   if (this.solidite<=0 ){
			   return String.format(" Un nain de jardin est mort");
		   }
		   return String.format(" Je suis un nain de jardin de solidite: %d", this.solidite);
	   }
    
	   public  boolean estMort(){
		   return (this.solidite==0);
	   }
	
}
