/**
 * 
 */
package com.math.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Vinayak
 *
 */
@RestController
public class MathController {
	@GetMapping("/temp")
	public String temp() {
		return "Demo controller called";
	}
	
	@GetMapping("/demo")
	public String demo() {
		return "Demo controller called1";
	}
}
