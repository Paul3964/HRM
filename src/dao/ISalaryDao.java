package dao;

import java.util.List;

import entity.Salary;

public interface ISalaryDao {
//保存薪酬标准
public abstract int saveSaveSalary(Salary s);
//获取薪酬+1的薪酬id
public abstract String getId();
//显示待复核的薪酬标准  
public abstract List<Salary> getAllstates(int pagNum,int nums);
//获取待复核总共数据条数，为分页提供依据
public abstract int getTotalCount();
//根据id进入复核编辑菜单
public abstract List<Salary> showSalary(int id);
//根据id审核
public abstract int updateSalary(int id);
//根据id添加复核意见
public abstract int insertSalary(int id,String message);
//获取筛选出来的记录总条数
public abstract int getCount(Salary s);
//根据筛选出来的结果进行分页显示
public abstract List<Salary> getSalary(int PageNum,int nums,Salary s);

}
