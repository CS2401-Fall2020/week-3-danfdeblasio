import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;

public class tester{
  public static void main(String[] args){
    Result result = JUnitCore.runClasses(tester.class);

    for (Failure failure : result.getFailures()) {
      System.out.println(failure.toString());
    }

    System.out.println(result.wasSuccessful());
  }
  
  /* Example from the README */
  @Test
  public void validLocationsExtractRect() {
    int[][] input = {{1,2},{3,4,5},{6,7}};
    int[][] output = {{1,2},{3,4},{6,7}};
    assertArrayEquals(output, extractAndTest.extractSubArray(input, 0, 2, 0, 1));
  }
  
  @Test
  public void invalidLocationsXOrder() {
    int[][] input = {{1,2},{3,4,5},{6,7}};
    assertNull(extractAndTest.extractSubArray(input, 2, 0, 0, 1));
  }
  
  @Test
  public void invalidLocationsYTooBig() {
    int[][] input = {{1,2},{3,4,5},{6,7}};
    assertNull(extractAndTest.extractSubArray(input, 0, 1, 0, 2));
  }

  @Test
  public void invalidLocationsYTooBig2() {
    int[][] input = {{1, 2, 3},{1, 2},{6,7, 8}};
    int[][] output = {{1,2},{1, 2},{6,7}};

    assertArrayEquals(output, extractAndTest.extractSubArray(input, 0, 2, 0, 1));
    assertNull(extractAndTest.extractSubArray(input, 0, 2, 0, 2));
  }

  @Test
  public void invalidLocationsYTooBig3() {
    int[][] input = {
            {1, 2, 3},
            {1, 2, 3},
            {6,7, 8}};
    int[][] output = {
            {1, 2, 3},
            {6,7, 8}};
    int[][] ans = extractAndTest.extractSubArray(input, 1, 2, 0, 2);



    for(int i = 0; i < ans.length; i++){
      for(int j = 0; j < ans[i].length; j++){
        System.out.print(ans[i][j]);
      }
      System.out.println("");
    }
    assertArrayEquals(output, ans);
  }

  @Test
  public void rowMinGreaterThanZero() {
    int[][] input = {
            {1, 2, 3, 5},
            {1, 2, 3},
            {6, 7, 8, 9}};
    int[][] output = {{1, 2, 3}, {1, 2, 3}, {6, 7, 8}};

    assertArrayEquals(output, extractAndTest.extractSubArray(input, 0, 2, 0, 2));
  }
  
  @Test
  public void hasTrue() {
    boolean[][] input = {{true,false},{false},{false,false,false,false}};
    assertFalse(extractAndTest.noneTrue(input));
  }
}
