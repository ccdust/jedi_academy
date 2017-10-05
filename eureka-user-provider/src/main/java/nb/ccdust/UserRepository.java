package nb.ccdust;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Administrator on 2017/9/16.
 */
public interface UserRepository extends JpaRepository<User,Integer> {
}
