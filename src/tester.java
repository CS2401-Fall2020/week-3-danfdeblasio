import static org.junit.Assert.*;

import org.junit.Test;


public class tester {


  @Test
  public void invalidLocationsYMin() {
    int[][] input = {{1,2},{3,4,5},{6,7}};
    assertNull(extractAndTest.extractSubArray(input, 0, 1, -1, 1));
  }
  
  @Test
  public void invalidLocationsXMin() {
    int[][] input = {{1,2},{3,4,5},{6,7}};
    assertNull(extractAndTest.extractSubArray(input, -1, 0, 0, 1));
  }  
  
  @Test
  public void invalidLocationsXOrder() {
    int[][] input = {{1,2},{3,4,5},{6,7}};
    assertNull(extractAndTest.extractSubArray(input, 1, 0, 0, 1));
  }
  
  @Test
  public void invalidLocationsYOrder() {
    int[][] input = {{1,2},{3,4,5},{6,7}};
    assertNull(extractAndTest.extractSubArray(input, 0, 1, 1, 0));
  }
  
  @Test
  public void invalidLocationsXTooBig() {
    int[][] input = {{1,2},{3,4,5},{6,7}};
    assertNull(extractAndTest.extractSubArray(input, 0, 3, 0, 1));
  }
  
  @Test
  public void invalidLocationsYTooBig() {
    int[][] input = {{1,2},{3,4,5},{6,7}};
    assertNull(extractAndTest.extractSubArray(input, 0, 1, 0, 2));
  }
  
  @Test
  public void validLocationsExtractRect() {
    int[][] input = {{1,2},{3,4,5},{6,7}};
    int[][] output = {{1,2},{3,4},{6,7}};
    assertArrayEquals(output, extractAndTest.extractSubArray(input, 0, 2, 0, 1));
  }
  
  @Test
  public void invalidLocationsExtractSquare() {
    int[][] input = {{1,2},{3,4,5},{6,7}};
    int[][] output = {{1,2},{3,4}};
    assertArrayEquals(output, extractAndTest.extractSubArray(input, 0, 1, 0, 1));
  }
  
  @Test
  public void invalidLocationsExtractRow() {
    int[][] input = {{1,2},{3,4,5},{6,7}};
    int[][] output = {{3,4,5}};
    assertArrayEquals(output, extractAndTest.extractSubArray(input, 1, 1, 0, 2));
  }
  
  @Test
  public void invalidLocationsExtractCol() {
    int[][] input = {{1,2},{3,4,5},{6,7}};
    int[][] output = {{2},{4},{7}};
    assertArrayEquals(output, extractAndTest.extractSubArray(input, 0, 2, 1, 1));
  }
  
  @Test
  public void invalidLocationsExtractSingle() {
    int[][] input = {{1,2},{3,4,5},{6,7}};
    int[][] output = {{6}};
    assertArrayEquals(output, extractAndTest.extractSubArray(input, 2, 2, 0, 0));
  }

  @Test
  public void hasTrueFull() {
    boolean[][] input = {{false,true},{false,false},{true,false}};
    assertFalse(extractAndTest.noneTrue(input));
  }
  

  @Test
  public void hasTrueJagged() {
    boolean[][] input = {{false,true,false,false},{false,false},{false,true,false}};
    assertFalse(extractAndTest.noneTrue(input));
  }
  

  @Test
  public void empty() {
    boolean[][] input = {{}};
    assertTrue(extractAndTest.noneTrue(input));
  }
  
  @Test
  public void noTrueFull() {
    boolean[][] input = {{false,false},{false,false},{false,false}};
    assertTrue(extractAndTest.noneTrue(input));
  }
  

  @Test
  public void noTrueJagged() {
    boolean[][] input = {{false,false,false,false},{false,false},{false,false,false}};
    assertTrue(extractAndTest.noneTrue(input));
  }

  
}
