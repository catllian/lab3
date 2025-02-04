import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	//@Test 
	//public void testReverseInPlace() {
  //  int[] input1 = { 3 };
  //  ArrayExamples.reverseInPlace(input1);
  //  assertArrayEquals(new int[]{ 3 }, input1);
	//}

  //@Test
  //public void testReverseInPlace2() {
  //  int[] input2 = {1, 2, 3};
  //  ArrayExamples.reverseInPlace(input2);
  //  assertArrayEquals(new int[]{3, 2, 1}, input2);
  //}

  //@Test
  //public void testReversed() {
  //  int[] input1 = { };
  //  assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  //}

  //@Test
  //public void testReversed2() {
  //  int[] input3 = {1, 2, 3};
  //  assertArrayEquals(new int[]{3, 2, 1}, ArrayExamples.reversed(input3));
  //}

  @Test
  public void testAverageWithoutLowest1() {
    double[] input4 = {1.0, 1.0, 2.0};
    assertEquals(2.0 / 1, ArrayExamples.averageWithoutLowest(input4), 0.0);
  }

  @Test
  public void testAverageWithoutLowest2() {
    double[] input5 = {1.0, 2.0};
    assertEquals(2.0 / 1, ArrayExamples.averageWithoutLowest(input5), 0.0);
  }
}
