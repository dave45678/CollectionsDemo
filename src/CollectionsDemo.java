import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Random;
import java.util.LinkedList;
import java.util.ListIterator;



public class CollectionsDemo {

	public static void main(String[] args) {
		//create an Array
		
		//create an Arraylist
		// add elements in colors array to list
		String[] colors = { "MAGENTA", "RED", "WHITE", "BLUE", "CYAN" };
		List< String > list = new ArrayList< String >();

		for ( String color : colors )
			list.add( color ); // adds color to end of list
		// add elements in removeColors array to removeList
		String[] removeColors = { "RED", "WHITE", "BLUE" };

		List< String > removeList = new ArrayList< String >();
		for ( String color : removeColors )
			removeList.add( color );
		// output list contents
		System.out.println( "ArrayList: " );
		for ( int count = 0; count < list.size(); count++ )
			System.out.printf( "%s ", list.get( count ) );
		// remove from list the colors contained in removeList
		removeColors( list, removeList );
		// output list contents
		System.out.println( "\n\nArrayList after calling removeColors: " );
		for ( String color : list )
			System.out.printf( "%s ", color );


		// add colors elements to list1
		//String[] colors = { "black", "yellow", "green", "blue", "violet", "silver" };
		List< String > list1 = new LinkedList< String >();
		for ( String color : colors )
		list1.add( color );
		// add colors2 elements to list2
		String[] colors2 =
		{ "gold", "white", "brown", "blue", "gray", "silver" };
		List< String > list2 = new LinkedList< String >();
		for ( String color : colors2 )
		list2.add( color );
		list1.addAll( list2 ); // concatenate lists
		list2 = null; // release resources
		printList( list1 ); // print list1 elements
		convertToUppercaseStrings( list1 ); // convert to uppercase string
		printList( list1 ); // print list1 elements
		System.out.print( "\nDeleting elements 4 to 6..." );
		removeItems( list1, 4, 7 ); // remove items 4-6 from list
		printList( list1 ); // print list1 elements
		printReversedList( list1 ); // print list in reverse order
		
		

		
		
		
		//create a hash map
	       
        HashMap<String,String> map = new HashMap<String,String>();
        map.put("i", "you");
        map.put("am", "are");
        map.put("my", "your");
        map.put("me","you");
		
		String value=null;
		Random rn = new Random();
		int index = 1 + rn.nextInt(map.size());
		value= map.get(index);
	    System.out.println(value);
	    
	    
	    
		//create a hash set
		HashSet<String> set = new HashSet<String>();
		set.add("Fish");
		set.add("Zebra");
		set.add("Tiger");
		
		if (set.contains("Fish")) {
			System.out.println("Fish is here");
		}
		for (String obj : set) {
		    System.out.println(obj);
		}

	}
	
	private static void convertToUppercaseStrings( List< String > list )
	{
		ListIterator< String > iterator = list.listIterator();
		while ( iterator.hasNext() )
		{
			String color = iterator.next(); 
			iterator.set( color.toUpperCase() ); 
		} 
	} 

	private static void removeItems( List< String > list,
			int start, int end )
	{
		list.subList( start, end ).clear();
	}
	
	private static void printReversedList( List< String > list )
	{
		ListIterator< String > iterator = list.listIterator( list.size() );
		System.out.println( "\nReversed List:" );
		// print list in reverse order
		while ( iterator.hasPrevious() )
			System.out.printf( "%s ", iterator.previous() );
	} 

	private static void removeColors( Collection< String > collection1,
			Collection< String > collection2 )
	{
		Iterator< String > iterator = collection1.iterator();
		while ( iterator.hasNext() )
		{
			if ( collection2.contains( iterator.next() ) )
				iterator.remove();
		} 
	} 
	
	private static void printList( List< String > list )
	{
		System.out.println( "\nlist: " );
		for ( String color : list )
			System.out.printf( "%s ", color );
		System.out.println();
	} 

}
