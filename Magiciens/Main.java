
public class Main 
{
	public static void main(String[] args) 
	{
        
		Combat com;
		com=new Combat(2,2,2);// 2 Monstres , 2 Sorciers et 2 nains de jardins
		boolean combatContinu=true;
		
		
		// la boucle de la vie qui continue jusqu'à avoir un seul personnage vivant 
        do  
        {
        	com.Attaque();
        	System.out.println(com+"\n");
    		if (com.getNombreVivant()<=1){
        		combatContinu=false;
        	   
        	}
    		
        }while(combatContinu);
       
        
        
           
    }
}
