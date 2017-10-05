package nb.ccdust;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Created by Administrator on 2017/9/17.
 */

//@FeignClient(name="eureka-user-provider",fallback = FeignFallbackClient.class)
@FeignClient(name="eureka-user-provider",fallbackFactory = FeignFallbackFactory.class)
public interface UserFeignClient {
    @GetMapping("/user/get/{id}")
    public User findById(@PathVariable("id") Integer id);
}

