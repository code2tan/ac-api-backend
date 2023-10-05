package com.ac.common.model.vo;

import com.ac.common.model.entity.Post;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author code2tan
 * 帖子视图
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class PostVO extends Post {

    /**
     * 是否已点赞
     */
    private Boolean hasThumb;

    private static final long serialVersionUID = 1L;
}