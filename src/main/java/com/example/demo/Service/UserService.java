package com.example.demo.Service;


import com.example.demo.Model.Userdtls;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


public interface UserService extends JpaRepository<Userdtls, Integer> {
    String uemail="arnab@gmail.com";
    @Query("select u from Userdtls u where u.email = :email")
    public Userdtls getuserbyemail( String email);

    @Query("select u.username from Userdtls u where u.email = :email")
    public String getNamebyEmail(String email);
}