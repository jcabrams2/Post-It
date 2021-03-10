package wcci.postit.storage;

import wcci.postit.storage.repository.MessageRepository;
import org.springframework.stereotype.Service;

@Service
public class MessageStorage {
    private MessageRepository messageRepository;
    public MessageStorage(MessageRepository messageRepository){
        this.messageRepository = messageRepository;
    }
}
