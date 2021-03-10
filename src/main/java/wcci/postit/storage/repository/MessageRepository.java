package wcci.postit.storage.repository;

import org.jboss.logging.Messages;
import org.springframework.data.repository.CrudRepository;
import wcci.postit.entities.Message;

public interface MessageRepository extends CrudRepository<Message, Long> {
}
