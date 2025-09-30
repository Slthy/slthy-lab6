import java.util.*;

public class DotChaser {

  public static void main(String[] args) {
    Random rand = new Random(System.currentTimeMillis());
    int N = 200;

    if( args.length != 0 ) N = Integer.parseInt(args[0]);

    ThingList list = new ThingList();
    int count = 0;

    while( true ) {
      // Every N rounds, add another typeA and typeB Thing.
        if( count % N == 0 ) {
            list.addThing(new TypeA(45, 50));
            list.addThing(new TypeB(55, 50));
            list.addThing(new TypeC(35, 50));
        }

        list.printAll();
        System.out.println("done");
        System.out.flush();

        list.moveAll(rand);
        count++;
    }
  }
}