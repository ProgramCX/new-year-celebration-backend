package cn.programcx.ismserve.mapper;
import cn.programcx.ismserve.model.Wishes;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface WishesMapper {
    @Select("select * from wish")
    List<Wishes> findAll();

    @Insert(" insert into wish(content,name) values (#{content},#{name})")
    void insert(Wishes wishes);

    @Update(" update wish set content=#{content} where name=#{name}")
    void update(Wishes wishes);

    @Select(" select * from wish where name=#{id}")
    Wishes findByString(String name);

    @Select("update wish set loves=loves+1 where name=#{id}")
    void addLove(String name);

    @Select("update wish set loves=loves-1 where name=#{id}")
    void removeLove(String name);
}
