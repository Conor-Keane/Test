package ie.atu.testexample1.testexample1;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LibraryService {
    private List<Book> Library = new ArrayList<>();

    public List<Book> getBooks() {
        return Library;
    }

}
