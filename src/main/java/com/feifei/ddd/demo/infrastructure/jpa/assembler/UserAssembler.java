package com.feifei.ddd.demo.infrastructure.jpa.assembler;

import com.feifei.ddd.demo.domain.user.entity.User;
import com.feifei.ddd.demo.infrastructure.jpa.po.TbUser;
import org.springframework.beans.BeanUtils;

import java.util.Objects;

/**
 * 持久层实体对象转PO
 *
 * @author xiaofeifei
 * @date 2020-02-03
 * @since
 */
public interface UserAssembler {

    static TbUser toPO(User user) {
        TbUser tbUser = new TbUser();
        BeanUtils.copyProperties(user, tbUser);
        return tbUser;
    }

    static User toEntity(TbUser tbUser) {
        if (Objects.isNull(tbUser)) {
            return null;
        }
        User user = new User();
        BeanUtils.copyProperties(tbUser, user);
        return user;
    }
}
