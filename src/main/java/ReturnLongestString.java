
public class ReturnLongestString {
    /**
     * Return the longest String out of arr.
     * Remember that you can get the length of String with str.length().
     *
     * @param arr an array of Strings.
     * @return the longest String within arr. You can assume that there are no ties for the longest string.
     */
    public String longest(String[] arr){

        int i = 0;
        int maxL = arr[i].length();

        for(int j = 1; j < arr.length; j++){
            if(arr[j].length() > maxL){
                i = j;
                maxL = arr[j].length();
            }
        }

        return arr[i];
    }
}
