package com.qingge.springboot.service.impl;

import com.qingge.springboot.entity.Menu;
import com.qingge.springboot.mapper.MenuMapper;
import com.qingge.springboot.service.IMenuService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Fangqi
 * @since 2022-11-07
 */
@Service
public class MenuServiceImpl extends ServiceImpl<MenuMapper, Menu> implements IMenuService {

}
