
public class Main 
{
	public static void main(String[] args) 
	{
		Personnage[] tab;
		tab= new Personnage[10];
		boolean combat_continu=true;
    	int non_mort[]={0,1,2,3,4,5,6,7,8,9};
    	int k=10;
		
		
		// la saisie des noms des monstres au clavier !!
		for (int i=0;i<5;i++){ 
			 String temp_nom;
			 java.util.Scanner entree = new  java.util.Scanner (System.in);
		     System.out.println("Entrez le nom du monstre numero :"+(i+1));
		     temp_nom=entree.next();
			 tab[i]=new Monstre(temp_nom,(int) (Math.random()*100));
	       }
		
		
		
		
		//la saisie des noms des sorciers au clavier!!!
		for (int i=5;i<10;i++){
			 String temp_nom;
			 java.util.Scanner entree = new  java.util.Scanner (System.in);
		     System.out.println("Entrez le nom du sorcier numero :"+(i+1));
		     temp_nom=entree.next();
			 tab[i]=new Monstre(temp_nom,(int) (Math.random()*100));
	       }
		
		
		
		// affichage initial des noms des combattant
		for (int i=0;i<10;i++){
			System.out.println("tab["+i+"]= "+tab[i]);
		  }
		
		
		
		// la boucle de la vie qui continue jusqu'à avoir un seul vivant
        do  
        {
        	int premier;
        	int deuxieme;

        	/*Astuce : on peut dans un premier temps considerer une variable qui determine le nombre de combatant qui ne sont 
        	 *pas morts ce qui permet de determiner la fin de la boucle caracterisé par le nombre de vivants<=9 ,Mais dans ce 
        	 *cas lorsque on tire au hazard les personnages on choisi n'import quel combattant ceci fait que les morts peuvent 
        	 *attaquer les vivants (et vis versa )!!,pour eviter ce probleme je considère la variable non_mort qui va contenir 
        	 *les indices des personnages vivants et enfin a chaque etape on choisi deux personnages vivants. Et enfin cette 
        	 *astuce va réduire énormément le nombre de fois d'execution de la boucle while . */
        	

        

        	// On choisit le premier au hazard dans l'ensemble des vivants et on choisit un deuxième combattant différent de premier
        	premier =non_mort[(int) (Math.random()*k)];
        	do{
        		deuxieme =non_mort[(int) (Math.random()*k)];
        	} while (premier!=deuxieme);
        		
        	
        	
        	// on passe à l'action
        	tab[premier].attaque(tab[deuxieme]);
        	
        	
        	
        	// on affiche les personnages sous forme d'une liste 
        	String chaine="[";
    		for (int i=0;i<10;i++){
  			chaine+="(nom:  "+tab[i].getNom()+", points:  "+tab[i].getVie()+") ";
  		    }
    		System.out.println(chaine+"]\n");
    		
    		
        	// on remplit le tableau des personnages vivants
    		k=0;
    		for (int i=0;i<10;i++){
    			if (! tab[i].estMort()) {
    				non_mort[k]=i;
    				k++;
    			}
  		    }
    		
    		
    		
    		// on exprime la condition de la continuité du combat
        	if (k <=1){
        		combat_continu=false;
        		break;
        	}
        }while(combat_continu);
        
        
        
		// affichage final des noms des combattant
		for (int i=0;i<10;i++){
			System.out.println("tab["+i+"]= "+tab[i]);
		  }
           
    }
}
