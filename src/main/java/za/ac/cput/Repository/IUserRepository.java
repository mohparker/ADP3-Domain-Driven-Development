package za.ac.cput.Repository;

import za.ac.cput.Entity.User;

import java.util.Set;

public interface IUserRepository extends IRepository<User,String> {
    //create, read, update, delete
    public Set<User> getAll();

    User create(User user);
}
