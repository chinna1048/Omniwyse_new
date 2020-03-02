

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
	
	public static Set<Book> treeSetDemo(Comparator<Book> comparator) {
		Book book1 = new Book("Harry Potter", "J.K.Rowling", 1997);
		Book book2 = new Book("Harry Potter", "J.K.Rowling", 1997);
		Book book3 = new Book("Walden", "Henry David Thoreau", 1854);
		Book book4 = new Book("Effective Java", "Joshua Bloch", 2008);
		Book book5 = new Book("The Last Lecture", "Randy Pausch", 2008);
			  
		Set<Book> books = null;
		if (comparator == null) {
			books = new TreeSet<>();
		} else {
			books = new TreeSet<>(comparator);
		}
		
		books.add(book1);
		books.add(book2);
		books.add(book3);
		books.add(book4);
		books.add(book5);
	      
	    for (Book book : books) {
	    	System.out.println(book);
	    }
	    
	    return books;
	}
  public static void main(String[] args) throws ClassNotFoundException, Exception {
		
		SetDemo sd = new SetDemo();
        sd.treeSetDemo(null);
        System.out.println();
		sd.treeSetDemo(new Book.PubDateComparators.PubDateAscComparator());
        System.out.println();
		sd.treeSetDemo(new Book.PubDateComparators.PubDateDescComparator());

	}	
}

/*
Book [title=Effective Java, author=Joshua Bloch, year=2008]
Book [title=Harry Potter, author=J.K.Rowling, year=1997]
Book [title=The Last Lecture, author=Randy Pausch, year=2008]
Book [title=Walden, author=Henry David Thoreau, year=1854]

Book [title=Walden, author=Henry David Thoreau, year=1854]
Book [title=Harry Potter, author=J.K.Rowling, year=1997]
Book [title=Effective Java, author=Joshua Bloch, year=2008]
Book [title=The Last Lecture, author=Randy Pausch, year=2008]

Book [title=Effective Java, author=Joshua Bloch, year=2008]
Book [title=The Last Lecture, author=Randy Pausch, year=2008]
Book [title=Harry Potter, author=J.K.Rowling, year=1997]
Book [title=Walden, author=Henry David Thoreau, year=1854]

*/