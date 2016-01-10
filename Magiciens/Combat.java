import java.util.*;


public class Combat {
	
	private int s;// nombre de sorciers
	private int m;// nombre de monstres
	private int n;// nombre de nains de jardins
	private Personnage[] tabPerson; 
	private Naindejardin[] tabNain;
	public Combat(int s,int m,int n){
		
		this.s=s;
		this.m=m;
		this.n=n;
		
		this.tabPerson=new Personnage[this.s+this.m];
		this.tabNain=new Naindejardin[this.n];
		
		
		
		java.util.Scanner entree= new  java.util.Scanner (System.in);
		String temp_nom="";
		int i;
		double temp;
		
		// la saisie des noms des monstres au clavier !!
		for (i=0;i<this.m;i++){ 
		     System.out.println("Entrez le nom du monstre numero :"+(i+1));
		     temp_nom=entree.next();
			 this.tabPerson[i]=new Monstre("Mo "+temp_nom,(int) (Math.random()*100));
			 
	       }
		
		
		
		//la saisie des noms des sorciers au clavier!!!
		for (i=0;i<this.s;i++){
		     System.out.println("Entrez le nom du sorcier numero :"+(i+1));
		     temp_nom=entree.next();
			 this.tabPerson[i+this.m]=new Monstre("So "+temp_nom,(int) (Math.random()*100));
	       }
		// si temp >1/2 alors le dernier est un magicien
		temp=Math.random();
		if (temp>1/2){
			this.tabPerson[this.m+this.s-1]=new Monstre("Ma "+temp_nom,(int) (Math.random()*100));
		}
		
		
		// le remplissement de nain de jardin 
		for (i=0;i<this.s;i++){
			 this.tabNain[i]=new Naindejardin((int) (Math.random()*100));
	       }
		// si temp >1/2 alors le dernier est un magicien
		temp=Math.random();
		if (temp>1/2){
			this.tabNain[this.n-1]=new Gnomedejardin((int) (Math.random()*100));
		}
		
		entree.close();
	}
	
	
	// Cette fonction retourne une listes des indices des personnages et Nains de jardin vivants
	public List<Integer> tousVivant(){
		List<Integer> nonMort = new Vector<Integer>(this.perVivant()); 
		for (int i=0;i<this.n;i++){
			if (! this.tabNain[i].estMort()) {
				nonMort.add(i+this.m+this.s);
			
				}
		}
		return nonMort;
	}
	
	
	// Cette fonction retourn une listes desindices des personnages vivants
	public  List<Integer> perVivant(){
		List<Integer> nonMort = new Vector<Integer>(); 
		for (int i=0;i<this.s+this.m;i++){
			if (! this.tabPerson[i].estMort()) {
				nonMort.add(i);
				}
		}
		return nonMort;
	}	
	
	// Cette fonction permet de choisir deux element un personnage et une victime 
	// pour faire une attaque 
	
	
	public void Attaque(){
		int attaquantIndex=(int) (Math.random()*this.perVivant().size());
		Personnage perAttaquant=this.tabPerson[attaquantIndex];
		int victimeIndex;
		Victime vict;
    	do{
    		 victimeIndex=(int) (Math.random()*this.tousVivant().size());
    	} while (attaquantIndex!=victimeIndex);
    	if (victimeIndex< this.s+this.m){
    		vict=this.tabPerson[victimeIndex];
    		
    	}else{
    		vict=this.tabNain[victimeIndex-this.s-this.m];
    	}
    	
    	perAttaquant.attaque(vict);
    	return;
	}
	
	
	// Retourne le nombre de personnages vivants
	public int getNombreVivant(){
		return this.perVivant().size();
	}
	
	
	// retourne l'affichage d'une liste de personnage+Nains de jardins
	public String toString(){
    	String chaine="\n";
		for (int i=0;i<this.m+this.s;i++){
			chaine+=this.tabPerson[i]+"\n";
		    }
		for (int i=0;i<this.n;i++){
			chaine+=this.tabNain[i]+"\n";
		    }
		return chaine;
	}
	

}
