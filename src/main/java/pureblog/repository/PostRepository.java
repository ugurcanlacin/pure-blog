package pureblog.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import pureblog.model.Post;

public interface PostRepository extends MongoRepository<Post, String>{

}
