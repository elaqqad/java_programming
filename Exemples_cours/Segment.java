
public class Segment 
{
	private Point p1;
	private Point p2;
	
	public Segment(Point p,Point q)
	{
		this.p1 = p;
		this.p2 = q;
	}
	
    public void deplacer(int dx,int dy)
    {
    	this.p1.deplacer(dx,dy);
    	this.p2.deplacer(dx,dy);
    }
    
    public String toString()
    {   String a;
    	a=this.p1+"______"+this.p2;
    	return a;
    }
}
