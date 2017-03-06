package com.example.repository;

import com.example.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by wzy on 2017/2/13.
 */
@Repository
public interface PersonRepository extends JpaRepository<Person,Long> {
    List<Person> findByName(String name);

    List<Person> findByAddress(String address);

    List<Person> findByNameAndAddress(String name,String address);

    @Query("select p from Person p where p.name=:name and p.address=:address")
    List<Person> withNameAndAddressQuery(@Param("name")String Name, @Param("address")String address);
}
