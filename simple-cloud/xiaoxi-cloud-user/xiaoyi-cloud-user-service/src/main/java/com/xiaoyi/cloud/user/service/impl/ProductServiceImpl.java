package com.xiaoyi.cloud.user.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xiaoyi.cloud.user.domain.Product;
import com.xiaoyi.cloud.user.mapper.ProductMapper;
import com.xiaoyi.cloud.user.service.IProductService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

/**
 * <p>
 * 产品表 服务实现类
 * </p>
 *
 * @author yuanLong Wei
 * @since 2020-03-14
 */
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements IProductService {

    @Resource
    private ProductMapper productMapper;


}
