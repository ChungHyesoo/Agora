package com.ssafy.repository;

import com.ssafy.entity.rdbms.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends JpaRepository<File, Long> {

//    @Query("select ")
    File findProfileImgUrl(Long fileId);
}
