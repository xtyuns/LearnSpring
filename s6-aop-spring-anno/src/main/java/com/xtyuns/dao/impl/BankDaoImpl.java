package com.xtyuns.dao.impl;

import org.springframework.stereotype.Repository;

@Repository
public class BankDaoImpl {

    public Float selectMoney(){//核心方法
        Float money = 10f;
        System.out.println("selectMoney()...查询到您当前账户拥有: " + money);
        return money;
    }

    public void updateMoney(){//核心方法
        System.out.println("updateMoney....转出去1元");
    }

    public void invest(){//核心方法
        System.out.println("invest()...投资理财100万，投资失败");
    }

}
