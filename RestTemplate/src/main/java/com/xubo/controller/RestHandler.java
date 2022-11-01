package com.xubo.controller;

import com.xubo.bean.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author 真的太难啦！
 * @date 2022-11-01 05:18:46
 * @description
 */
@RestController
@RequestMapping("/rest")
public class RestHandler {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/findAll")
    public List<Result> findAll(){
        return restTemplate.getForEntity("http://localhost:8010/result/findAll",List.class).getBody();
    }
    @GetMapping("/findAll2")
    public List<Result> findAll2(){
        return restTemplate.getForObject("http://localhost:8010/result/findAll",List.class);
    }

    @GetMapping("/findByStudentNo/{studentNo}")
    public Result findByStudentNo(@PathVariable("studentNo")Integer studentNo){
        return restTemplate.getForEntity(
                "http://localhost:8010/result/findByStudentNo/{studentNo}",Result.class,studentNo).getBody();
    }
    @GetMapping("/findByStudentNo2/{studentNo}")
    public Result findByStudentNo2(@PathVariable("studentNo")Integer studentNo){
        return restTemplate.getForObject(
                "http://localhost:8010/result/findByStudentNo/{studentNo}",Result.class,studentNo);
    }

    @PostMapping("/save")
    public void save(@RequestBody Result result){
        restTemplate.postForEntity("http://localhost:8010/result/save",result,null).getBody();
    }
    @PostMapping("/save2")
    public void save2(@RequestBody Result result){
        restTemplate.postForObject("http://localhost:8010/result/save",result,null);
    }

    @PutMapping("/update")
    public void update(@RequestBody Result result){
        restTemplate.put("http://localhost:8010/result/update",result);
    }

    @DeleteMapping("/delete/{studentNo}")
    public void delete(@PathVariable("studentNo") Integer studentNo){
        restTemplate.delete("http://localhost:8010/result/delete/{studentNo}",studentNo);
    }

}
