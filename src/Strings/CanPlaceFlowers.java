package Strings;

/**
 * 605. Can Place Flowers
 * Given:
 * Integer Array : flowerbed, contains 0's and 1's
 * int n : new flowers can be planted
 *
 * Expect: true if n number of flowers ca nbe planted without violating the no-adjacent-flowers rule
 *
 * [1,0,0,0,1]
 *    i
 *
 * Approach:
 * 1. loop through flowerbed and find the first 0.
 * 2. if found verify i + 1 & i + 2 are equal to 0.
 * 3. Decrement n value by 1
 * 4. repeat step 1 to 3 for the lenght of the flowerbed
 * 5. return true if n == 0.
 */
public class CanPlaceFlowers {
    private static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        int i = 0;
        while (i < flowerbed.length) {
            if (flowerbed[i] == 0 && (i == 0 || flowerbed[i-1] == 0) &&
                    (i == flowerbed.length-1 || flowerbed[i+1] == 0)) {
                flowerbed[i] = 1;
                count++;
            }
            if (count >= n) {
                return true;
            }
            i++;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(CanPlaceFlowers.canPlaceFlowers(new int[]{1, 0, 0, 0, 0, 1}, 2));
        System.out.println(CanPlaceFlowers.canPlaceFlowers(new int[]{1, 0, 0, 0, 0, 1}, 1));
    }
}
