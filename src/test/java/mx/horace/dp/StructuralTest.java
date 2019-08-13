package mx.horace.dp;

import mx.horace.dp.structural.adapter.PayD;
import mx.horace.dp.structural.adapter.Xpay;
import mx.horace.dp.structural.adapter.XpayImpl;
import mx.horace.dp.structural.adapter.XpayToPayAdapter;
import org.junit.Test;

import static org.junit.Assert.*;

public class StructuralTest {


    @Test
    public void testAdapterPattern(){
        Xpay xpay= new XpayImpl();

        xpay.setCreditCardNo("000112213123");
        xpay.setCustomerName("Harvan Irsyadi");
        xpay.setCardExpMonth("02");
        xpay.setCardExpYear("2018");
        xpay.setCardCVVNo((short) 111);
        xpay.setAmount(2000000D);

        PayD payD = new XpayToPayAdapter(xpay);

        assertEquals(payD.getCustCardNo(),xpay.getCreditCardNo());
        assertEquals(payD.getCardOnwerName(),xpay.getCustomerName());
        assertEquals(payD.getCardExpMonthDate(),String.join("/",xpay.getCardExpMonth(),xpay.getCardExpYear()));
        /*
            Assert evaluates types so there's a need to get shortValue of both
         */
        assertEquals(payD.getCVVNo().shortValue(),xpay.getCardCVVNo().shortValue());
        assertEquals(payD.getTotalAmount(),xpay.getAmount());

    }
}
