public class binarysearch {
    public static void main(String[] args) {
            
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        if (args.length != 1) {
            System.out.println("Usage: java binarysearch <target_number>");
            return;
            }
        int target = Integer.parseInt(args[0]);
        
        
        boolean result = Search(a, target);
         if (result) {
                System.out.println("The number " + target + " is present in the array.");
            } else {
                System.out.println("The number " + target + " is not present in the array.");
            }
        }
    
        public static boolean Search(int[] array, int target) {
            int left = 0;
            int right = array.length - 1;
    
            while (left <= right) {
                int mid = (right + left) / 2;
    
                if (array[mid] == target) {
                    return true;
                } else if (array[mid] < target) {
                    left = mid + 1; 
                } else {
                    right = mid - 1;
                }
            }
    
            return false;
        }
    }
    


