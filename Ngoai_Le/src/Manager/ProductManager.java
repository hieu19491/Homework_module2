package Manager;

import model.Product;

import java.util.ArrayList;

public class ProductManager implements IManager<Product> {
    ArrayList<Product> products = new ArrayList<Product>();

    public ProductManager() {
    }

    public ProductManager(ArrayList<Product> products) {
        this.products = products;
    }

    @Override
    public void add(Product product) {
        this.products.add(product);
    }
    public int getIndex(int id){
        for (int i = 0; i < this.products.size(); i++) {
            if(id == this.products.get(i).getId()){
                return i;
            }
        }
        return -1;
    }

    @Override
    public void delete(int id) {
        int index = getIndex(id);
        this.products.remove(index);
    }


    @Override
    public void edit(int id, Product product) {
        int index = getIndex(id);
        this.products.add(index, product);
    }

    @Override
    public ArrayList<Product> display() {
        return this.products;
    }
}
