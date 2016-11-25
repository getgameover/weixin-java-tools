package me.chanjar.weixin.mp.bean.pay.result;

import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;

import me.chanjar.weixin.mp.bean.pay.entity.Coupon;

/**
 * <pre>
 *  查询退款 返回结果对象
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
public class WxPayRefundQueryResult extends WxPayBaseResult {

	/**
	 * <pre>
	 * 设备号
	 * device_info
	 * 否
	 * String(32)
	 * 013467007045764
	 * 微信支付分配的终端设备号，
	 * </pre>
	 */
	@XStreamAlias("device_info")
	private String deviceInfo;
	/**
	 * <pre>
	 * 微信支付订单号
	 * transaction_id
	 * 是
	 * String(28)
	 * 4007752501201407033233368018
	 * 微信支付订单号
	 * </pre>
	 */
	@XStreamAlias("transaction_id")
	private String transactionId;

	/**
	 * <pre>
	 * 商户订单号
	 * out_trade_no
	 * 是
	 * String(32)
	 * 20150806125346
	 * 商户系统的订单号，与请求一致。
	 * </pre>
	 */
	@XStreamAlias("out_trade_no")
	private String outTradeNo;
	/**
	 * <pre>
	 * 商户退款单号
	 * out_refund_no
	 * 是
	 * String(32)
	 * 20150806125346
	 * 商户退款单号
	 * </pre>
	 */
	@XStreamAlias("out_refund_no")
	private String outRefundNo;
	/**
	 * <pre>
	 * 微信退款单号
	 * refund_id
	 * 是
	 * String(28)
	 * 2007752501201407033233368018
	 * 微信退款单号
	 * </pre>
	 */
	@XStreamAlias("refund_id")
	private String refundId;
	/**
	 * <pre>
	 * 退款渠道
	 * refund_channel
	 * 否
	 * String(16)
	 * ORIGINAL 
	 * <li>ORIGINAL—原路退款 
	 * <li>BALANCE—退回到余额
	 * </pre>
	 */
	@XStreamAlias("refund_channel")
	private String refundChannel;

	/**
	 * <pre>
	 * 申请退款金额
	 * refund_fee
	 * 是
	 * Int
	 * 100 
	 * 退款总金额,单位为分,可以做部分退款
	 * </pre>
	 */
	@XStreamAlias("refund_fee")
	private Integer refundFee;

	/**
	 * <pre>
	 * 退款金额
	 * settlement_refund_fee
	 * 否
	 * Int
	 * 100 
	 * 去掉非充值代金券退款金额后的退款金额，退款金额=申请退款金额-非充值代金券退款金额，退款金额<=申请退款金额
	 * </pre>
	 */
	@XStreamAlias("settlement_refund_fee")
	private Integer settlementRefundFee;

	/**
	 * <pre>
	 * 订单金额
	 * total_fee
	 * 是
	 * Int
	 * 100
	 * 订单总金额，单位为分
	 * </pre>
	 */
	@XStreamAlias("total_fee")
	private Integer totalFee;

	/**
	 * <pre>
	 * 应结订单金额
	 * settlement_total_fee
	 * 否
	 * Int
	 * 100
	 * 应结订单金额=订单金额-非充值代金券金额，应结订单金额<=订单金额。
	 * </pre>
	 */
	@XStreamAlias("settlement_total_fee")
	private Integer settlementTotalFee;

	/**
	 * <pre>
	 * 订单金额货币种类
	 * fee_type
	 * 否
	 * String(8)
	 * CNY
	 * 货币类型，符合ISO 4217标准的三位字母代码，默认人民币：CNY，其他值列表详见货币类型
	 * </pre>
	 */
	@XStreamAlias("fee_type")
	private String feeType;

	/**
	 * <pre>
	 * 现金支付金额
	 * cash_fee
	 * 是
	 * Int
	 * 100
	 * 现金支付金额，单位为分，只能为整数，详见支付金额
	 * </pre>
	 */
	@XStreamAlias("cash_fee")
	private Integer cashFee;

	/**
	 * <pre>
	 * 现金退款金额
	 * cash_refund_fee
	 * 是
	 * Int
	 * 100
	 * 现金退款金额，单位为分，只能为整数，详见支付金额
	 * </pre>
	 */
	@XStreamAlias("cash_refund_fee")
	private Integer cashRefundFee;

	private List<Coupon> coupons;

	public Integer getTotalFee() {
		return this.totalFee;
	}

	public void setTotalFee(Integer totalFee) {
		this.totalFee = totalFee;
	}

	public Integer getSettlementTotalFee() {
		return this.settlementTotalFee;
	}

	public void setSettlementTotalFee(Integer settlementTotalFee) {
		this.settlementTotalFee = settlementTotalFee;
	}

	public String getFeeType() {
		return this.feeType;
	}

	public void setFeeType(String feeType) {
		this.feeType = feeType;
	}

	public Integer getCashFee() {
		return this.cashFee;
	}

	public void setCashFee(Integer cashFee) {
		this.cashFee = cashFee;
	}

	public List<Coupon> getCoupons() {
		return this.coupons;
	}

	public void setCoupons(List<Coupon> coupons) {
		this.coupons = coupons;
	}

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

	public String getDeviceInfo() {
		return deviceInfo;
	}

	public void setDeviceInfo(String deviceInfo) {
		this.deviceInfo = deviceInfo;
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

	public String getRefundChannel() {
		return refundChannel;
	}

	public void setRefundChannel(String refundChannel) {
		this.refundChannel = refundChannel;
	}

	public Integer getRefundFee() {
		return refundFee;
	}

	public void setRefundFee(Integer refundFee) {
		this.refundFee = refundFee;
	}

	public Integer getSettlementRefundFee() {
		return settlementRefundFee;
	}

	public void setSettlementRefundFee(Integer settlementRefundFee) {
		this.settlementRefundFee = settlementRefundFee;
	}

	public Integer getCashRefundFee() {
		return cashRefundFee;
	}

	public void setCashRefundFee(Integer cashRefundFee) {
		this.cashRefundFee = cashRefundFee;
	}

}
