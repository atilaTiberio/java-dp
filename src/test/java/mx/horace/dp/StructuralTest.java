package mx.horace.dp;

import mx.horace.dp.structural.adapter.PayD;
import mx.horace.dp.structural.adapter.Xpay;
import mx.horace.dp.structural.adapter.XpayImpl;
import mx.horace.dp.structural.adapter.XpayToPayAdapter;
import mx.horace.dp.structural.composite.HtmlElement;
import mx.horace.dp.structural.composite.HtmlParentElement;
import mx.horace.dp.structural.composite.HtmlTag;
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

    @Test
    public void testCompositePattern(){

        String html="<html\n" +
                "<body>\n" +
                "<p>Testing html tree structure</p>\n" +
                "<p>Paragraph 2</p>\n" +
                "</body>\n" +
                "</html>\n";

        HtmlTag parentTag= new HtmlParentElement("<html>");
        parentTag.setStartTag("<html");
        parentTag.setEndTag("</html>");

        HtmlTag body= new HtmlParentElement("<body>");
        body.setStartTag("<body>");
        body.setEndTag("</body>");

        parentTag.addChildTag(body);

        HtmlTag bodyChild= new HtmlElement("<p>");
        bodyChild.setStartTag("<p>");
        bodyChild.setTagBody("Testing html tree structure");
        bodyChild.setEndTag("</p>");

        body.addChildTag(bodyChild);

        bodyChild= new HtmlElement("<p>");
        bodyChild.setStartTag("<p>");
        bodyChild.setTagBody("Paragraph 2");
        bodyChild.setEndTag("</p>");
        body.addChildTag(bodyChild);

        parentTag.generateHtml();

        assertEquals(html,parentTag.generateHtml());
    }
}
