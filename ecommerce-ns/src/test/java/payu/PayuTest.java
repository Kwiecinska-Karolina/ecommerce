package payu;

import org.junit.jupiter.api.Test;

public class PayuTest {
    @Test
    void creatingNewOrder(){
        Payu payu = thereIsPayu();

        OrderCreateRequest request = thereIsExampleOrderCreateRequest();
        OrderCreateRequest response = payu.handler(request);

        assertNotNull(resonse.getRedirectUri());
        assertNotNull(resonse.getOrderId());

    }
}
