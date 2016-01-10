
public class Point 
{
	private int x;
	private int y;
	public void deplacer(int dx, int dy)
	  {
		this.x += dx;
		this.y += dy;
	  }
	public Point(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	public String toString()
	  {
		return String.format("(%d,%d)", this.x, this.y);
	  }
	public int getX()
	{
		return this.x;
	}
    public int getY()
    {
    	return this.y;
    }
}
