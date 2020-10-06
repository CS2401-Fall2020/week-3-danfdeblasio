
public class extractAndTest {
  public static int[][] extractSubArray(int[][] inArray, int rowMin, int rowMax, int colMin, int colMax){

    if (rowMin > rowMax  || colMin > colMax) {
      return null;
    }
    int[][] subArr = new int[rowMax-rowMin+1][colMax-colMin+1];


    for(int i = 0; i < subArr.length; i++){
      if(subArr[i].length > inArray[i+rowMin].length){
        return null;
      }
      for(int j = 0; j < subArr[i].length; j++){
        subArr[i][j] = inArray[i + rowMin][j + colMin];
      }
    }

    return subArr;
  }

  public static boolean noneTrue(boolean[][] inArray) {
    for(int i = 0; i < inArray.length; i++){
      for(int j = 0; j < inArray[i].length; j++){
        if(inArray[i][j]){
          return false;
        }
      }
    }
    return true;
  }
}
