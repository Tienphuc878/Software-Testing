package st.prtc;

/**
 * This class provides test methods for determining the type of triangle
 * corresponding to sides of given lengths.
 * 
 * @author Gary Pollice
 */
public class TriangleTester
{

    private static final double DEFAULT_DELTA = 0.0001;

    private double delta;
    private double currentDelta;	// used for current triangle check

    /**
     * Constructor that sets the default delta.
     */
    public TriangleTester()
    {
        this(DEFAULT_DELTA);
    }

    /**
     * Constructor that takes a default delta.
     * @param defaultDelta the default delta for this TriangleTester
     */
    public TriangleTester(double defaultDelta)
    {
        delta = defaultDelta;
    }

    /**
     * Determine the type of triangle using the default delta.
     * @param side1 length of the first side
     * @param side2 length of the second side
     * @param side3 length of the third side
     * @return TriangleType object that identifies the type of triangle
     */
    public TriangleType kindOfTriangle(double side1, double side2, double side3)
    {
        return kindOfTriangle(side1, side2, side3, delta);
    }
    
    /**
     * Determine the type of triange using the supplied delta.
     * @param side1 length of the first side
     * @param side2 length of the second side
     * @param side3 length of the third side
     * @param thisDelta the precision delta to use for this check
     * @return TriangleType object that identifies the type of triangle
     */
    public TriangleType kindOfTriangle(double side1, double side2, double side3,
            double thisDelta)
    {
        if (!validTriangle(side1, side2, side3)) {
            return TriangleType.NOT_A_TRIANGLE;
        }
        currentDelta = thisDelta;
        TriangleType result = new TriangleType();
        result.setRightTriangle(isRightTriangle(side1, side2, side3));
        result.setIsoscelesTriangle(isIsoscelesTriangle(side1, side2, side3));
        result.setEquilateralTriangle(isEquilateralTriangle(side1, side2, side3));
        return result;
    }
    
    /**
     * Check to ensure that the values passed in as sides can be a valid triangle.
     * @param side1 length of the first side
     * @param side2 length of the second side
     * @param side3 length of the third side
     * @return true if the sides can be a triangle
     */
    private boolean validTriangle(double side1, double side2, double side3)
    {
        if (side1 <= 0.0 || side2 <= 0.0 || side3 <= 0.0) return false;
        return (!(side1 >= side2 + side3 ||
                side2 >= side1 + side3 ||
                side3 >= side1 + side2));
    }
 
    /**
     * Check for right triangle.
     * @param side1 length of the first side
     * @param side2 length of the second side
     * @param side3 length of the third side
     * @return true if the triangle is a right triangle.
     */
    private boolean isRightTriangle(double side1, double side2, double side3)
    {
        double s1Squared = side1 * side1;
        double s2Squared = side2 * side2;
        double s3Squared = side3 * side3;

        double x = java.lang.Math.abs(s1Squared + s2Squared - s3Squared);
        if (x <= currentDelta) return true;
        x = java.lang.Math.abs(s1Squared + s3Squared - s2Squared);
        if (x <= currentDelta) return true;
        x = java.lang.Math.abs(s2Squared + s3Squared - s1Squared);
        return (x <= currentDelta);
    }

    /**
     * Check for an isoscelese triangle. The delta does not come into play here.
     * @param side1 length of the first side
     * @param side2 length of the second side
     * @param side3 length of the third side
     * @return true if the triangle is an isosceles triangle.
     */
    private boolean isIsoscelesTriangle(double side1, double side2, double side3)
    {
        return (side1 == side2 || side1 == side3 || side2 == side3);
    }
    
    /**
     * Check for an equilateral triangle. The delta does not come into play here.
     * @param side1 length of the first side
     * @param side2 length of the second side
     * @param side3 length of the third side
     * @return true if the triangle is an equilateral triangle.
     */
    private boolean isEquilateralTriangle(double side1, double side2, double side3)
    {
        return (side1 == side2 && side2 == side3);
    }
     /**
     * Getter method for the delta. Generated by Eclipse.
     * @return the delta value
     */
    public double getDelta()
    {
        return delta;
    }

    /**
     * Setter method for the delta. Generated by Eclipse.
     * @param delta the new value for the delta.
     */
    public void setDelta(double delta)
    {
        this.delta = delta;
    }
}