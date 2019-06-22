package openBlog.service;

import openBlog.controller.ForbiddenException;
import openBlog.model.Comment;
import openBlog.model.Post;

import java.util.List;

public interface CommentService {

    Comment getComment(Long id);

    Long saveNewComment(Comment comment, Post post, Long parentId);

    void deleteComment(Long commentId) throws ActionExpiredException;

    void updateComment(Comment newCommentData, Long commentId) throws ActionExpiredException;

    void vote(Long commentId, boolean like) throws AlreadyVotedException, ForbiddenException;
}
