import static org.junit.Assert.assertEquals;
import org.junit.*;

public class TestShelf {
  // these lines enable the instances in the before method to be available too all the tests
  Shelf shelf;
  Book book;

  @Before
  public void before() {
    shelf = new Shelf(10);
    book = new Book();
  }

  @Test
  public void hasLength() {
    assertEquals(10, shelf.getLength() );
  }

  @Test
  public void countBooks() {
    assertEquals(0, shelf.countBooks() );
  }

  @Test
  public void putBookOnShelf() {
    shelf.addBook(book);
    assertEquals(1, shelf.countBooks() );
  }

  @Test
  public void shelfIsFull() {
    for(int i = 0; i < 15; i++) {
    shelf.addBook(book);
    }
    assertEquals(true, shelf.isFull());
  }




}