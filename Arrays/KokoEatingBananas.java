public class KokoEatingBananas {
  public static void main(String[] args) {
    int[] piles = { 3, 6, 7, 11 };
    System.out.println(minEatingSpeed(piles, 8));
  }

  public static int minEatingSpeed(int[] piles, int h) {
    int left = 0;
    int right = 0;
    for (int pile : piles) {
      right = Math.max(pile, right);
    }

    while (left < right) {
      int mid = left + (right - left) / 2;
      if (hasFinish(piles, mid, h)) {
        right = mid;
      } else {
        left = mid + 1;
      }
    }
    return left;
  }

  public static boolean hasFinish(int[] piles, int speed, int h) {
    int hours = 0;
    for (int pile : piles) {
      hours += Math.ceil((double) pile / speed);
    }
    return hours <= h;
  }
}
