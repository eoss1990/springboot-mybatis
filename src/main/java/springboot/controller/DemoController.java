package springboot.controller;

import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springboot.bean.Demo;
import springboot.service.DemoService;

import java.util.List;

/**
 * Created by yangyu on 2017/1/19.
 */
@RestController
@RequestMapping("/mybatis")
public class DemoController {

    @Autowired
    private DemoService demoService;

    @RequestMapping("/findAll")
    public List<Demo> findAll(){
        return demoService.findAll();
    }

    @RequestMapping("/findByPage/{pageNum}/{pageSize}")
    public List<Demo> findByPage(@PathVariable int pageNum,@PathVariable int pageSize){
        PageHelper.startPage(pageNum,pageSize);
        return demoService.findAll();
    }

    @RequestMapping("/findOne/{id}")
    public Demo findOne(@PathVariable int id){
        return demoService.findOne(id);
    }

    @RequestMapping("/save/{id}/{name}")
    public Demo save(@PathVariable int id,@PathVariable String name){
        Demo demo = new Demo();
        demo.setId(id);
        demo.setName(name);
        demoService.save(demo);
        return demo;
    }

    @RequestMapping("/delete/{id}")
    public String delete(@PathVariable int id){
        demoService.delete(id);
        return "删除成功！";
    }

    @RequestMapping("/update/{id}/{name}")
    public Demo update(@PathVariable int id , @PathVariable String name){
        Demo demo = new Demo();
        demo.setId(id);
        demo.setName(name);
        demoService.update(demo);
        return demo;
    }
}
