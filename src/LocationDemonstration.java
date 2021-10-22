
// FILE: LocationDemonstration.java
// This small demonstration program shows how to use the Location class
// from the edu.colorado.geometry package.
import edu.colorado.geometry.Location;
public class LocationDemonstration
{public static void main(String[ ] args)
{
    final double STILL_X = -2.0;
    final double STILL_Y = -1.5;
    final int ROTATIONS = 2;
    Location still = new Location(STILL_X, STILL_Y);
    Location mobile = still.clone( );
    printData(still, mobile);
    System.out.println("I will rotate one location by two 90-degree turns.");
    specifiedRotation(mobile, ROTATIONS);
    printData(still, mobile);
}
// Rotate a Location p by a specified number of 90-degree clockwise rotations.
public static void specifiedRotation(Location p, int n)
{
    while (n > 0)
    {
        p.rotate90( );
        n--;
    }
}
// Print some information about two locations: s (a “still” location) and m (a “mobile” location).
public static void printData(Location s, Location m)
{
    System.out.println("The still location is at: " + s.toString( ));
    System.out.println("The mobile location is at: " + m.toString( ));
    System.out.println("Distance between them: " + Location.distance(s, m));
    if (s.equals(m))
        System.out.println("These two locations have equal coordinates.");
    else
        System.out.println("These two locations have different coordinates.");
    System.out.println( );
}
}
