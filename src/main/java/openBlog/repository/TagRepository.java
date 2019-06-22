package openBlog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import openBlog.model.Tag;

public interface TagRepository extends JpaRepository<Tag, Long> {

    Tag findByNameIgnoreCase(String name);
}
