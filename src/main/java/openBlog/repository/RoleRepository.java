package openBlog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import openBlog.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

    Role findByName(String name);
}
