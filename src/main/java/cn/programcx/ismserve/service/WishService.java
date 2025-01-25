package cn.programcx.ismserve.service;

import cn.programcx.ismserve.model.Wishes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.programcx.ismserve.mapper.WishesMapper;

import java.util.List;

@Service
public class WishService {

    @Autowired
    private WishesMapper wishesMapper;

    public List<Wishes> getWishes() {
        return wishesMapper.findAll();
    }

    public void insertWishes(Wishes wishes) {
        wishesMapper.insert(wishes);
    }

    public void updateWishes(Wishes wishes) {
        wishesMapper.update(wishes);
    }

    public Wishes getWishes(String name) {
        return wishesMapper.findByString(name);
    }

    public void removeLove(String name) {
        wishesMapper.removeLove(name);
    }

    public void addLove(String name) {
        wishesMapper.addLove(name);
    }
}
