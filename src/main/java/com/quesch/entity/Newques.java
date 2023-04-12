package com.quesch.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName newques
 */
@TableName(value ="newques")
@Data
public class Newques implements Serializable {
    /**
     * 问题id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 用户id
     */
    @TableField(value = "user_id")
    private Integer userId;

    /**
     * 标题
     */
    @TableField(value = "title")
    private String title;

    /**
     * 描述
     */
    @TableField(value = "description")
    private String description;

    /**
     * 点赞数
     */
    @TableField(value = "like")
    private Integer like;

    /**
     * 收藏数
     */
    @TableField(value = "collect")
    private Integer collect;

    /**
     * 评论数
     */
    @TableField(value = "comment")
    private Integer comment;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private Date createTime;

    /**
     * 修改时间
     */
    @TableField(value = "update_time")
    private Date updateTime;

    /**
     * 图片
     */
    @TableField(value = "picture")
    private String picture;

    /**
     * 分类
     */
    @TableField(value = "tag")
    private String tag;

    /**
     * 
     */
    @TableField(value = "delete_time")
    private Date deleteTime;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}