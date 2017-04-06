package springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springboot.bean.Demo;
import springboot.mapper.DemoMapper;

import java.util.List;

/**
 * Created by yangyu on 2017/1/19.
 */
@Service
public class DemoService {

    @SuppressWarnings("SpringJavaAutowiringInspection")
    @Autowired
    private DemoMapper demoMapper;

    public List<Demo> findAll(){
        return demoMapper.findAll();
    }

    public Demo findOne(int id){
        return demoMapper.findOne(id);
    }

    public void save(Demo demo){
        demoMapper.save(demo);
    }

    public void delete(int id){
        demoMapper.delete(id);
    }

    public void update(Demo demo){
        demoMapper.update(demo);
    }
}
