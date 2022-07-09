package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {
@Test
public void testDistance(){
    Point p1 = new Point(3,2);
    Point p2 = new Point(3,3);
    Assert.assertEquals(p1.distance(p2),1.0);

}
    @Test
    public void testDistanceNegative() {
        Point p1 = new Point(3, 2);
        Point p2 = new Point(3, 3);
        Assert.assertEquals(p1.distance(p2), 2.0);
    }

    }
