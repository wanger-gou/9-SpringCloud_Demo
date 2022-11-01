package com.xubo.controller;

import com.xubo.bean.Result;
import com.xubo.dao.ResultDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author 真的太难啦！
 * @date 2022-11-01 04:08:40
 * @description
 */
@RestController
@RequestMapping("/result")
public class ResultHandler {
    @Autowired
    private ResultDao resultDao;
    //获取启动启动类时所配置的端口号注入到port当中
    @Value("${server.port}")
    private String port;

    @GetMapping("/findAll")
    public List<Result> findAll(){
        return resultDao.findAll();
    }
    @GetMapping("/findByStudentNo/{studentNo}")
    public Result findByStudentNo(@PathVariable("studentNo")Integer studentNo){
        return resultDao.findByStudentNo(studentNo);
    }

    @PostMapping("/save")
    public void save(@RequestBody Result result){
        resultDao.saveOrUpdate(result);
    }

    @PutMapping("/update")
    public void update(@RequestBody Result result){
        resultDao.saveOrUpdate(result);
    }

    @DeleteMapping("/delete/{studentNo}")
    public void delete(@PathVariable("studentNo") Integer studentNo){
        resultDao.deleteByStudentNo(studentNo);
    }

    @GetMapping("/index")
    public String index(){
        return "当前端口号为："+this.port;
    }
}
