package cn.lizh.eurekahi.controller;

import cn.lizh.eurekahi.entity.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.Random;

/**
 * @author lizh
 * @date 2020/1/16
 */
@RestController
public class TestController {
	@Value("${server.port}")
	private Integer serverPort;


	@GetMapping("hi")
	public String hi() {
		// 停顿随机时间，模拟超时，以触发客户端断路器 -- 测试断路器使用
//		int sleepTime = new Random().nextInt(3000);
//		try {
//			Thread.sleep(sleepTime);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}

		return "hi, i'm from port " + serverPort;
	}

	/**
	 * 带有Request参数的请求
	 *
	 * @param name
	 * @return
	 */
	@GetMapping("hello")
	public String hello(@RequestParam String name) {
		return "hello " + name;
	}

	/**
	 * 带有Header信息的请求
	 *
	 * @return
	 */
	@GetMapping("hello2")
	public User hello2(@RequestHeader String name, @RequestHeader Integer age) {
		return new User(name, age);
	}

	/**
	 * 带有RequestBody的请求
	 *
	 * @param user
	 * @return
	 */
	@GetMapping("hello3")
	public String hello3(@RequestBody User user) {
		return "Hello " + user.getName() + ", " + user.getAge();
	}
}
