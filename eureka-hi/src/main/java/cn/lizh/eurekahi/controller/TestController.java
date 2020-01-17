package cn.lizh.eurekahi.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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
		return "hi, i'm from port " + serverPort;
	}

}
