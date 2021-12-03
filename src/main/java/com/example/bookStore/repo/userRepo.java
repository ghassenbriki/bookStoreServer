package com.example.bookStore.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.bookStore.models.User ;

public interface userRepo extends JpaRepository<User,Long>
{



}
