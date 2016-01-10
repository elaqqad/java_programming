
public abstract class Personnage 
{
	private String nom;
	private int pointV;
	
	public Personnage(String ch,int n){
		this.nom=ch;
		this.pointV=n;
	}
	
	public String getNom(){
		return this.nom;
	}
	
    public int getVie(){
    	return this.pointV;
    }
    
    public String toString(){ 
    	if (this.estMort() ){
    	      return String.format("%s est mort ", this.nom);
        }
        return String.format(" Je m'appelle %s est j'ai %d points de vie", this.nom,this.pointV);
    }
    
    public boolean estMort(){
    	return (this.pointV<=0);
    }
    
    public void addVie(int n){
    	this.pointV+=n;
    }
    
    public abstract void attaque(Personnage p);
    public abstract int subiFrappe(int coup);
    public abstract int subiCharme(int coup);
    
}
