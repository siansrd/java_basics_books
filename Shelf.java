class Shelf {
  private int length;
  private Book[] books;

  public Shelf(int length){
    this.length = length;
    this.books = new Book[15];
  }

  public int getLength(){
    return this.length;
  }

  public int countBooks(){
    int counter = 0;
    for( Book book : books ) {
      if (book != null) {
        counter++;
      }
    }
      return counter;
  }

  public void addBook(Book newbook){
    if(isFull()) return;
    int i = countBooks();
    books[i] = newbook;
  }

  public boolean isFull(){
    return countBooks() == books.length;
  }
  

}


