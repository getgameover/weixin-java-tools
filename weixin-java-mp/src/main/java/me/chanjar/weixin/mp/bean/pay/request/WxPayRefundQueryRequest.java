package me.chanjar.weixin.mp.bean.pay.request;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * <pre>
 * 退款订单查询请求对象
 * Created by GGO on 2016-11-24.
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
@XStreamAlias("xml")
public class WxPayRefundQueryRequest extends WxPayBaseRequest {

  /**
   * <pre>
   * 微信订单号
   * transaction_id
   * 四选一
   * String(32)
   * 1009660380201506130728806387
   * 微信的订单号，优先使用
   * </pre>
   */
  @XStreamAlias("transaction_id")
  private String transactionId;

  /**
   * <pre>
   * 商户订单号
   * out_trade_no
   * 四选一
   * String(32)
   * 20150806125346
   * 商户系统内部的订单号。
   * </pre>
   */
  @XStreamAlias("out_trade_no")
  private String outTradeNo;
  
  /**
   * <pre>
   * 商户退款单号
   * out_trade_no
   * 四选一
   * String(32)
   * 20150806125346
   * 商户侧传给微信的退款单号。
   * </pre>
   */
  @XStreamAlias("out_refund_no")
  private String outRefundNo;
  
  /**
   * <pre>
   * 商户退款单号
   * out_trade_no
   * 四选一
   * String(28)
   * 1217752501201407033233368018
   * 微信生成的退款单号，在申请退款接口有返回 。
   * </pre>
   */
  @XStreamAlias("refund_id")
  private String refundId;

  public String getTransactionId() {
    return this.transactionId;
  }

  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }

  public String getOutTradeNo() {
    return this.outTradeNo;
  }

  public void setOutTradeNo(String outTradeNo) {
    this.outTradeNo = outTradeNo;
  }

  public String getOutRefundNo() {
	return outRefundNo;
  }

  public void setOutRefundNo(String outRefundNo) {
	this.outRefundNo = outRefundNo;
  }

  public String getRefundId() {
	return refundId;
  }

  public void setRefundId(String refundId) {
	this.refundId = refundId;
  }
  
}
