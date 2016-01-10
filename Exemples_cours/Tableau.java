
public class Tableau 
{
   
	private int[] tab;
	
	public Tableau(int n)
	{
		this.tab= new int[n];
		for (int i=0;i<n; i++)
		{
			this.tab[i]=(int) (10*Math.random());
		}
	}
	
	public void afficher()
	{
		int n;
		n=this.tab.length;
		for (int i=0 ;i<n;i++)
		{
			System.out.println("tableau["+i+"]="+tab[i]);
			
		}
	}
		
	public int produit()
		{
			int n,p=1;
			n=this.tab.length;
			for (int i=0 ;i<n;i++)
			{
					p*=tab[i];
					if (p==0 ){return 0;}
			}
			return p;
	}
	
	

	public static void main(String[] args) {
		Tableau t;
		t= new Tableau(10);
		// TODO Auto-generated method stub
		t.afficher();
		System.out.println("Le produit de tout les element est : "+t.produit());

	}

}
