import java.util.ArrayList;

public class Sorts{

  public static ArrayList populate( int size, int lo, int hi )
  {
    ArrayList<Integer> retAL = new ArrayList<Integer>();
    while( size > 0 ) {
      //     offset + rand int on interval [lo,hi]
      retAL.add( lo + (int)( (hi-lo+1) * Math.random() ) );
      size--;
    }
    return retAL;
  }

  //randomly rearrange elements of an ArrayList
  public static void shuffle( ArrayList al )
  {
    int randomIndex;
    //setup for traversal fr right to left
    for( int i = al.size()-1; i > 0; i-- ) {
      //pick an index at random
      randomIndex = (int)( (i+1) * Math.random() );
      //swap the values at position i and randomIndex
      al.set( i, al.set( randomIndex, al.get(i) ) );
    }
  }

  public static void bubble(ArrayList<Comparable> ow) {
    for( int passCtr = 1; passCtr < ow.size(); passCtr++ ) {
      //System.out.println( "commencing pass #" + passCtr + "..." );

      //iterate thru first to next-to-last element, comparing to next
      for( int i = 0; i < ow.size()-1; i++ ) {

        //if element at i > element at i+1, swap
        if ( ow.get(i).compareTo(ow.get(i+1) ) > 0 )
          ow.set( i, ow.set(i+1,ow.get(i)) );

        //System.out.println(ow); //diag: show current state of list
      }
    }
  }

  public static void selection(ArrayList<Comparable> ow) {
    //note: this version places greatest value at rightmost end,

    //maxPos will point to position of SELECTION (greatest value)
    int maxPos;

    for( int pass = ow.size()-1; pass > 0; pass-- ) {
      //System.out.println( "\nbegin pass " + (ow.size()-pass) );//diag
      maxPos = 0;
      for( int i = 1; i <= pass; i++ ) {
        //System.out.println( "maxPos: " + maxPos );//diag
        //System.out.println( ow );//diag
        if ( ow.get(i).compareTo( ow.get(maxPos) ) > 0 )
          maxPos = i;
      }
      ow.set( maxPos, ( ow.set( pass, ow.get(maxPos) ) ) );
      //System.out.println( "after swap: " +  ow );//diag
    }
  }

  public static void insertion(ArrayList<Comparable> ow) {
    for( int partition = 1; partition < ow.size(); partition++ ) {
      //partition marks first item in unsorted region

      //diag:
      //System.out.println( "\npartition: " + partition + "\towset:");
      //System.out.println( ow );

      //traverse sorted region from right to left
      for( int i = partition; i > 0; i-- ) {

        // "walk" the current item to where it belongs
        // by swapping adjacent items
        if ( ow.get(i).compareTo( ow.get(i-1) ) < 0 ) {
          //diag:
          //System.out.println( "swap indices "+(i-1)+" & "+i+"..." );
          ow.set( i, ow.set( i-1, ow.get(i) ) );
        }
        else
          break;
      }
    }
  }
}
