package com.company.models;

public interface UserServiceInterface {
    void create(User user);

    User read();

    void delete(User user);

    void update(User user);

    class UserService implements UserServiceInterface {
        @Override
        public void create(User user) {

        }

        @Override
        public User read() {
            return null;
        }

        @Override
        public void delete(User user) {

        }

        @Override
        public void update(User user) {

        }
    }
}
