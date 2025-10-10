public class basicSlidingwindow {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int k = 3, sum = 0, max=0,i=0,j=0;

    for (j = 0; j < k; j++) {
        sum += arr[j];
    }
 // initialize with first window
 // for (int i = k; i < arr.length; i++) {
    //     sum = sum - arr[i - k] + arr[i];
    //     max = Math.max(max, sum);
    // }
    
    i++;
    while(j<arr.length){
        sum = sum - arr[i - 1] + arr[j];
        max = Math.max(max, sum);
        i++;
        j++;
    }

    System.out.println("ans is "+max);
    }
}
