class sorting {
    public static void main(String[] args) {
        System.out.println("\n~ WTP Check an Array is Sorted. ~");
        int[] arr = ArrayUtility.inputArray();
        boolean increasing = increasing(arr);
        boolean decreasing = decreasing(arr);

        if(increasing||decreasing){
            System.out.println("Array is Sorted.");
        } else{
            System.out.println("Array is not Sorted.");
        }
    }

    public static boolean increasing(int[] arr) {
        int i = 1;
        while (i < arr.length) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
            i++;
        }
        return true;
    }

    public static boolean decreasing(int[] arr){
        int i = 1;
        while(i<arr.length){
            if(arr[i]>arr[i-1]){
                return false;
            }
            i++;
        }
        return true;
}
