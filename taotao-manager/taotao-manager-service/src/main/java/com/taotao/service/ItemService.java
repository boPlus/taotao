package com.taotao.service;

import com.taotao.common.pojo.EUDataGridResult;
import com.taotao.common.pojo.TaotaoResult;
import com.taotao.pojo.TbItem;

/**
 * Created by Administrator on 2017/8/2 0002.
 */
public interface ItemService {
    TbItem getItemById(long itemId);
    EUDataGridResult getItemList(int page, int rows);
    TaotaoResult createItem(TbItem item, String desc, String itemParam) throws Exception;
}
