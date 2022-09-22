package st.prtc;

import junit.framework.Assert;
import junit.framework.TestCase;

/*
 * Created on May 24, 2004
 * Gary Pollice
 */

/**
 * @author Gary Pollice
 */
public class TriangleTesterTest extends TestCase
{

    private TriangleTester tester = new TriangleTester();

    /**
     * Tests for right triangle.
     */
    public void testRightTriangle()
    {
        TriangleType type = tester.kindOfTriangle(3.0, 4.0, 5.0);
        Assert.assertTrue(type.isRightTriangle());
        type = tester.kindOfTriangle(3.0, 5.0, 4.0);
        Assert.assertTrue(type.isRightTriangle());
        type = tester.kindOfTriangle(5.0, 4.0, 3.0);
        Assert.assertTrue(type.isRightTriangle());
        type = tester.kindOfTriangle(3.0, 3.0, 5.0);
        Assert.assertFalse(type.isRightTriangle());
        type = tester.kindOfTriangle(1.0, 1.0, 1.4142136);
        Assert.assertTrue(type.isRightTriangle());
        Assert.assertTrue(type.isIsoscelesTriangle());	// must be both
    }

    /**
     * Tests for isosceles triangle.
     */
    public void testIsoscelesTriangle()
    {
        TriangleType type = tester.kindOfTriangle(3.0, 3.0, 5.0);
        Assert.assertTrue(type.isIsoscelesTriangle());
        type = tester.kindOfTriangle(3.0, 5.0, 5.0);
        Assert.assertTrue(type.isIsoscelesTriangle());
        type = tester.kindOfTriangle(5.0, 3.0, 5.0);
        Assert.assertTrue(type.isIsoscelesTriangle());
        type = tester.kindOfTriangle(5.0, 6.0, 7.0);
        Assert.assertFalse(type.isIsoscelesTriangle());
    }
    
    /**
     * Tests for equilateral triangle.
     */
    public void testEquilateralTriangle()
    {
        TriangleType type = tester.kindOfTriangle(1.0, 1.0, 1.0);
        Assert.assertTrue(type.isEquilateralTriangle());
        Assert.assertTrue(type.isIsoscelesTriangle());
        type = tester.kindOfTriangle(5.0, 6.0, 7.0);
        Assert.assertFalse(type.isIsoscelesTriangle());       
    }

    /**
     * Tests for the delta value.
     */
    public void testDeltaValues()
    {
        tester.setDelta(0.0);
        TriangleType type = tester.kindOfTriangle(1.0, 1.0, 1.4142136);
        Assert.assertFalse(type.isRightTriangle());
        // Test setting the default in the constructor
        tester = new TriangleTester(0.0);
        type = tester.kindOfTriangle(1.0, 1.0, 1.4142136);
        Assert.assertFalse(type.isRightTriangle());
    }

    /**
     * Tests for supplying the delta along with the kindOfTriangle method call.
     */
    public void testDeltaAsArgument()
    {
        TriangleType type = tester.kindOfTriangle(1.0, 1.0, 1.4142136, 0.0);
        Assert.assertFalse(type.isRightTriangle());
        type = tester.kindOfTriangle(1.0, 1.0, 1.4142136, 0.001);
        Assert.assertTrue(type.isRightTriangle());
    }

    /**
     * Tests for invalid triangles.
     */
    public void testInvalidTriangles()
    {
        TriangleType type = tester.kindOfTriangle(-1.0, -2.0, -3.0);
        Assert.assertEquals(TriangleType.NOT_A_TRIANGLE, type);
        type = tester.kindOfTriangle(1.0, 2.0, 0.0);
        Assert.assertEquals(TriangleType.NOT_A_TRIANGLE, type);
        type = tester.kindOfTriangle(1.0, 1.0, 3.0);
        Assert.assertEquals(TriangleType.NOT_A_TRIANGLE, type);
    }
}