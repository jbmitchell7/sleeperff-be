package cloud.jakemitchell.sleeperffbe.User;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public Optional<User> user(ObjectId id) {
        return userRepository.findById(id);
    }

}
