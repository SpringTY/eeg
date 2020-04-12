package com.spring.eeg.service;

import com.spring.eeg.Dao.UserLoginDao;
import com.spring.eeg.mbg.dao.ClassTableMapper;
import com.spring.eeg.mbg.dao.ClassUserMapper;
import com.spring.eeg.mbg.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class AdminService {
    @Autowired
    ClassUserMapper classUserMapper;
    @Autowired
    ClassTableMapper classTableMapper;
    @Autowired
    UserLoginDao userLoginDao;
    public void addClass(Integer userId, String className, String username) {
        ClassTable classTable = new ClassTable();
        classTable.setAdminId(userId);
        classTable.setAdminName(username);
        classTable.setClassName(className);
        classTableMapper.insertSelective(classTable);
    }

    public List<ClassTable> classList(Integer userId) {
        ClassTableExample classTableExample = new ClassTableExample();
        ClassTableExample.Criteria criteria = classTableExample.createCriteria();
        criteria.andAdminIdEqualTo(userId);
        return classTableMapper.selectByExample(classTableExample);
    }

    public List<Userlogin> getStudent(Integer classId) {
        ClassUserExample classUserExample = new ClassUserExample();
        ClassUserExample.Criteria criteria = classUserExample.createCriteria();
        criteria.andClassIdEqualTo(classId);
        List<ClassUser> classUsers = classUserMapper.selectByExample(classUserExample);
        List<Integer> userIds = new LinkedList<>();
        for (ClassUser classUser : classUsers) {
            userIds.add(classUser.getUserId());
        }
        List<Userlogin> userByUserId = userLoginDao.getUserByUserId(userIds);
        return userByUserId;
    }

    public List<ClassTable> getClassTables(Integer userId) {
        ClassTableExample classTableExample = new ClassTableExample();
        ClassTableExample.Criteria criteria = classTableExample.createCriteria();
        criteria.andAdminIdEqualTo(userId);
        return classTableMapper.selectByExample(classTableExample);
    }
}
