package openBlog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import openBlog.model.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
