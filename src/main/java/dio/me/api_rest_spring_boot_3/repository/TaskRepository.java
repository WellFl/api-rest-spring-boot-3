package dio.me.api_rest_spring_boot_3.repository;

import dio.me.api_rest_spring_boot_3.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
