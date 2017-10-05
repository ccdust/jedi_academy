package nb.ccdust;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/10/2.
 */
@Component
public class FeignFallbackFactory implements FallbackFactory<UserFeignClient> {
    @Override
    public UserFeignClient create(Throwable throwable) {
        return new UserFeignClient() {
            @Override
            public User findById(Integer id) {
                System.out.println(throwable.getCause());
                User user=new User();
                user.setUsername("大鸡巴");
                return user;
            }
        };
    }
}
