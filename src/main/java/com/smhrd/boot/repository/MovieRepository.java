package com.smhrd.boot.repository;

import com.smhrd.boot.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository           //<테이블로 만들어지는 객체(Class)의 이름 , Class에 지정된 @Id의 타입>
public interface MovieRepository extends JpaRepository<Movie,Long> {
}
