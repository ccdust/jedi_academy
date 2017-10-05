package nb.ccdust;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/9/17.
 */

@RestController
public class FeignController {

    @Autowired
    private UserFeignClient userFeignClient;

    @GetMapping("/user/get/{id}")
    public User findById(@PathVariable("id") Integer id){
        return userFeignClient.findById(id);
    }
}
