package cn.programcx.ismserve.controller;

import cn.programcx.ismserve.model.Wishes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import cn.programcx.ismserve.service.WishService;

import java.util.List;

@RestController
@RequestMapping("/api/wishes")
public class WishController {

   @Autowired
    private WishService wishService;

   @GetMapping("/get-all")
    public List<Wishes> getAll() {
       return wishService.getWishes();
   }

   @PostMapping("/add-wish")
    public Wishes addWish(@RequestBody Wishes wish) {
       wishService.insertWishes(wish);
       return wish;
   }


}
