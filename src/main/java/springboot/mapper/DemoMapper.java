package springboot.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import springboot.bean.Demo;

import java.util.List;

/**
 * Created by yangyu on 2017/1/19.
 */
public interface DemoMapper {

    @Select("select * from Demo")
    public List<Demo> findAll();

    @Select("select * from Demo where id = #{id}")
    public Demo findOne(int id);

    @Insert("insert into Demo(id,name) values (#{id},{#name})")
    public void save(Demo demo);

    @Delete("delete from Demo where id = #{id}")
    public void delete(int id);

    @Update("update Demo set name=#{name} where id=#{id}")
    public void update(Demo demo);
}
