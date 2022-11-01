package com.xubo.dao;

import com.xubo.bean.Result;

import java.util.List;

public interface ResultDao {

  public List<Result> findAll();
  public Result findByStudentNo(Integer studentNo);
  public void saveOrUpdate(Result result);
  public void deleteByStudentNo(Integer studentNo);

}