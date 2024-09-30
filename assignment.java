// Question1 
import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        int[] inverted = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        inverseArray(arr, 0, inverted);

        for (int i = 0; i < N; i++) {
            System.out.print(inverted[i] + " ");
        }
    }

    public static void inverseArray(int[] arr, int index, int[] inverted) {
        if (index == arr.length) {
            return;
        }
        inverted[arr[index]] = index;
        inverseArray(arr, index + 1, inverted);
    }
}

//Question3 
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int M = sc.nextInt();
        int index = findIndex(arr, N, M);
        System.out.println(index);
    }

    public static int findIndex(int[] arr, int N, int M) {
        for (int i = 0; i < N; i++) {
            if (arr[i] == M) {
                return i;
            }
        }
        return -1;
    }
}

//Question4
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();
        findPairs(arr, N, target);
    }

    public static void findPairs(int[] arr, int N, int target) {
        Arrays.sort(arr); // Sorting the array to print pairs in increasing order
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println(arr[i] + " and " + arr[j]);
                }
            }
        }
    }
}

//Question5
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int maxValue = findMax(arr, N);
        System.out.println(maxValue);
    }

    public static int findMax(int[] arr, int N) {
        int max = arr[0];
        for (int i = 1; i < N; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}

//Question6
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();

        for (int t = 0; t < T; t++) {
            int N = sc.nextInt();
            sc.nextLine();
            int[] prices = new int[N];

            String[] priceStrings = sc.nextLine().split(" ");
            for (int i = 0; i < N; i++) {
                prices[i] = Integer.parseInt(priceStrings[i]);
            }

            int M = sc.nextInt();
            sc.nextLine();
            findRoses(prices, N, M);
            if (t < T - 1) {
                System.out.println();
            }
        }
    }

    public static void findRoses(int[] prices, int N, int M) {
        Map<Integer, Integer> priceMap = new HashMap<>();
        int bestI = -1;
        int bestJ = -1;
        int minDiff = Integer.MAX_VALUE;

        for (int price : prices) {
            int complement = M - price;
            if (priceMap.containsKey(complement)) {
                int currentI = Math.min(price, complement);
                int currentJ = Math.max(price, complement);
                int currentDiff = currentJ - currentI;

                if (currentDiff < minDiff) {
                    bestI = currentI;
                    bestJ = currentJ;
                    minDiff = currentDiff;
                }
            }
            priceMap.put(price, price);
        }

        if (bestI != -1 && bestJ != -1) {
            System.out.printf("Deepak should buy roses whose prices are %d and %d.%n", bestI, bestJ);
        }
    }
}

//Question7 
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int t = 0; t < T; t++) {
            int c1 = sc.nextInt();
            int c2 = sc.nextInt();
            int c3 = sc.nextInt();
            int c4 = sc.nextInt();
            int n = sc.nextInt();
            int m = sc.nextInt();

            int[] rickshawUsage = new int[n];
            for (int i = 0; i < n; i++) {
                rickshawUsage[i] = sc.nextInt();
            }

            int[] cabUsage = new int[m];
            for (int i = 0; i < m; i++) {
                cabUsage[i] = sc.nextInt();
            }

            int totalRickshawCost = 0;
            for (int rides : rickshawUsage) {
                totalRickshawCost += Math.min(rides * c1, c2);
            }
            totalRickshawCost = Math.min(totalRickshawCost, c3);

            int totalCabCost = 0;
            for (int rides : cabUsage) {
                totalCabCost += Math.min(rides * c1, c2);
            }
            totalCabCost = Math.min(totalCabCost, c3);

            int totalCost = Math.min(totalRickshawCost + totalCabCost, c4);
            System.out.println(totalCost);
        }
    }
}

//Question8 


//question9


//question10
import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        int[] result = sortedSquares(nums);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public static int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] squares = new int[n];
        for (int i = 0; i < n; i++) {
            squares[i] = nums[i] * nums[i];
        }
        Arrays.sort(squares);
        return squares;
    }
}

//question11
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        int count0 = 0;
        int count1 = 0;

        for (int i = 0; i < N; i++) {
            int num = scanner.nextInt();
            if (num == 0) {
                count0++;
            } else {
                count1++;
            }
        }
        
        for (int i = 0; i < count0; i++) {
            System.out.print(0 + " ");
        }
        for (int i = 0; i < count1; i++) {
            System.out.print(1 + " ");
        }
        
        scanner.close();
    }
}

//question12 
import java.util.Scanner;

public class Main {
    static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        long[] A = new long[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextLong();
        }
        
        int Q = scanner.nextInt();
        long[] operations = new long[Q];
        for (int i = 0; i < Q; i++) {
            operations[i] = scanner.nextLong();
        }

        long[] finalArray = A.clone();
        for (long X : operations) {
            finalArray = performOperation(finalArray, N, (int) X);
        }

        long sum = 0;
        for (long num : finalArray) {
            sum = (sum + num) % MOD;
        }

        System.out.println(sum);
        scanner.close();
    }

    private static long[] performOperation(long[] array, int N, int X) {
        long[] newArray = new long[N];
        for (int i = 0; i < N; i++) {
            newArray[i] = (array[i] + array[(i - X + N) % N]) % MOD;
        }
        return newArray;
    }
}

//question13
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        
        if (N < 0) {
            System.out.println("N cannot be negative.");
            return; // Early exit if N is negative
        }
        
        long[] array = new long[N];
        
        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextLong();
        }
        
        bubbleSort(array);
        
        for (long num : array) {
            System.out.println(num);
        }
        
        scanner.close();
    }

    private static void bubbleSort(long[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap array[j] and array[j+1]
                    long temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}



//question14
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int[] nums1 = new int[n];
            int[] nums2 = new int[m];
            
            for (int i = 0; i < n; i++) {
                nums1[i] = scanner.nextInt();
            }
            for (int i = 0; i < m; i++) {
                nums2[i] = scanner.nextInt();
            }
            
            long maxPathSum = findMaxPathSum(nums1, nums2);
            System.out.println(maxPathSum);
        }
    }

    public static long findMaxPathSum(int[] nums1, int[] nums2) {
        long sum1 = 0, sum2 = 0;
        long maxSum = 0;
        int i = 0, j = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                sum1 += nums1[i++];
            } else if (nums1[i] > nums2[j]) {
                sum2 += nums2[j++];
            } else {
                maxSum += Math.max(sum1 + nums1[i], sum2 + nums2[j]);
                sum1 = 0;
                sum2 = 0;
                i++;
                j++;
            }
        }
        
        while (i < nums1.length) {
            sum1 += nums1[i++];
        }
        
        while (j < nums2.length) {
            sum2 += nums2[j++];
        }
        
        maxSum += Math.max(sum1, sum2);
        return maxSum;
    }
}

//question15

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] array = new int[N];
        
        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        }
        
        selectionSort(array);
        
        for (int num : array) {
            System.out.println(num);
        }
        
        scanner.close();
    }

    public static void selectionSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }
}


//question16

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] array = new int[N];
        
        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        }
        
        insertionSort(array);
        
        for (int i = 0; i < N; i++) {
            System.out.print(array[i] + " ");
        }
        
        scanner.close();
    }

    public static void insertionSort(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }
}

//question 17

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] nums = new int[n];
            
            for (int i = 0; i < n; i++) {
                nums[i] = scanner.nextInt();
            }
            
            System.out.println(maxCircularSubarraySum(nums));
        }
        
        scanner.close();
    }
    
    private static int maxCircularSubarraySum(int[] nums) {
        int maxNormalSum = kadane(nums);
        int totalSum = 0;
        int minNormalSum = kadaneInverted(nums);
        
        for (int num : nums) {
            totalSum += num;
        }
        
        int maxCircularSum = totalSum - minNormalSum;
        
        if (maxCircularSum == 0) {
            return maxNormalSum; // If all elements are negative
        }
        
        return Math.max(maxNormalSum, maxCircularSum);
    }
    
    private static int kadane(int[] nums) {
        int maxSoFar = nums[0];
        int maxEndingHere = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            maxEndingHere = Math.max(nums[i], maxEndingHere + nums[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }
        
        return maxSoFar;
    }
    
    private static int kadaneInverted(int[] nums) {
        int minSoFar = nums[0];
        int minEndingHere = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            minEndingHere = Math.min(nums[i], minEndingHere + nums[i]);
            minSoFar = Math.min(minSoFar, minEndingHere);
        }
        
        return minSoFar;
    }
}

//question 18 

import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(); 
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) 
            arr[i] = scn.nextInt();
        
        sortColors(arr); 
        
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void sortColors(int[] nums) {
        int low = 0; 
        int mid = 0; 
        int high = nums.length - 1;

        while (mid <= high) {
            if (nums[mid] == 0) {
                swap(nums, low, mid);
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                swap(nums, mid, high);
                high--;
            }
        }
    }
    
    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}


// question 19 


//question 20

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        
        int[] runningSum = calculateRunningSum(nums);
        
        for (int sum : runningSum) {
            System.out.print(sum + " ");
        }
    }
    
    public static int[] calculateRunningSum(int[] nums) {
        int n = nums.length;
        int[] runningSum = new int[n];
        
        runningSum[0] = nums[0];
        for (int i = 1; i < n; i++) {
            runningSum[i] = runningSum[i - 1] + nums[i];
        }
        
        return runningSum;
    }
}


// question 21 

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < N; i++) {
            String binaryString = scanner.nextLine();
            int decimalValue = binaryToDecimal(binaryString);
            System.out.println(decimalValue);
        }
    }

    public static int binaryToDecimal(String binary) {
        return Integer.parseInt(binary, 2);
    }
}

// question 22

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        while (T-- > 0) {
            int N = scanner.nextInt();
            int[] heights = new int[N];
            for (int i = 0; i < N; i++) {
                heights[i] = scanner.nextInt();
            }
            System.out.println(calculateWater(heights));
        }
    }

    private static int calculateWater(int[] heights) {
        int n = heights.length;
        if (n <= 2) return 0;

        int leftMax = 0, rightMax = 0;
        int left = 0, right = n - 1;
        int waterTrapped = 0;

        while (left < right) {
            if (heights[left] < heights[right]) {
                leftMax = Math.max(leftMax, heights[left]);
                waterTrapped += leftMax - heights[left];
                left++;
            } else {
                rightMax = Math.max(rightMax, heights[right]);
                waterTrapped += rightMax - heights[right];
                right--;
            }
        }

        return waterTrapped;
    }
}

// question 23 

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        System.out.println(findMajorityElement(nums));
    }

    private static int findMajorityElement(int[] nums) {
        int count = 0, candidate = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        return candidate;
    }
}


// question 24 

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }

            nextPermutation(arr);
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        scanner.close();
    }

    private static void nextPermutation(int[] nums) {
        int n = nums.length;
        int i = n - 2;

        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        if (i >= 0) {
            int j = n - 1;
            while (j > i && nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i, j);
        }

        reverse(nums, i + 1, n - 1);
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }
}

// question 25 

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;

        for (int i = 0; i < n; i++) {
            int petya = scanner.nextInt();
            int vasya = scanner.nextInt();
            int tonya = scanner.nextInt();

            if (petya + vasya + tonya >= 2) {
                count++;
            }
        }

        System.out.println(count);
        scanner.close();
    }
}



