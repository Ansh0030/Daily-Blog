package com.channelblog.dailyblog.repo;


import com.channelblog.dailyblog.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends MongoRepository<User, String> {

    User findByUserNameAndPassword(String userName,String password);

}
