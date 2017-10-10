import org.junit.*;
public class ElevenSix{
 

  public static void main(String[] args){
    sort(new int[][]{{1,4,5},{2,7,9}},9);
        sort(new int[][]{{1,4,5},{2,7,9}},1);
            sort(new int[][]{{1,4,5},{2,7,9}},2);
                sort(new int[][]{{1,4,5},{2,7,9}},4);
                    sort(new int[][]{{1,4,5},{2,7,9}},19);
    
    
  }
    public static void sort(int[][] array, int value){
      int height = array.length;
      int width = array[0].length;
      int currentColumn = width -1;
      int currentRow =0;
      boolean found=false;
      while(currentColumn>=0 && currentRow <height){
        System.out.println(" i  " + currentRow + " j " + currentColumn + " checking ");
        if(array[currentRow][currentColumn]==value){
          found=true;
          System.out.println(" i  " + currentRow + " j " + currentColumn + " value " +array[currentRow][currentColumn]);
          break;
        }
        else if(array[currentRow][currentColumn]>value){
         currentColumn--;
        }
        else{
        currentRow++;
        }
        
        
      }
      if(!found)
      System.out.println("Not Found");
  }
  
  
  
  
}