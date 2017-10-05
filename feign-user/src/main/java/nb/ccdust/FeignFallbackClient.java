package nb.ccdust;

import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/10/2.
 */

@Component
public class FeignFallbackClient implements UserFeignClient {
    @Override
    public User findById(Integer id) {
        User user=new User();
        user.setUsername("大傻逼");
        user.setId(250);
        return user;
    }
}
