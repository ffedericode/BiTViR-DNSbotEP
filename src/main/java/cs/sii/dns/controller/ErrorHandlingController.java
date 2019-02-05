package cs.sii.dns.controller;

import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class ErrorHandlingController implements ErrorController{

	    private static final String PATH = "/error";

	    /**
	     * Redirect any GET request with invalid (not mapped) URLs to our default 404 page
	     * 
	     * @return
	     */
	    @RequestMapping(value = PATH)
	    public ModelAndView error() {
	        return new ModelAndView("404");
	    }

	    @Override
	    public String getErrorPath() {
	        return PATH;
	    }
}
