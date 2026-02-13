import java.util.ArrayList;
import java.util.Arrays;

public class CopyArrayApp{
  public static void main(String[] args) {
    int nVals = args.length;
    int[] myVals = new int[nVals];
    for (int i = 0; i < nVals; i++) {
      int item = Integer.parseInt(args[i]);
      myVals[i] = item;
    }
    System.out.println("original values: " + Arrays.toString(myVals));

    ArrayList<Integer> uniqueVals = new ArrayList<>(); 
    for (int i = 0; i < nVals; i++) {
      if (!uniqueVals.contains(myVals[i])) {
        uniqueVals.add(myVals[i]);
      }
    }
    System.out.println("unique values: " + uniqueVals);
  }
}

