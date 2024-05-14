package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 新房信息
 *
 * @author 
 * @email
 */
@TableName("fangchan")
public class FangchanEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public FangchanEntity() {

	}

	public FangchanEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 新房名称
     */
    @TableField(value = "fangchan_name")

    private String fangchanName;


    /**
     * 新房类型
     */
    @TableField(value = "fangchan_types")

    private Integer fangchanTypes;


    /**
     * 新房图片
     */
    @TableField(value = "fangchan_photo")

    private String fangchanPhoto;


    /**
     * 楼层
     */
    @TableField(value = "fangchan_louceng")

    private String fangchanLouceng;


    /**
     * 面积
     */
    @TableField(value = "fangchan_mianji")

    private String fangchanMianji;


    /**
     * 价格
     */
    @TableField(value = "fangchan_new_money")

    private Double fangchanNewMoney;


    /**
     * 新房介绍
     */
    @TableField(value = "fangchan_content")

    private String fangchanContent;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }
    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：新房名称
	 */
    public String getFangchanName() {
        return fangchanName;
    }
    /**
	 * 获取：新房名称
	 */

    public void setFangchanName(String fangchanName) {
        this.fangchanName = fangchanName;
    }
    /**
	 * 设置：新房类型
	 */
    public Integer getFangchanTypes() {
        return fangchanTypes;
    }
    /**
	 * 获取：新房类型
	 */

    public void setFangchanTypes(Integer fangchanTypes) {
        this.fangchanTypes = fangchanTypes;
    }
    /**
	 * 设置：新房图片
	 */
    public String getFangchanPhoto() {
        return fangchanPhoto;
    }
    /**
	 * 获取：新房图片
	 */

    public void setFangchanPhoto(String fangchanPhoto) {
        this.fangchanPhoto = fangchanPhoto;
    }
    /**
	 * 设置：楼层
	 */
    public String getFangchanLouceng() {
        return fangchanLouceng;
    }
    /**
	 * 获取：楼层
	 */

    public void setFangchanLouceng(String fangchanLouceng) {
        this.fangchanLouceng = fangchanLouceng;
    }
    /**
	 * 设置：面积
	 */
    public String getFangchanMianji() {
        return fangchanMianji;
    }
    /**
	 * 获取：面积
	 */

    public void setFangchanMianji(String fangchanMianji) {
        this.fangchanMianji = fangchanMianji;
    }
    /**
	 * 设置：价格
	 */
    public Double getFangchanNewMoney() {
        return fangchanNewMoney;
    }
    /**
	 * 获取：价格
	 */

    public void setFangchanNewMoney(Double fangchanNewMoney) {
        this.fangchanNewMoney = fangchanNewMoney;
    }
    /**
	 * 设置：新房介绍
	 */
    public String getFangchanContent() {
        return fangchanContent;
    }
    /**
	 * 获取：新房介绍
	 */

    public void setFangchanContent(String fangchanContent) {
        this.fangchanContent = fangchanContent;
    }
    /**
	 * 设置：录入时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 获取：录入时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Fangchan{" +
            "id=" + id +
            ", fangchanName=" + fangchanName +
            ", fangchanTypes=" + fangchanTypes +
            ", fangchanPhoto=" + fangchanPhoto +
            ", fangchanLouceng=" + fangchanLouceng +
            ", fangchanMianji=" + fangchanMianji +
            ", fangchanNewMoney=" + fangchanNewMoney +
            ", fangchanContent=" + fangchanContent +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
