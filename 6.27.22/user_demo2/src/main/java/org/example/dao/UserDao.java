package org.example.dao;

import org.example.model.User;

// CRUD - Create, Read, Update, Delete
public interface UserDao {
    public User create(User user);
    public User getById(int id);
    public User getByUsername(String username);
    public User update(User user, int id);
    public void delete(int id);


}
