package com.neo.repository.primary;

import com.neo.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author LIQI
 */
public interface PrimaryRepository extends MongoRepository<User, String> {
}
