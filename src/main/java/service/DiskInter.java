package service;

public interface DiskInter {
    void insert(String name);
    void update(String name,Boolean condition);
    Boolean isAvailable(String name);
}
