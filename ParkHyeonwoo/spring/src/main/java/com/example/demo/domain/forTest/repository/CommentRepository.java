package com.example.demo.domain.forTest.repository;

import com.example.demo.domain.forTest.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long> {

    @Query("select c from Comment c join c.testBoard tb where tb.id = :boardId") // 쿼리문 직접 사용
    List<Comment> findAllCommentsByBoardId(Long boardId);    // boardId = ↑
}
