package com.xubo.dao.impl;

import com.xubo.bean.Result;
import com.xubo.dao.ResultDao;
import org.springframework.stereotype.Repository;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class ResultDaoImpl implements ResultDao {
    private static Map<Integer, Result> resultMap;

    static {
        resultMap=new HashMap<>();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            resultMap.put(1,new Result(1,101,dateFormat.parse("2020-07-06 00:00:00"),68));
            resultMap.put(2,new Result(2,102,dateFormat.parse("2020-07-07 05:00:00"),68));
            resultMap.put(3,new Result(3,103,dateFormat.parse("2020-07-23 13:00:00"),68));
            resultMap.put(4,new Result(4,102,dateFormat.parse("2020-09-06 00:02:09"),68));
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }

    @Override
    public List<Result> findAll() {
        return new ArrayList<Result>(resultMap.values());
    }

    @Override
    public Result findByStudentNo(Integer studentNo) {

        return resultMap.get(studentNo);
    }

    @Override
    public void saveOrUpdate(Result result) {
        if (resultMap.keySet().contains(result.getStudentNo())){
            resultMap.remove(result.getStudentNo());
            resultMap.put(result.getStudentNo(),result);
            return;
        }
        resultMap.put(result.getStudentNo(),result);
    }

    @Override
    public void deleteByStudentNo(Integer studentNo) {
            resultMap.remove(studentNo);
    }
}
