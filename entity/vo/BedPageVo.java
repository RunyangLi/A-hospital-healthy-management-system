package com.hello.hospital.entity.vo;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.hello.hospital.entity.po.Bed;
import com.hello.hospital.entity.vo.base.PageBase;
import lombok.Data;

import java.util.List;

/**
 * 病床分页 返回对象
 *

 */
@Data
public class BedPageVo extends PageBase {

    /**
     * 病床
     */
    private List<Bed> beds;

    /**
     * 填充分页信息
     *
     * @param iPage 分页对象
     */
    public void populatePage(IPage iPage) {
        super.populatePage(iPage);
        this.beds = iPage.getRecords();
    }

}

