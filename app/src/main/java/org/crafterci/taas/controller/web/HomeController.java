package org.crafterci.taas.controller.web;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.util.MimeTypeUtils;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Arpan Mukhopadhyay
 */
@Controller
@Log4j2
public class HomeController {

  @GetMapping(path = {"/"}, produces = MimeTypeUtils.TEXT_HTML_VALUE)
  public String home() {
    logger.debug("New request received to open the dashboard");
    return "home";
  }

}
