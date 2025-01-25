package cn.programcx.ismserve.mapper;
import cn.programcx.ismserve.model.Wishes;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface WishesMapper {
    @Select("select * from wish")
    List<Wishes> findAll();

    @Insert(" insert into wish(content,name) values (#{content},#{name})")
    int insert(Wishes wishes);
}
