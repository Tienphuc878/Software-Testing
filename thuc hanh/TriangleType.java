package st.prtc;

/**
 * @author Gary Pollice
 * This class contains information about a triangle. There are methods to
 * set triangle properties and query them.
 */
public class TriangleType extends TriangleTester {
    public static final TriangleType NOT_A_TRIANGLE = new TriangleType();
    
    private boolean rightTriangle = false;
    private boolean isoscelesTriangle = false;
    private boolean equilateralTriangle = false;

	public TriangleType() {
	
	}
	
	/**
	 * Get the right triangle property of this triangle type.
	 * @return true if the triangle is a right triangle
	 */
	public boolean isRightTriangle() {
	    return rightTriangle;
	}
	
	/**
	 * Setter function for the rightTriangle property.
	 * @param isRight true if the triangle is a right triangle
	 */
	public void setRightTriangle(boolean isRight) {
	    if (this != NOT_A_TRIANGLE) {
	        rightTriangle = isRight;
	    }
	}
	
	/**
	 * Get the equilateral triangle property of this triangle type.
	 * @return true if the triangle is an equilateral triangle
	 */
   public boolean isEquilateralTriangle()
    {
        return equilateralTriangle;
    }
   
	/**
	 * Setter function for the equilateralTriangle property.
	 * @param isEquilateral true if the triangle is an equilateral triangle
	 */
   public void setEquilateralTriangle(boolean isEquilateral)
    {
    	if (this != NOT_A_TRIANGLE) {
    	    equilateralTriangle = isEquilateral;
    	}
    }
    
	/**
	 * Get the isosceles triangle property of this triangle type.
	 * @return true if the triangle is an isosceles triangle
	 */
    public boolean isIsoscelesTriangle()
    {
        return isoscelesTriangle;
    }
    
	/**
	 * Setter function for the isoscelesTriangle property.
	 * @param isIsosceles true if the triangle is an isosceles triangle
	 */
    public void setIsoscelesTriangle(boolean isIsosceles)
    {
        if (this != NOT_A_TRIANGLE) {
            isoscelesTriangle = isIsosceles;
        }
    }
}
