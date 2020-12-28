import java.util.Arrays;
class Sandbox {
  public static void main(String[] args) {
    // System.out.println("hello world");
    int[] original = new int[] {1,2,3,4,5};
    int[] clone = original.clone();
    clone[0] = 77;
    System.out.println(Arrays.toString(original));
    System.out.println(Arrays.toString(clone));
  }
}
