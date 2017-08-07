package com.taotao.service;

import com.taotao.common.pojo.EUTreeNode;

import java.util.List;

/**
 * Created by Administrator on 2017/8/2 0002.
 */
public interface ItemCatService {

    List<EUTreeNode> getCatList(long parentId);

}
