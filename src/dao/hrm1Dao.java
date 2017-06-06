package dao;

import entity.hrm1;
import java.util.List;

public interface hrm1Dao {

    int deleteByPrimaryKey(Integer id);

    int insert(hrm1 record);

    int insertSelective(hrm1 record);

    hrm1 selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(hrm1 record);

    int updateByPrimaryKey(hrm1 record);
}