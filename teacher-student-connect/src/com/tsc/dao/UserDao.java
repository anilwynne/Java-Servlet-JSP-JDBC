package com.tsc.dao;

import java.util.List;

import com.tsc.model.Register;

public interface UserDao {
public int registration(Register r);
public Register getRegistration(String username,String password);
public List<Register> getAdmin();

}
