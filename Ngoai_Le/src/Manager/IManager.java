package Manager;

import model.Product;

import java.util.ArrayList;

public interface IManager<H> {
    void add(H product);
    void delete(int id);
    void edit(int id, H product);
    ArrayList<Product> display();
}
