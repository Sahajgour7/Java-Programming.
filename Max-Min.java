class Que42 {
    public static void main(String[] args) {
        System.out.println("Welcome to MAX and MIN program\n");
        int[] arr = ArrayUtility.inputArray();
        int max = max(arr);
        int min = min(arr);
        System.out.println("Max number of the Array is: " + max);
        System.out.println("Min number of the Array is: " + min);
    }

    public static int min(int[] arr) {
        int min = Integer.MAX_VALUE;
        int j = 0;
        while(j < arr.length){
            if(min > arr[j]){
                min = arr[j];
            }
            j++;
        }
        return min;
    }

    public static int max(int[] arr) {
        if (arr.length == 0) {
            return Integer.MIN_VALUE;
        }
        int max = arr[0];
        int i = 1;
        while (i < arr.length) {
            if (max < arr[i]) {
                max = arr[i];
            }
            i++;
        }
        return max;
    }
}
