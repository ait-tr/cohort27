package our_application.repositories;

import our_application.domain.User;

public interface UserRepository extends CrudRepository {

    User getByEmail(String email);
}