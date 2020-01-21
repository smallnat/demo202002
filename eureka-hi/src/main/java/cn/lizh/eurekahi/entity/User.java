package cn.lizh.eurekahi.entity;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;


/**
 * @author lizh
 * @date 2020/1/21
 */
@Data
@RequiredArgsConstructor
public class User {
	/**
	 * ID
	 */
	private Integer id;

	/**
	 * 名称
	 */
	@NonNull
	private String name;

	/**
	 * 年龄
	 */
	@NonNull
	private Integer age;
}
