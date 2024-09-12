import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solutions sol = new Solutions();
        int[] arr = {4, 4, 1, 3, 1, 3, 2, 2, 5, 5, 1, 5, 2, 1, 2, 3, 5, 4};
        int[] arr2 = {4, 3, 1, 2};

//        int k = 1010101;
//        System.out.println(Integer.parseInt(String.valueOf(k), 2));


        Arrays.sort(arr);
        System.out.println(sol.maxOperations(arr, 2));


    }


    // Java function to insert a new node at the beginning of the
// linked list
    public static ListNode insertAtBeginning(ListNode head, int value) {
        // Create a new node with the given value
        ListNode newNode = new ListNode(value);

        // Set the next pointer of the new node to the current
        // head
        newNode.next = head;

        // Move the head to point to the new node
        head = newNode;

        // Return the new head of the linked list
        return head;
    }


    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }


    public static int[] productExceptSelf(int[] nums) {

        int[] arr = new int[nums.length];
        int zeroCounter = 0;
        int sum = 1;


        for (int num : nums) {

            if (num != 0) {
                sum = sum * num;

            } else {
                zeroCounter++;
            }

        }


        for (int i = 0; i < nums.length; i++) {


            if (zeroCounter >= 2) {
                arr[i] = 0;
            } else if (zeroCounter == 1) {

                if (nums[i] != 0) {
                    arr[i] = 0;
                } else {
                    arr[i] = sum;
                }

            } else {
                arr[i] = sum / nums[i];
            }

        }


        return arr;

    }


    public static int findComplement(int num) {


        String string = Integer.toBinaryString(num);
        StringBuilder stringBuilder = new StringBuilder();

        int startCounter = 0;

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == '0') {
                stringBuilder.replace(startCounter, i, "1");
            } else {
                stringBuilder.replace(startCounter, i, "0");

            }

            startCounter++;
        }


        return Integer.parseInt(stringBuilder.toString().trim(), 2);

    }


    public static int lengthOfLastWord(String s) {

        String[] arr = s.split(" ");

        return arr[arr.length - 1].length();

    }


    public static int getLucky(String s, int k) {

        int finalValue;


        String alphabets = "abcdefghijklmnopqrstuvwxyz";

        StringBuilder convertedString = new StringBuilder();


        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int alphabetIndex = alphabets.indexOf(c) + 1;
            convertedString.append(alphabetIndex);
        }


        while (k != 0) {


            int check = 0;

            for (char c : convertedString.toString().toCharArray()) {
                check += Integer.parseInt(String.valueOf(c));
            }

            convertedString.replace(0, convertedString.length(), String.valueOf(check));


            k--;
        }

        finalValue = Integer.parseInt(convertedString.toString());


        return finalValue;
    }


    public static void olympics2024(Scanner sc) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int counterA = 0;
        int counterB = 0;
        int counterC = 0;

        if (a != 5) {
            counterA = 5 - a;
        }

        if (b != 5) {
            counterB = 5 - b;
        }

        if (c != 5) {
            counterC = 5 - c;
        }

        System.out.println(counterA + counterB + counterC);


    }

    public static String noWinner(Scanner sc) {


        int alice = sc.nextInt();
        int bob = sc.nextInt();
        int cameron = sc.nextInt();
        int additionalMatches = sc.nextInt();

        if (additionalMatches + cameron == alice || additionalMatches + cameron == bob || alice == bob) {
            return "Yes";
        }

        if (additionalMatches + bob == alice || additionalMatches + bob == cameron || alice == cameron) {
            return "Yes";
        }


        if (additionalMatches + alice == bob || additionalMatches + alice == cameron || bob == cameron) {
            return "Yes";
        }


        return "No";

    }


    // function to convert decimal to binary
    public static void decToBinary(int n) {
        // array to store binary number
        int[] binaryNum = new int[1000];

        // counter for binary array
        int i = 0;
        while (n > 0) {
            // storing remainder in binary array
            binaryNum[i] = n % 2;
            n = n / 2;
            i++;
        }

        // printing binary array in reverse order
        for (int j = i - 1; j >= 0; j--)
            System.out.print(binaryNum[j]);
    }

    public static void moveZeroes(int[] nums) {

//        ArrayList<Integer> nonZeros = new ArrayList<>();
//
//        for (int j : nums) {
//            if (j > 0) {
//                nonZeros.add(j);
//            }
//        }
//
//        for (int num : nums) {
//            if (num == 0) {
//                nonZeros.add(0);
//            }
//        }
//
//        System.out.println(Arrays.toString(nonZeros.toArray()));


//        int[] nonZeros = new int[nums.length];
//        int nonZeroCounter = 0;
//        int arrayCounter = 0;
//        while (arrayCounter!= nums.length){
//            if (nums[arrayCounter]>0){
//                nonZeros[nonZeroCounter++] = nums[arrayCounter];
//            }
//            arrayCounter++;
//        }
//
//        System.out.println(Arrays.toString(nonZeros));


    }

    public static boolean isSubsequence(String s, String t) {

        if (s.isEmpty()) {
            return true;
        }

        char[] newchar = s.toCharArray();

        int counter = 0;
        for (int i = 0; i < t.length() && counter < s.length(); i++) {
            if (s.charAt(counter) == t.charAt(i)) {
                counter++;
            }
        }

        return counter == s.length();
    }

//    public static int[] productExceptSelf(int[] nums) {
//        int[] result = new int[nums.length];
//
//        int maxNumber = 1;
//
//        for (int ch : nums) {
//            maxNumber = maxNumber * ch;
//        }
//
//        int counter = 0;
//
//        for (int num : nums) {
//            result[counter] = maxNumber % num;
//            counter++;
//        }
//
//        return result;
//    }


}


