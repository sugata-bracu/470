package com.example.demo.Service;

import com.example.demo.Model.Userdtls;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import static org.junit.jupiter.api.Assertions.*;

class UserServiceTest {

    String name = "Arnab";

     UserService userService = new UserService() {
         @Override
         public Userdtls getuserbyemail(String email) {
             return null;
         }

         @Override
         public String getNamebyEmail(String email) {
             return null;
         }

         @Override
         public List<Userdtls> findAll() {
             return null;
         }

         @Override
         public List<Userdtls> findAll(Sort sort) {
             return null;
         }

         @Override
         public List<Userdtls> findAllById(Iterable<Integer> integers) {
             return null;
         }

         @Override
         public <S extends Userdtls> List<S> saveAll(Iterable<S> entities) {
             return null;
         }

         @Override
         public void flush() {

         }

         @Override
         public <S extends Userdtls> S saveAndFlush(S entity) {
             return null;
         }

         @Override
         public <S extends Userdtls> List<S> saveAllAndFlush(Iterable<S> entities) {
             return null;
         }

         @Override
         public void deleteAllInBatch(Iterable<Userdtls> entities) {

         }

         @Override
         public void deleteAllByIdInBatch(Iterable<Integer> integers) {

         }

         @Override
         public void deleteAllInBatch() {

         }

         @Override
         public Userdtls getOne(Integer integer) {
             return null;
         }

         @Override
         public Userdtls getById(Integer integer) {
             return null;
         }

         @Override
         public Userdtls getReferenceById(Integer integer) {
             return null;
         }

         @Override
         public <S extends Userdtls> List<S> findAll(Example<S> example) {
             return null;
         }

         @Override
         public <S extends Userdtls> List<S> findAll(Example<S> example, Sort sort) {
             return null;
         }

         @Override
         public Page<Userdtls> findAll(Pageable pageable) {
             return null;
         }

         @Override
         public <S extends Userdtls> S save(S entity) {
             return null;
         }

         @Override
         public Optional<Userdtls> findById(Integer integer) {
             return Optional.empty();
         }

         @Override
         public boolean existsById(Integer integer) {
             return false;
         }

         @Override
         public long count() {
             return 0;
         }

         @Override
         public void deleteById(Integer integer) {

         }

         @Override
         public void delete(Userdtls entity) {

         }

         @Override
         public void deleteAllById(Iterable<? extends Integer> integers) {

         }

         @Override
         public void deleteAll(Iterable<? extends Userdtls> entities) {

         }

         @Override
         public void deleteAll() {

         }

         @Override
         public <S extends Userdtls> Optional<S> findOne(Example<S> example) {
             return Optional.empty();
         }

         @Override
         public <S extends Userdtls> Page<S> findAll(Example<S> example, Pageable pageable) {
             return null;
         }

         @Override
         public <S extends Userdtls> long count(Example<S> example) {
             return 0;
         }

         @Override
         public <S extends Userdtls> boolean exists(Example<S> example) {
             return false;
         }

         @Override
         public <S extends Userdtls, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
             return null;
         }
     };

    public UserService getUserService() {
        return new UserService() {
            @Override
            public Userdtls getuserbyemail(String email) {
                return null;
            }

            @Override
            public String getNamebyEmail(String email) {
                return null;
            }

            @Override
            public List<Userdtls> findAll() {
                return null;
            }

            @Override
            public List<Userdtls> findAll(Sort sort) {
                return null;
            }

            @Override
            public List<Userdtls> findAllById(Iterable<Integer> integers) {
                return null;
            }

            @Override
            public <S extends Userdtls> List<S> saveAll(Iterable<S> entities) {
                return null;
            }

            @Override
            public void flush() {

            }

            @Override
            public <S extends Userdtls> S saveAndFlush(S entity) {
                return null;
            }

            @Override
            public <S extends Userdtls> List<S> saveAllAndFlush(Iterable<S> entities) {
                return null;
            }

            @Override
            public void deleteAllInBatch(Iterable<Userdtls> entities) {

            }

            @Override
            public void deleteAllByIdInBatch(Iterable<Integer> integers) {

            }

            @Override
            public void deleteAllInBatch() {

            }

            @Override
            public Userdtls getOne(Integer integer) {
                return null;
            }

            @Override
            public Userdtls getById(Integer integer) {
                return null;
            }

            @Override
            public Userdtls getReferenceById(Integer integer) {
                return null;
            }

            @Override
            public <S extends Userdtls> List<S> findAll(Example<S> example) {
                return null;
            }

            @Override
            public <S extends Userdtls> List<S> findAll(Example<S> example, Sort sort) {
                return null;
            }

            @Override
            public Page<Userdtls> findAll(Pageable pageable) {
                return null;
            }

            @Override
            public <S extends Userdtls> S save(S entity) {
                return null;
            }

            @Override
            public Optional<Userdtls> findById(Integer integer) {
                return Optional.empty();
            }

            @Override
            public boolean existsById(Integer integer) {
                return false;
            }

            @Override
            public long count() {
                return 0;
            }

            @Override
            public void deleteById(Integer integer) {

            }

            @Override
            public void delete(Userdtls entity) {

            }

            @Override
            public void deleteAllById(Iterable<? extends Integer> integers) {

            }

            @Override
            public void deleteAll(Iterable<? extends Userdtls> entities) {

            }

            @Override
            public void deleteAll() {

            }

            @Override
            public <S extends Userdtls> Optional<S> findOne(Example<S> example) {
                return Optional.empty();
            }

            @Override
            public <S extends Userdtls> Page<S> findAll(Example<S> example, Pageable pageable) {
                return null;
            }

            @Override
            public <S extends Userdtls> long count(Example<S> example) {
                return 0;
            }

            @Override
            public <S extends Userdtls> boolean exists(Example<S> example) {
                return false;
            }

            @Override
            public <S extends Userdtls, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
                return null;
            }
        };
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @Test
    void findBy(){
//        Userdtls user = new Userdtls(1, "arnab1056@gmail.com","Arnab", 9999, "male", "2022-12-05", "arnab",1945163820, "jiju", 23,"ROLE_user");
//        assertEquals(user, userService.getuserbyemail("arnab@gmail.com"));
    }

    @Test
    void findAll(){

    }
    @Test
    void exsits(){

    }
    @Test
    void count(){


    }
    @Test
    void findOne(){

    }
    @Test
    void delete(){

    }
    @Test
    void deleteAll(){

    }
}