package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {

    public List<User> getAll();
    public User get(int id);

    public User create(User user);

    public void update(User user);

    public void delete(int id);
}
