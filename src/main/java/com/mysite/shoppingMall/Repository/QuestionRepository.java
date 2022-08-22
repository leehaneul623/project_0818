package com.mysite.shoppingMall.Repository;

import com.mysite.shoppingMall.Vo.Question;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface QuestionRepository extends JpaRepository<Question, Integer> {

    @Query("select q from Question q where q.subject like %:kw%")
    Page<Question> findAllByKeyword(@Param("kw") String kw, Pageable pageable);

  //  List<Question> findByMallUserId(Integer userId);
  //  Page<Question> findAll(Pageable pageable);

}
