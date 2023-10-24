package ie.atu.testexample1.testexample1;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LibraryService {

    private final Library library;
    List<Book> LibraryData = new ArrayList<>();

    public LibraryService(Library library) {
        this.library = library;
    }

    public List<Book> getLibraryData() {
        return LibraryData;
    }

    public Book getBooks() {
        Book td = library.getBooks();
        LibraryData.add(td);
        return td;
    }

}
