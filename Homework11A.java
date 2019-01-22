public class Homework11A extends Homework11 {
  public void problem2(int n) {
    for (int i = 0; i < aList.size(); i++) {
      if (n % aList.get(i) != 0) {
        aList.remove(i);
        i--;
      }
    }
  }
}
