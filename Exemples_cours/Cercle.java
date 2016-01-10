
public class Cercle extends Point
{
	private int rayon;
	
	public Cercle(int a,int b,int r)
	{
		super(a,b);
		this.rayon=r;
	}
	
	public String toString()
	{
		return String.format(" cercle(%d,%d) de rayon: %d",getX(),getY(),rayon);	
	}
	public void homothetie(int k)
	{   
		this.rayon=this.rayon*k; 
	}
	public double perimetre()
	{
		return 2*3.14*this.rayon;
	}
	
}
