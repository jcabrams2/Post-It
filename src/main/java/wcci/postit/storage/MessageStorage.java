package wcci.postit.storage;

import wcci.postit.entities.Message;
import wcci.postit.storage.repository.MessageRepository;
import org.springframework.stereotype.Service;

@Service
public class MessageStorage {
    private MessageRepository messageRepository;
    public MessageStorage(MessageRepository messageRepository){
        this.messageRepository = messageRepository;
    }
    public void saveMessage(Message message){
        this.messageRepository.save(message);
    }
}
