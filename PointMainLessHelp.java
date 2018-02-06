// A program that deals with 2D points.
// Fifth version, to accompany immutable Point class.

public class PointMainLessHelp {
    public static void main(String[] args) {
        // create two Point objects
        PointLess p1 = new PointLess(0,0);
        PointLess p2 = new PointLess(5,5);

        // print each point and its distance from origin
        System.out.println("p1 is " + p1);
        System.out.println("p1 distance from origin = " + p1.distanceFromOrigin());

        System.out.println("p2 is " + p2);
        System.out.println("p2 distance from origin = " + p2.distanceFromOrigin());
        
        PointLess other = new PointLess(10,1);
        

        // translate each point to a new location
        p1 = p1.translate(10,7);
        p2 = p2.translate(15,10);

        // print the points again
        System.out.println("p1 translated is now " + p1);
        System.out.println("p2 translated is now " + p2);
    }
}
