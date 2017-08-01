package invoicerouter.invoice.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @RequestMapping("/")
    public @ResponseBody String defaultRequest()
    {
        return "Welcome to this Home App!";
    }

    @RequestMapping("/addproduct")
    public @ResponseBody String addProduct()
    {
        return "Add a product here";
    }

    @RequestMapping("/listproduct")
    public @ResponseBody String listProduct()
    {
        return "This is a list of your product:";
    }

    @RequestMapping("/thankyou")
    public @ResponseBody String thankyou()
    {
        return "Thanks for shopping with us!";
    }

    @RequestMapping("/index")
    public String index(Model model)
    {
        model.addAttribute("message", "HEllO, Grace!");
        return "hello";
    }

}
