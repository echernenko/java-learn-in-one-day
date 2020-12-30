class Sandbox {
    public static void main(String[] args) {
      int output = new Sandbox().subtractProductAndSum(705);
      System.out.println(output);
    }

    public int subtractProductAndSum(int n) {
        return recurse(n, new int[] {0, 1});
    }

    private int recurse(int n, int[] arr) {
        int curr = n % 10;
        if (n == 0) {
          return arr[1] - arr[0];
        } else {
            arr[0] += curr;
            arr[1] *= curr;
            return recurse(n/10, arr);
        }
    }
}
