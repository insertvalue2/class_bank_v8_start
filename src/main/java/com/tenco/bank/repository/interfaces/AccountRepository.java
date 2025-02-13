package com.tenco.bank.repository.interfaces;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import com.tenco.bank.repository.model.Account;
import org.apache.ibatis.annotations.Param;

@Mapper // 반드시 작성
public interface AccountRepository {

    public int insert(Account account);
    public int updateById(Account account);
    // 주의! 파라미터가 2개 이상일 때 반드시 @Param 어노테이션을 사용하자.
    public int deleteById(@Param("id") Integer id, @Param("name") String name);
    public List<Account> findByUserId(@Param("userId") Integer principalId);
    public Account findByNumber(@Param("number") String id);

}