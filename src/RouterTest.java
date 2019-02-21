/**
 *
 *  author  :   Chia Yuan Lin (林家源)
 *
 *  email   :   lo919201@gmail.com
 *
 * **/
import API.GetApiTest;
import API.PostApiTest;
import org.restlet.Application;
import org.restlet.Restlet;
import org.restlet.routing.Router;

public class RouterTest extends Application
{
    @Override
    public Restlet createInboundRoot()
    {
        Router router = new Router(getContext());

        router.attach("/get/{workid}/{msg}", GetApiTest.class);

        router.attach("/post/{workid}", PostApiTest.class);

        return router;
    }
}
