package com.blocker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.blocker.dto.CommentBoardDto;

@Repository
public interface CommentBoardRepository extends JpaRepository<CommentBoardDto, String> {

}