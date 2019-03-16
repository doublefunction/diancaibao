package com.tjufe.manage.Controller;

import com.tjufe.manage.dataObject.SellerInfo;
import com.tjufe.manage.service.UserService;
import com.tjufe.manage.utils.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

//    @RequestMapping("/show")
//    public String userList(){
//          return "view/userList";
//    }
    @RequestMapping("/show")
   public ModelAndView show(@RequestParam(required = false) String username,
                            @RequestParam(required = false, value = "pageNo", defaultValue = "1") int pageNo){
Page page =new Page();
page.setPageNo(pageNo);
SellerInfo sellerInfo = new SellerInfo();
sellerInfo.setUsername(username);
page.setCondition(sellerInfo);
    ModelAndView modelAndView= new ModelAndView("view/userList");
    List<SellerInfo> sellerInfoList = userService.findSellerInfoPageList(page);
    page.setResult(sellerInfoList);
    modelAndView.addObject("page",page);
    return modelAndView;
}


    @RequestMapping("findAll")
    public ModelAndView findAll(){
        ModelAndView modelAndView= new ModelAndView();
        List<SellerInfo> sellerInfoList = userService.findAll();
        modelAndView.addObject("sellerInfoList",sellerInfoList);
        return modelAndView;
    }
}
