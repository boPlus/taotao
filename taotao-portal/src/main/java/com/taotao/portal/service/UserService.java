package com.taotao.portal.service;

import com.taotao.pojo.TbUser;

/**
 * Created by Administrator on 2017/8/8 0008.
 */
public interface UserService {

    TbUser getUserByToken(String token);

}
