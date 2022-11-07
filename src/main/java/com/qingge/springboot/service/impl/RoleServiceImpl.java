package com.qingge.springboot.service.impl;

import com.qingge.springboot.entity.Role;
import com.qingge.springboot.mapper.RoleMapper;
import com.qingge.springboot.service.IRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Fangqi
 * @since 2022-11-06
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements IRoleService {

}
