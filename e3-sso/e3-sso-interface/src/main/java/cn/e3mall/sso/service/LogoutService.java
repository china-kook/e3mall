package cn.e3mall.sso.service;

import cn.e3mall.common.utils.E3Result;

public interface LogoutService {

    E3Result userLogout(String token);

}
