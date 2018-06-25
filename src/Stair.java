// no of stairs    no. of ways
//      0               1
//      1               1
//      2               2
//      3               3
//      4               5
//      5               8

public class Stair {
        public int calculateSteps(int i) {
        int [] stairsArray = new int[i+1];
        stairsArray[0] = 1;
        stairsArray[1]= 1;
        stairsArray[i] = 0;
        for (int k = 2; k<stairsArray.length;k++){
            stairsArray[k] = stairsArray[k-1] + stairsArray[k-2];
            stairsArray[i] = stairsArray[k];
        }
        return stairsArray[i];
    }
}
