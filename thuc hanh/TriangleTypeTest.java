package st.prtc;

import junit.framework.Assert;
import junit.framework.TestCase;

/*
 * Created on May 26, 2004
 * Gary Pollice
 */

/**
 * TriangleTypeTest
 * @author Gary Pollice
 */
public class TriangleTypeTest extends TestCase
{

    /**
     * Tests to ensure that NOT_A_TRIANGLE cannot be changed.
     */
    public void testConstantNOT_A_TRIANGLE()
    {
        TriangleType.NOT_A_TRIANGLE.setRightTriangle(true);
        Assert.assertFalse(TriangleType.NOT_A_TRIANGLE.isRightTriangle());
        TriangleType.NOT_A_TRIANGLE.setIsoscelesTriangle(true);
        Assert.assertFalse(TriangleType.NOT_A_TRIANGLE.isIsoscelesTriangle());
        TriangleType.NOT_A_TRIANGLE.setEquilateralTriangle(true);
        Assert.assertFalse(TriangleType.NOT_A_TRIANGLE.isEquilateralTriangle());
    }

}
