package com.hello.hospital.entity.vo.base;

import com.baomidou.mybatisplus.core.metadata.IPage;
import lombok.Data;

/**
 * 接口分页 基础参数
 *
 * @author: Hello
 * @date: 2024-11-15
 */
@Data
public class PageBase {

    /**
     * 总条数
     */
    private Long total;

    /**
     * 总页数
     */
    private Long pages;

    /**
     * 当前页
     */
    private Long pageNumber;

    /**
     * 填充分页信息
     *
     * @param iPage 分页对象
     */
    public void populatePage(IPage iPage) {
        this.total = iPage.getTotal();
        this.pages = iPage.getPages();
        this.pageNumber = iPage.getCurrent();
    }

}

