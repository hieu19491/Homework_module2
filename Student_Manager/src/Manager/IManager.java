package Manager;

public interface IManager<H> {
    void add(H student);
    void delete(int id);
    void edit(int id, H student);
    H[] findAll();
}
