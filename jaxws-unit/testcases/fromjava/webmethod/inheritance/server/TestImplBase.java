package fromjava.webmethod.inheritance.server;

import javax.jws.WebService;
import javax.jws.WebMethod;

/**
 * @author Jitendra Kotamraju
 */
public class TestImplBase extends TestImplBaseBase {

    // Not a web method
    public String method2(String str) {
        return str;
    }

    @WebMethod(exclude=true)
    public String method5(String str) {
        return str;
    }

    @WebMethod
    public String method6(String str) {
        return str;
    }
}
