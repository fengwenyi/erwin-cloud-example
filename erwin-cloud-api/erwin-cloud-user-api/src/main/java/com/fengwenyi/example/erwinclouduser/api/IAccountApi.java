package com.fengwenyi.example.erwinclouduser.api;

import com.fengwenyi.api.result.ResultTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * @author Erwin Feng
 * @since 2021-03-08
 */
@RequestMapping("/account-api")
public interface IAccountApi {

    @GetMapping("/decrease")
    ResultTemplate<Void> decrease(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money);
}
