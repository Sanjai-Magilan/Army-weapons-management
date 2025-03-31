import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.model.Entity;
import com.example.service.EntityService;

import java.util.List;

@RestController
@RequestMapping("/api/entities")
public class ApiController {

    @Autowired
    private EntityService entityService;

    @GetMapping
    public List<Entity> getAllEntities() {
        return entityService.getAllEntities();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Entity> getEntityById(@PathVariable Long id) {
        return entityService.getEntityById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Entity createEntity(@RequestBody Entity entity) {
        return entityService.createEntity(entity);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Entity> updateEntity(@PathVariable Long id, @RequestBody Entity entity) {
        return entityService.updateEntity(id, entity)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEntity(@PathVariable Long id) {
        if (entityService.deleteEntity(id)) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}