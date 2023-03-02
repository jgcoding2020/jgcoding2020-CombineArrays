
public class CombineArrays {
    /**
     * Combine two arrays into a single array and return it.
     *
     * @param arr1 an array of ints.
     * @param arr2 an array of ints.
     * @return an array containing the contents of arr1 followed by the contents of arr2.
     */
    public int[] combine(int[] arr1, int[] arr2){
        int arr1Length = arr1.length;
        int arr2Length = arr2.length;
        int finalArrayLength = arr1Length + arr2Length;
        int[] finalArray = new int[finalArrayLength];

        System.arraycopy(arr1, 0, finalArray, 0, arr1Length);
        System.arraycopy(arr2, 0, finalArray, arr1Length, arr2Length);
        
        return finalArray;
    }
}
