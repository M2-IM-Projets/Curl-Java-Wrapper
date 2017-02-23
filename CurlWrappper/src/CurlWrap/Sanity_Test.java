package CurlWrap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Sanity_Test  {

    @Test
    public void curl_sanity() {
        Curl curl = new Curl("www.perdu.com", 80, true, false);
        assertEquals(200, curl.issueRequestWithHeaders("GET", "/", null));
    }
}