import java.util.*;

public class DotChaser {

  public static void main(String[] args) {
    int N = 200;

    if( args.length != 0 ) N = Integer.parseInt(args[0]);

    ThingList list = new ThingList();
    int count = 0;

    while( true ) {
      // Every N rounds, add another typeA and typeB Thing.
        if( count % N == 0 ) {

            Thing tA = new Thing(45, 50);
            list.addNode(new Node(tA));
            Thing tB = new Thing(55, 50 ,true);
            list.addNode(new Node(tB));

        }

        System.out.println(list.toString());
        System.out.println("done");
        System.out.flush();

        list.moveAll();
        count++;
    }
  }
}