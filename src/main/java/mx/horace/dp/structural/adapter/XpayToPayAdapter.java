package mx.horace.dp.structural.adapter;

/*
This is an example of object adapter

 */
public class XpayToPayAdapter implements PayD {

    private String custCardNo;
    private String cardOwnerName;
    private String cardExpMonthDate;
    private Integer cVVNo;
    private Double totalAmount;
    private final Xpay xpay;


    public XpayToPayAdapter(Xpay xpay){
        this.xpay=xpay;
        setPayD();
    }

    private void setPayD() {
        setCustCardNo(xpay.getCreditCardNo());
        setCardOwnerName(xpay.getCustomerName());
        setCardExpMonthDate(xpay.getCardExpMonth() + "/" + xpay.getCardExpYear());
        setCCVNo(xpay.getCardCVVNo().intValue());
        setTotalAmount(xpay.getAmount());
    }

    public String getCustCardNo() {
        return custCardNo;
    }

    public String getCardOnwerName() {
        return cardOwnerName;
    }

    public String getCardExpMonthDate() {
        return cardExpMonthDate;
    }

    public Integer getCVVNo() {
        return cVVNo;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }


    
    public void setCustCardNo(String custCardNo) {
        this.custCardNo = custCardNo;
    }

    
    public void setCardOwnerName(String cardOwnerName) {
        this.cardOwnerName = cardOwnerName;
    }

    
    public void setCardExpMonthDate(String cardExpMonthDate) {
        this.cardExpMonthDate = cardExpMonthDate;
    }

    
    public void setCCVNo(Integer cVVNo) {
        this.cVVNo = cVVNo;
    }

    
    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }
}
