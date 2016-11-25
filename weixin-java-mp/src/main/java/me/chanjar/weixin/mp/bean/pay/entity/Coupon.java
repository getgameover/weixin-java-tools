package me.chanjar.weixin.mp.bean.pay.entity;

import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * <pre>
 *  代金券实现类
 * Created by GGO on 2016-11-25.
 * 注释中各行每个字段描述对应如下：
 * <li>字段名
 * <li>变量名
 * <li>是否必填
 * <li>类型
 * <li>示例值
 * <li>描述
 * </pre>
 * @author <a href="https://github.com/getgameover">GGO</a>
 */
public class Coupon {
  /**
   * <pre>
   * 代金券类型
   * coupon_type_$n
   * 否
   * String(8)
   * CASH
   * <li>CASH--充值代金券
   * <li>NO_CASH---非充值代金券
   *  订单使用代金券时有返回（取值：CASH、NO_CASH）。$n为下标,从0开始编号，举例：coupon_type_$0
   * </pre>
   */
  @XStreamAlias("coupon_type_$n")
  private String couponType;
  
  /**
   * <pre>
   * 代金券退款金额
   * coupon_refund_fee_$n
   * 否
   * Int
   * 100
   *  代金券退款金额<=退款金额，退款金额-代金券或立减优惠退款金额为现金，说明详见代金券或立减优惠
   * </pre>
   */
  @XStreamAlias("coupon_refund_fee_$n")
  private Integer couponRefundFee;
  
  /**
   * <pre>
   * 代金券退款金额
   * coupon_refund_count_$n
   * 否
   * Int
   * 100
   *  代金券退款金额<=退款金额，退款金额-代金券或立减优惠退款金额为现金，说明详见代金券或立减优惠
   * </pre>
   */
  @XStreamAlias("coupon_refund_count_$n")
  private Integer couponRefundCount;

  /**
   * <pre>
   * 代金券ID
   * coupon_id_$n
   * 否
   * String(20)
   * 10000
   * 代金券ID, $n为下标，从0开始编号
   * </pre>
   */
  @XStreamAlias("coupon_id_$n")
  private String couponId;

  /**
   * <pre>
   * 单个代金券支付金额
   * coupon_fee_$n
   * 否
   * Int
   * 100
   * 单个代金券支付金额, $n为下标，从0开始编号
   * </pre>
   */
  @XStreamAlias("coupon_fee_$n")
  private Integer couponFee;
  private List<CouponRefund> couponRefunds;
  public String getCouponType() {
    return couponType;
  }
  public void setCouponType(String couponType) {
    this.couponType = couponType;
  }
  public Integer getCouponRefundFee() {
    return couponRefundFee;
  }
  public void setCouponRefundFee(Integer couponRefundFee) {
    this.couponRefundFee = couponRefundFee;
  }
  public Integer getCouponRefundCount() {
    return couponRefundCount;
  }
  public void setCouponRefundCount(Integer couponRefundCount) {
    this.couponRefundCount = couponRefundCount;
  }
  public String getCouponId() {
    return couponId;
  }
  public void setCouponId(String couponId) {
    this.couponId = couponId;
  }
  public Integer getCouponFee() {
    return couponFee;
  }
  public void setCouponFee(Integer couponFee) {
    this.couponFee = couponFee;
  }
  public List<CouponRefund> getCouponRefunds() {
    return couponRefunds;
  }
  public void setCouponRefunds(List<CouponRefund> couponRefunds) {
    this.couponRefunds = couponRefunds;
  }
  
}
