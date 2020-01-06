package com.wanbang.youyibang.po;

import lombok.Data;

import java.util.Date;

@Data
public class BdyUser {
    /**
     *
     */
    private Integer id;

    /**
     * 姓名
     */
    private String truename;

    /**
     * 1 男 2 女 0 未知
     */
    private Short sex;

    /**
     * 出生年份
     */
    private String birthday;

    /**
     * 手机号
     */
    private String userTel;

    /**
     * openid(tp_con_relation中的fyh_openid)
     */
    private String openid;

    /**
     *
     */
    private String token;

    /**
     * 注册时间
     */
    private Integer createTime;

    /**
     * 编辑时间
     */
    private Integer updateTime;

    /**
     * 门店id(tp_bdy_drugstore的主键ID)
     */
    private Integer drugStoreId;

    /**
     * 1 审核通过  2 审核不通过 0 待审核
     */
    private Short auditStatus;

    /**
     * 审核原因
     */
    private String auditReason;

    /**
     * 审核时间
     */
    private Integer auditTime;

    /**
     * 0  未删除  1 已删除
     */
    private Short isDel;

    /**
     * 职位
     */
    private String position;

    /**
     * 身份证反面
     */
    private String idcardReverse;

    /**
     * 身份证正面
     */
    private String idcardPositive;

    /**
     * 是否有“问医生开药权限”，1有 0没有
     */
    private Integer hasRp;

    /**
     * 是否有患者管理，1有 0没有
     */
    private Integer hasPatientManage;

    /**
     * 暂时不用了
     */
    private String unionid;

    /**
     * 药师 0 否 1 药师 2 执业药师
     */
    private Byte pharmacist;

    /**
     * 药师证/执业药师证
     */
    private String pharmacistImg;

    /**
     * 药师签名
     */
    private String pharmacistSignImg;

    /**
     * 邦甸园用户积分(100积分1元)（邦甸园商城微信小程序），暂时先不做积分先做邦指数
     */
    private Integer bIntegral;

    /**
     * 礼品卡充值邦指数，创建的邦甸园用户
     */
    private Integer ecmMallUserId;

    /**
     * 0 信息无修改 1 有更新的信息待审核
     */
    private Short isEdit;

    /**
     *
     */
    private String rongCloudToken;

    /**
     * 慢病管理师等级 0没有任何等级,1初级过,2中级过3,高级过
     */
    private Integer manageStatus;

    /**
     * 修改版本号
     */
    private Integer updateVersion;

    /**
     * 邦指数，100邦指数1元
     */
    private Integer balance;

    /**
     * 开始时间,HH:mm
     */
    private String checkRpNotifyStart;

    /**
     * 结束时间,HH:mm
     */
    private String checkRpNotifyEnd;

    /**
     * 审核提醒是否打开，1打开，0关闭
     */
    private Byte isCheckRpNotifyOpen;

    /**
     * 初级慢病管理师证书编号
     */
    private String primaryScdmNo;

    /**
     * 初级慢病管理师证书签发时间，线上考试通过时的时间戳
     */
    private Date primaryScdmTime;

    /**
     * 中级慢病管理师证书编号
     */
    private String middleScdmNo;

    /**
     * 中级慢病管理师证书签发时间，线上考试通过时的时间戳
     */
    private Date middleScdmTime;

    /**
     * 1公众号店员填写信息注册   2礼品卡充值系统静默注册
     */
    private Byte regSource;

}