package com.itmuch.learn.user.repository;

import com.itmuch.learn.user.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    // select * from user where id = ? or username like %?% or age = ?
    List<User> findByIdOrUsernameLikeOrAge(Integer id, String username, short age);
}
