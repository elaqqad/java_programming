
public class Monstre extends Personnage
{
	
	public Monstre(String nom,int pv){
		super(nom,pv);
	}
	
	
	//la fonction attaque
      public void attaque(Personnage p){
    	  if (super.estMort()){
	    	 return;
	      }else{
	    	  int re_coup;
	          re_coup=p.subiFrappe((int) (super.getVie()+1)/2);
	          super.addVie(-re_coup);
	          return;
	          }
	}
      
      
    //la fonction de subir une charme
    public int subiFrappe(int coup){
    	super.addVie(-coup);
	    return (int) super.getVie()/2;
     }
     
    
    
    // la fonction de subir une charme
    public int subiCharme(int coup){
    	super.addVie(-coup);
	    return (super.getVie()+1)/2;
    }

}
