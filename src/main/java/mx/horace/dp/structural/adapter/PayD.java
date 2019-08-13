package mx.horace.dp.structural.adapter;

public interface PayD {

     String getCustCardNo();

     String getCardOnwerName();

     String getCardExpMonthDate();

     Integer getCVVNo();

     Double getTotalAmount();

     void setCustCardNo(String custCardNo);

     void setCardOwnerName(String cardOwnerName);

     void setCardExpMonthDate(String cardExpMonthDate);

     void setCCVNo(Integer cVVNo);

     void setTotalAmount(Double totalAmount);

}
