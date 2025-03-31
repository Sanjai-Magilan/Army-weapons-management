import org.springframework.data.jpa.repository.JpaRepository;
import com.example.model.Entity;

public interface EntityRepository extends JpaRepository<Entity, Long> {
}