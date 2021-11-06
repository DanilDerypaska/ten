package ten;

public class HomeworkTen {

    public static void main(String[] args) {

        Country united_kingdom = new Country("United Kingdom");
        Country ireland = new Country("Ireland");
        Country netherlands = new Country("Netherlands");
        Country india = new Country("India");
        Author authorOne = new Author("Daniel Defoe", 1660, united_kingdom);
        Author authorTwo = new Author("Samuel Richardson", 1689, united_kingdom);
        Author authorThree = new Author("Jonathan Swift", 1667, ireland);
        Author authorFour = new Author("Jane Austen", 1775, united_kingdom);
        Author authorFive = new Author("Thomas Love Peacock", 1785, united_kingdom);
        Author authorSix = new Author("Maria Sibylla Merian", 1647, netherlands);
        Author authorSeven = new Author("Charlotte Bronte", 1816, united_kingdom);
        Author authorEight = new Author("William Makepeace Thackeray", 1811, india);
        Author authorNine = new Author("Wilkie Collins", 1824, united_kingdom);
        Author authorTen = new Author("George Eliot", 1819, united_kingdom);
        Author authorEleven = new Author("Robert Louis Stevenson", 1850, united_kingdom);
        Author authorTwelve = new Author("Arthur Conan Doyle", 1859, united_kingdom);


        Book bookOne = new Book("Robinson Crusoe", 1719,authorOne);
        Book bookTwo = new Book("Clarissa", 1689,authorTwo);
        Book bookThree = new Book("Gulliver Travels", 1726,authorThree);
        Book bookFour = new Book("Emma", 1815,authorFour);
        Book bookFive = new Book("Abbey of nightmares", 1815,authorFive);
        Book bookSix = new Book("Sibylla", 1705,authorSix);
        Book bookSeven = new Book("Jane Eyre", 1845,authorSeven);
        Book bookEight = new Book("Vanity Fair", 1848,authorEight);
        Book bookNine = new Book("Moonstone", 1866,authorNine);
        Book bookTen = new Book("Middlemarch", 1872,authorTen);
        Book bookEleven = new Book("Kidnapped", 1891,authorEleven);
        Book bookTwelve = new Book("Sign of four", 1892,authorTwelve);

        Book[] books = new Book[12];
        books[0] = bookOne;
        books[1] = bookTwo;
        books[2] = bookThree;
        books[3] = bookFour;
        books[4] = bookFive;
        books[5] = bookSix;
        books[6] = bookSeven;
        books[7] = bookEight;
        books[8] = bookNine;
        books[9] = bookTen;
        books[10] = bookEleven;
        books[11] = bookTwelve;


        HomeworkTen homeworkTen = new HomeworkTen();
        homeworkTen.printBooks(books);
    }

    private void printBooks(Book[] books) {
        for (int i = 0; i < books.length; i++) {

            Book elementBook = books[i];

            Author author = elementBook.getAuthor();

            System.out.println((i+1)+ " The book name " + elementBook.getName() + " year  " + elementBook.getYear() + " author " + author.getName()
                    + " author country " + author.getCountry().getName() + " author birthday " + author.getDataOfBirth());
        }
    }
}
