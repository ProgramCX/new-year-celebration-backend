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

   @PutMapping("/update")
    public Wishes updateWish(@RequestBody Wishes wish) {
       wishService.updateWishes(wish);
       return wish;
   }

   @GetMapping("/get-wish")
    public Wishes getWish(@RequestParam("name") String name) {
        return wishService.getWishes(name);
    }

    @PostMapping("/add-love")
    public void addLove(@RequestParam String name) {
        System.out.println("add"+name);
       wishService.addLove(name);
    }

    @PostMapping("/remove-love")
    public void removeLove(@RequestBody String name) {
        wishService.removeLove(name);
    }




}
