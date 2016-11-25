package me.chanjar.weixin.mp.bean.pay.entity;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * <pre>
 *  代金券退款信息
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
public class CouponRefund {
  
  /**
   * <pre>
   * 退款代金券批次ID
   * coupon_refund_batch_id_$n_$m
   * 否
   * String(20)
   * 100
   * 退款代金券批次ID ,$n为下标，$m为下标，从0开始编号
   * </pre>
   */
  @XStreamAlias("coupon_refund_batch_id_$n_$m")
  private String couponRefundBatchId;
  
  /**
   * <pre>
   * 退款代金券ID
   * coupon_refund_id_$n_$m
   * 否
   * String(20)
   * 10000
   * 退款代金券ID, $n为下标，$m为下标，从0开始编号
   * </pre>
   */
  @XStreamAlias("coupon_refund_id_$n_$m")
  private String couponRefundId;
  
  /**
   * <pre>
   * 单个退款代金券支付金额
   * coupon_refund_fee_$n_$m
   * 否
   * Int
   * 100
   * 单个退款代金券支付金额, $n为下标，$m为下标，从0开始编号
   * </pre>
   */
  @XStreamAlias("coupon_refund_fee_$n_$m")
  private Integer couponRefundFee;

  public String getCouponRefundBatchId() {
    return couponRefundBatchId;
  }

  public void setCouponRefundBatchId(String couponRefundBatchId) {
    this.couponRefundBatchId = couponRefundBatchId;
  }

  public String getCouponRefundId() {
    return couponRefundId;
  }

  public void setCouponRefundId(String couponRefundId) {
    this.couponRefundId = couponRefundId;
  }

  public Integer getCouponRefundFee() {
    return couponRefundFee;
  }

  public void setCouponRefundFee(Integer couponRefundFee) {
    this.couponRefundFee = couponRefundFee;
  }
  
}
