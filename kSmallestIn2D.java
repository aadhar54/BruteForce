
public class kSmallestIn2D{

    public static void main(String args[]){
        int arr[][] = {{3,11,7},{9,16,14},{22,33,44}};
        kSmallest(arr, 4);
    }

    private static int getMin(int arr[][]){
        int min = Integer.MAX_VALUE;
        int minRowIndex = 0;
        int minColIndex = 0;
        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                if(arr[row][col] < min){
                    min = arr[row][col];
                    minRowIndex = row;
                    minColIndex = col;
                }
            }
        }
        arr[minRowIndex][minColIndex] = Integer.MAX_VALUE;

        return min;
    }

    private static int getTotalElementsOfTwoD(int arr[][]){

        int count = 0;
        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                count++;
            }
        }

        return count;

    }

    private static int kSmallest(int arr[][], int k){
        int eleCount = getTotalElementsOfTwoD(arr);
        int mappingArr[] = new int[eleCount];

        for(int j = 0; j < mappingArr.length; j++){
            int nextMin = getMin(arr);
            mappingArr[j] = nextMin;
        }

        for (int num : mappingArr){
            System.out.println(num);
        }

        return mappingArr[k-1];

    }

}