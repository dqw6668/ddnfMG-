package com.dd.ddfgm.service;

import com.dd.ddfgm.entity.Account;
import com.dd.ddfgm.entity.OnlineAccount;
import com.dd.ddfgm.entity.Role;
import com.dd.ddfgm.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AccountService {
    User getUserByName(String accountname);

    public Account getAccountInfo(String accountname);

    Integer getAccountNum();

    Integer getLoginAccounts();

    List<OnlineAccount> getOnlineAccounts();

    Role getRole(String charac_name);

    List<Role> getRoles(Integer uid);

    Integer rechargeDB(String accountname, Integer cera);

    Integer rechargeDD(String accountname, Integer cera_point);
}
