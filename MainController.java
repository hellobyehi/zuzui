package com.zuzui.zuzui.Controller;

import com.zuzui.zuzui.Model.buy;
import com.zuzui.zuzui.Model.product;
import com.zuzui.zuzui.Model.zuzui;
import com.zuzui.zuzui.Repository.BuyRepo;
import com.zuzui.zuzui.Repository.ProductRepo;
import com.zuzui.zuzui.Repository.ZuzuiRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;


@Controller

public class MainController {


    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/signup")
    public String signup(){
        return "signup";
    }
    @GetMapping("/login")
    public String login(){
        return "login";
    }
    @GetMapping("/features")
    public String features(){
        return "Features";
    }

    @GetMapping("/main")
    public String n(Model model) {
        List<product> d =productRepo.findAll();
        model.addAttribute("products",d);
        return "main";
    }

    @GetMapping("/success")
    public String success(){
        return "success";
    }

    @GetMapping("/buy")
    public String buy(){
        return "buy";
    }

    @GetMapping("/addproduct")
    public String addproduct(){
        return "addproduct";
    }


    @Autowired
    private BuyRepo buyRepo;
    @PostMapping("/buy")
    public String buy(@RequestParam("name")String n,@RequestParam("email") String em,@RequestParam("address") String ad,@RequestParam("paymentMethod") String pym,@RequestParam("name_card") String noc,@RequestParam("card_number") String cn ,@RequestParam("expiration") String ex ,@RequestParam("cvv") String cv){
        buy c=new buy(n,em,ad,pym,noc,cn,ex,cv);
        buyRepo.save(c);
        return "success";
        }


    @Autowired
    private ProductRepo productRepo;
    @PostMapping("/add")
    public String add(@RequestParam("product_name") String pn, @RequestParam("price") Integer p, @RequestParam("stock") Integer s, @RequestParam("description") String d, @RequestParam("quantity") Integer q, @RequestParam("image") MultipartFile img) throws IOException {

        String path="C:/zuzui/src/main/resources/static";
        String img_name=img.getOriginalFilename();
        product l=new product(pn,p,s,d,q,img_name);
        productRepo.save(l);
        assert img_name != null;
        File f=new File(path,img_name);
        img.transferTo(f);
        return "addproduct";
    }

    @PostMapping("/login")
    public String login(@RequestParam("email") String e,@RequestParam("password") String p){
        zuzui d=zuzuiRepo.findByEmail(e);
        String lb=d.getPassword ();
        if (p.equals(lb)){
            return "main";
        }
        else {
            return "login";
        }
    }

    @Autowired
    private ZuzuiRepo zuzuiRepo;
    @PostMapping ("/signup")
    public String signup(@RequestParam("email") String e,@RequestParam("username") String u,@RequestParam("password") String p,@RequestParam("cpassword") String cp){
        if(!cp.equals(p)){
            return "signup";
        }
        else{
            zuzui o=zuzuiRepo.findByEmail(e);
            if(o==null){
                zuzui d=new zuzui(e,u,p,cp);
                zuzuiRepo.save(d);
                return "login";
            }
            else {
                return "signup";
            }

        }

    }






    }




