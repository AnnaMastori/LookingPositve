package lookingpositive.lookingpositive;

import java.util.Scanner;

public final class NicksAndAnnasMain {
  private NicksAndAnnasMain() {
  }
  /**
   * shit.
   * @param args more shit
   */
  public static void main(final String[] args) {
    /*
     * Profile pr1 = new Profile("elisavet", "exarxopoulou", "voula", 44, false,
     * "pass1", "papadopoulos@gmail.com"); Profile pr2 = new Profile("maria",
     * "exarxopoulou", "glyfada", 47, false, "pass2", "papadakis@gmail.com");
     */
    Calendar.eventRetriever();
    Calendar.eventSaver();
    int num = 0;
    Scanner sc = new Scanner(System.in);
    while (num != 0) {
      // AddDelEvents.chooseFunction(0);
      // AddDelEvents.chooseFunction(0);

      AddDelEvents.chooseFunction(0);
//  Calendar.deleteExpiredEvents(LocalDate.of(2021, 02, 5)
//, LocalDate.of(2021, 01, 29));
      AddDelEvents.chooseFunction(0);
      num = sc.nextInt();
    }
  }
}
