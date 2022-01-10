import java.util.ArrayList;

public class Driver{
  public static void main(String[] args) {

    //Bubble sort
    ArrayList glen0 = new ArrayList<Integer>();
    glen0.add(7);
    glen0.add(1);
    glen0.add(5);
    glen0.add(12);
    glen0.add(3);
    System.out.println("BUBBLE SORT:");
    System.out.println( "\nArrayList glen0 is size " + glen0.size() + " and shuffled.");
    Sorts.bubble(glen0);

    ArrayList coco0 = Sorts.populate( 10, 1, 1000 );
    System.out.println( "\nArrayList coco0 before sorting:\n" + coco0 );
    Sorts.bubble(coco0);
    System.out.println( "\nArrayList coco0 after sorting:\n" + coco0 );

    System.out.println("-----------------------");

    //Selection sort
    ArrayList glen1 = new ArrayList<Integer>();
    glen1.add(7);
    glen1.add(1);
    glen1.add(5);
    glen1.add(12);
    glen1.add(3);
    System.out.println("SELECTION SORT:");
    System.out.println( "\nArrayList glen1 before sorting:\n" + glen1 );
    Sorts.selection(glen1);
    System.out.println( "\nArrayList glen1 after sorting:\n" + glen1 );

    ArrayList coco1 = Sorts.populate( 10, 1, 1000 );
    System.out.println( "\nArrayList coco1 before sorting:\n" + coco1 );
    Sorts.selection(coco1);
    System.out.println( "\nArrayList coco1 after sorting:\n" + coco1 );

    System.out.println("-----------------------");

    //Insertion sort
    ArrayList glen2 = new ArrayList<Integer>();
    glen2.add(7);
    glen2.add(1);
    glen2.add(5);
    glen2.add(12);
    glen2.add(3);
    System.out.println("INSERTION SORT:");
    System.out.println( "\nArrayList glen2 before sorting:\n" + glen2 );
    Sorts.insertion(glen2);
    System.out.println( "\nArrayList glen2 after sorting:\n" + glen2 );

    ArrayList coco2 = Sorts.populate( 10, 1, 1000 );
    System.out.println( "\nArrayList coco2 before sorting:\n" + coco2 );
    Sorts.insertion(coco2);
    System.out.println( "\nArrayList coco2 after sorting:\n" + coco2 );


  }
}
