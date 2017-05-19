/**
 * 
 */
package bsubash.springconfig.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * SpringConfig
 * 
 * @author Subash Bhattarai
 * @since May 18, 2017
 * @version 1.0
 */
@Controller
public class HelloController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    private String loadIndex() {
	return "index";
    }
}
