
public class Main 
{
	public static void main(String[] args) 
	{
		Point   p1 = new Point(3,2);
		Point   p2 = new Point(5,1);
		Segment s  = new Segment(p1,p2);
		Cercle  c  = new Cercle(1,2,3);
		
		
		// affichage du point p1 avant et apres deplacement
		System.out.println("Point avant deplacement :" + p1);
		p1.deplacer(2, 2);
		System.out.println("\nPoint apres deplacement :" + p1);
		
		// affichage du segment avant et apres deplacement
		System.out.println("\nSegment avant deplacement :" + s);
		s.deplacer(1, 1);
		System.out.println("\nSegment apres deplacement :"+s);
		
		//affichage du cercle avant et apres deplacement et homothetie
		
		System.out.println("\nCercle avant deplacement :" + c);
		c.deplacer(1,2);
		System.out.println("\nCercle après deplacement :" + c);
		c.homothetie(3);
		System.out.println("\nCercle après homothetie  :" + c);
		
	}
}
