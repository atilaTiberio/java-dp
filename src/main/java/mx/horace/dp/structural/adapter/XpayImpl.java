package mx.horace.dp.structural.adapter;

public class XpayImpl implements Xpay {

    private String creditCardNo;
    private String customerName;
    private String cardExpMonth;
    private String cardExpYear;
    private Short cardCVVNo;
    private Double amount;

    
    public String getCreditCardNo() {
        return creditCardNo;
    }

    
    public String getCustomerName() {
        return customerName;
    }

    
    public String getCardExpMonth() {
        return cardExpMonth;
    }

    
    public String getCardExpYear() {
        return cardExpYear;
    }

    
    public Short getCardCVVNo() {
        return cardCVVNo;
    }

    
    public Double getAmount() {
        return amount;
    }

    
    public void setCreditCardNo(String creditCardNo) {
        this.creditCardNo = creditCardNo;
    }

    
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    
    public void setCardExpMonth(String cardExpMonth) {
        this.cardExpMonth = cardExpMonth;
    }

    
    public void setCardExpYear(String cardExpYear) {
        this.cardExpYear = cardExpYear;
    }

    
    public void setCardCVVNo(Short cardCVVNo) {
        this.cardCVVNo = cardCVVNo;
    }

    
    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
